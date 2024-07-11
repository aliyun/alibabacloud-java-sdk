// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeMultiZoneAvailableRegionsResponseBody extends TeaModel {
    @NameInMap("Regions")
    public DescribeMultiZoneAvailableRegionsResponseBodyRegions regions;

    /**
     * <strong>example:</strong>
     * <p>F03BB273-45EE-4B6C-A329-A6E6A8D15856</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMultiZoneAvailableRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMultiZoneAvailableRegionsResponseBody self = new DescribeMultiZoneAvailableRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMultiZoneAvailableRegionsResponseBody setRegions(DescribeMultiZoneAvailableRegionsResponseBodyRegions regions) {
        this.regions = regions;
        return this;
    }
    public DescribeMultiZoneAvailableRegionsResponseBodyRegions getRegions() {
        return this.regions;
    }

    public DescribeMultiZoneAvailableRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMultiZoneAvailableRegionsResponseBodyRegionsRegionAvailableCombinesAvailableCombineZones extends TeaModel {
        @NameInMap("Zone")
        public java.util.List<String> zone;

        public static DescribeMultiZoneAvailableRegionsResponseBodyRegionsRegionAvailableCombinesAvailableCombineZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiZoneAvailableRegionsResponseBodyRegionsRegionAvailableCombinesAvailableCombineZones self = new DescribeMultiZoneAvailableRegionsResponseBodyRegionsRegionAvailableCombinesAvailableCombineZones();
            return TeaModel.build(map, self);
        }

        public DescribeMultiZoneAvailableRegionsResponseBodyRegionsRegionAvailableCombinesAvailableCombineZones setZone(java.util.List<String> zone) {
            this.zone = zone;
            return this;
        }
        public java.util.List<String> getZone() {
            return this.zone;
        }

    }

    public static class DescribeMultiZoneAvailableRegionsResponseBodyRegionsRegionAvailableCombinesAvailableCombine extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cn-shenzhen-****-aliyun</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Zones")
        public DescribeMultiZoneAvailableRegionsResponseBodyRegionsRegionAvailableCombinesAvailableCombineZones zones;

        public static DescribeMultiZoneAvailableRegionsResponseBodyRegionsRegionAvailableCombinesAvailableCombine build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiZoneAvailableRegionsResponseBodyRegionsRegionAvailableCombinesAvailableCombine self = new DescribeMultiZoneAvailableRegionsResponseBodyRegionsRegionAvailableCombinesAvailableCombine();
            return TeaModel.build(map, self);
        }

        public DescribeMultiZoneAvailableRegionsResponseBodyRegionsRegionAvailableCombinesAvailableCombine setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeMultiZoneAvailableRegionsResponseBodyRegionsRegionAvailableCombinesAvailableCombine setZones(DescribeMultiZoneAvailableRegionsResponseBodyRegionsRegionAvailableCombinesAvailableCombineZones zones) {
            this.zones = zones;
            return this;
        }
        public DescribeMultiZoneAvailableRegionsResponseBodyRegionsRegionAvailableCombinesAvailableCombineZones getZones() {
            return this.zones;
        }

    }

    public static class DescribeMultiZoneAvailableRegionsResponseBodyRegionsRegionAvailableCombines extends TeaModel {
        @NameInMap("AvailableCombine")
        public java.util.List<DescribeMultiZoneAvailableRegionsResponseBodyRegionsRegionAvailableCombinesAvailableCombine> availableCombine;

        public static DescribeMultiZoneAvailableRegionsResponseBodyRegionsRegionAvailableCombines build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiZoneAvailableRegionsResponseBodyRegionsRegionAvailableCombines self = new DescribeMultiZoneAvailableRegionsResponseBodyRegionsRegionAvailableCombines();
            return TeaModel.build(map, self);
        }

        public DescribeMultiZoneAvailableRegionsResponseBodyRegionsRegionAvailableCombines setAvailableCombine(java.util.List<DescribeMultiZoneAvailableRegionsResponseBodyRegionsRegionAvailableCombinesAvailableCombine> availableCombine) {
            this.availableCombine = availableCombine;
            return this;
        }
        public java.util.List<DescribeMultiZoneAvailableRegionsResponseBodyRegionsRegionAvailableCombinesAvailableCombine> getAvailableCombine() {
            return this.availableCombine;
        }

    }

    public static class DescribeMultiZoneAvailableRegionsResponseBodyRegionsRegion extends TeaModel {
        @NameInMap("AvailableCombines")
        public DescribeMultiZoneAvailableRegionsResponseBodyRegionsRegionAvailableCombines availableCombines;

        @NameInMap("LocalName")
        public String localName;

        /**
         * <strong>example:</strong>
         * <p>hbase.aliyuncs.com</p>
         */
        @NameInMap("RegionEndpoint")
        public String regionEndpoint;

        /**
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static DescribeMultiZoneAvailableRegionsResponseBodyRegionsRegion build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiZoneAvailableRegionsResponseBodyRegionsRegion self = new DescribeMultiZoneAvailableRegionsResponseBodyRegionsRegion();
            return TeaModel.build(map, self);
        }

        public DescribeMultiZoneAvailableRegionsResponseBodyRegionsRegion setAvailableCombines(DescribeMultiZoneAvailableRegionsResponseBodyRegionsRegionAvailableCombines availableCombines) {
            this.availableCombines = availableCombines;
            return this;
        }
        public DescribeMultiZoneAvailableRegionsResponseBodyRegionsRegionAvailableCombines getAvailableCombines() {
            return this.availableCombines;
        }

        public DescribeMultiZoneAvailableRegionsResponseBodyRegionsRegion setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescribeMultiZoneAvailableRegionsResponseBodyRegionsRegion setRegionEndpoint(String regionEndpoint) {
            this.regionEndpoint = regionEndpoint;
            return this;
        }
        public String getRegionEndpoint() {
            return this.regionEndpoint;
        }

        public DescribeMultiZoneAvailableRegionsResponseBodyRegionsRegion setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeMultiZoneAvailableRegionsResponseBodyRegions extends TeaModel {
        @NameInMap("Region")
        public java.util.List<DescribeMultiZoneAvailableRegionsResponseBodyRegionsRegion> region;

        public static DescribeMultiZoneAvailableRegionsResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiZoneAvailableRegionsResponseBodyRegions self = new DescribeMultiZoneAvailableRegionsResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public DescribeMultiZoneAvailableRegionsResponseBodyRegions setRegion(java.util.List<DescribeMultiZoneAvailableRegionsResponseBodyRegionsRegion> region) {
            this.region = region;
            return this;
        }
        public java.util.List<DescribeMultiZoneAvailableRegionsResponseBodyRegionsRegion> getRegion() {
            return this.region;
        }

    }

}
