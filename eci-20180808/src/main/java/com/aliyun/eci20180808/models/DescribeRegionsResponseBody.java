// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeRegionsResponseBody extends TeaModel {
    /**
     * <p>The list of regions.</p>
     */
    @NameInMap("Regions")
    public java.util.List<Regions> regions;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>89945DD3-9072-47D0-A318-353284CFC7B3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsResponseBody self = new DescribeRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRegionsResponseBody setRegions(java.util.List<Regions> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<Regions> getRegions() {
        return this.regions;
    }

    public DescribeRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class Regions extends TeaModel {
        /**
         * <p>The list of recommended zones.</p>
         */
        @NameInMap("RecommendZones")
        public java.util.List<String> recommendZones;

        /**
         * <p>The endpoint for the region.</p>
         * 
         * <strong>example:</strong>
         * <p>eci.aliyuncs.com</p>
         */
        @NameInMap("RegionEndpoint")
        public String regionEndpoint;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The list of unavailable zones.</p>
         */
        @NameInMap("UnavailableZones")
        public java.util.List<String> unavailableZones;

        /**
         * <p>The queried zones.</p>
         */
        @NameInMap("Zones")
        public java.util.List<String> zones;

        public static Regions build(java.util.Map<String, ?> map) throws Exception {
            Regions self = new Regions();
            return TeaModel.build(map, self);
        }

        public Regions setRecommendZones(java.util.List<String> recommendZones) {
            this.recommendZones = recommendZones;
            return this;
        }
        public java.util.List<String> getRecommendZones() {
            return this.recommendZones;
        }

        public Regions setRegionEndpoint(String regionEndpoint) {
            this.regionEndpoint = regionEndpoint;
            return this;
        }
        public String getRegionEndpoint() {
            return this.regionEndpoint;
        }

        public Regions setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public Regions setUnavailableZones(java.util.List<String> unavailableZones) {
            this.unavailableZones = unavailableZones;
            return this;
        }
        public java.util.List<String> getUnavailableZones() {
            return this.unavailableZones;
        }

        public Regions setZones(java.util.List<String> zones) {
            this.zones = zones;
            return this;
        }
        public java.util.List<String> getZones() {
            return this.zones;
        }

    }

}
