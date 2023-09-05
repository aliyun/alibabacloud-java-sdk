// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeRegionsResponseBody extends TeaModel {
    /**
     * <p>Details about the regions.</p>
     */
    @NameInMap("Regions")
    public java.util.List<DescribeRegionsResponseBodyRegions> regions;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsResponseBody self = new DescribeRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRegionsResponseBody setRegions(java.util.List<DescribeRegionsResponseBodyRegions> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<DescribeRegionsResponseBodyRegions> getRegions() {
        return this.regions;
    }

    public DescribeRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRegionsResponseBodyRegionsZones extends TeaModel {
        /**
         * <p>The name of the zone.</p>
         */
        @NameInMap("LocalName")
        public String localName;

        /**
         * <p>The type of resource list.</p>
         */
        @NameInMap("ResourceTypes")
        public java.util.List<String> resourceTypes;

        /**
         * <p>The ID of the zone.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeRegionsResponseBodyRegionsZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyRegionsZones self = new DescribeRegionsResponseBodyRegionsZones();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyRegionsZones setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescribeRegionsResponseBodyRegionsZones setResourceTypes(java.util.List<String> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }
        public java.util.List<String> getResourceTypes() {
            return this.resourceTypes;
        }

        public DescribeRegionsResponseBodyRegionsZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeRegionsResponseBodyRegions extends TeaModel {
        /**
         * <p>The name of the region.</p>
         */
        @NameInMap("LocalName")
        public String localName;

        /**
         * <p>The endpoint of the region.</p>
         */
        @NameInMap("RegionEndpoint")
        public String regionEndpoint;

        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>Details about the zones.</p>
         */
        @NameInMap("Zones")
        public java.util.List<DescribeRegionsResponseBodyRegionsZones> zones;

        public static DescribeRegionsResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyRegions self = new DescribeRegionsResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyRegions setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescribeRegionsResponseBodyRegions setRegionEndpoint(String regionEndpoint) {
            this.regionEndpoint = regionEndpoint;
            return this;
        }
        public String getRegionEndpoint() {
            return this.regionEndpoint;
        }

        public DescribeRegionsResponseBodyRegions setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeRegionsResponseBodyRegions setZones(java.util.List<DescribeRegionsResponseBodyRegionsZones> zones) {
            this.zones = zones;
            return this;
        }
        public java.util.List<DescribeRegionsResponseBodyRegionsZones> getZones() {
            return this.zones;
        }

    }

}
