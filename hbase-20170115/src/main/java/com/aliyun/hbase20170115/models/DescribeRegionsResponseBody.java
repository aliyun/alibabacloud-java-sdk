// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class DescribeRegionsResponseBody extends TeaModel {
    @NameInMap("Regions")
    public DescribeRegionsResponseBodyRegions regions;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsResponseBody self = new DescribeRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRegionsResponseBody setRegions(DescribeRegionsResponseBodyRegions regions) {
        this.regions = regions;
        return this;
    }
    public DescribeRegionsResponseBodyRegions getRegions() {
        return this.regions;
    }

    public DescribeRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRegionsResponseBodyRegionsRegionZonesZone extends TeaModel {
        @NameInMap("VpcEnabled")
        public Boolean vpcEnabled;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeRegionsResponseBodyRegionsRegionZonesZone build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyRegionsRegionZonesZone self = new DescribeRegionsResponseBodyRegionsRegionZonesZone();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyRegionsRegionZonesZone setVpcEnabled(Boolean vpcEnabled) {
            this.vpcEnabled = vpcEnabled;
            return this;
        }
        public Boolean getVpcEnabled() {
            return this.vpcEnabled;
        }

        public DescribeRegionsResponseBodyRegionsRegionZonesZone setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeRegionsResponseBodyRegionsRegionZones extends TeaModel {
        @NameInMap("Zone")
        public java.util.List<DescribeRegionsResponseBodyRegionsRegionZonesZone> zone;

        public static DescribeRegionsResponseBodyRegionsRegionZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyRegionsRegionZones self = new DescribeRegionsResponseBodyRegionsRegionZones();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyRegionsRegionZones setZone(java.util.List<DescribeRegionsResponseBodyRegionsRegionZonesZone> zone) {
            this.zone = zone;
            return this;
        }
        public java.util.List<DescribeRegionsResponseBodyRegionsRegionZonesZone> getZone() {
            return this.zone;
        }

    }

    public static class DescribeRegionsResponseBodyRegionsRegion extends TeaModel {
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Zones")
        public DescribeRegionsResponseBodyRegionsRegionZones zones;

        public static DescribeRegionsResponseBodyRegionsRegion build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyRegionsRegion self = new DescribeRegionsResponseBodyRegionsRegion();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyRegionsRegion setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeRegionsResponseBodyRegionsRegion setZones(DescribeRegionsResponseBodyRegionsRegionZones zones) {
            this.zones = zones;
            return this;
        }
        public DescribeRegionsResponseBodyRegionsRegionZones getZones() {
            return this.zones;
        }

    }

    public static class DescribeRegionsResponseBodyRegions extends TeaModel {
        @NameInMap("Region")
        public java.util.List<DescribeRegionsResponseBodyRegionsRegion> region;

        public static DescribeRegionsResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyRegions self = new DescribeRegionsResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyRegions setRegion(java.util.List<DescribeRegionsResponseBodyRegionsRegion> region) {
            this.region = region;
            return this;
        }
        public java.util.List<DescribeRegionsResponseBodyRegionsRegion> getRegion() {
            return this.region;
        }

    }

}
