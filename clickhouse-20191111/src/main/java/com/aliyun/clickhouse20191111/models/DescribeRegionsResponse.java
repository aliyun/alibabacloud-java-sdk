// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeRegionsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Regions")
    @Validation(required = true)
    public DescribeRegionsResponseRegions regions;

    public static DescribeRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsResponse self = new DescribeRegionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRegionsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRegionsResponse setRegions(DescribeRegionsResponseRegions regions) {
        this.regions = regions;
        return this;
    }
    public DescribeRegionsResponseRegions getRegions() {
        return this.regions;
    }

    public static class DescribeRegionsResponseRegionsRegionZonesZone extends TeaModel {
        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("VpcEnabled")
        @Validation(required = true)
        public Boolean vpcEnabled;

        public static DescribeRegionsResponseRegionsRegionZonesZone build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseRegionsRegionZonesZone self = new DescribeRegionsResponseRegionsRegionZonesZone();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseRegionsRegionZonesZone setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeRegionsResponseRegionsRegionZonesZone setVpcEnabled(Boolean vpcEnabled) {
            this.vpcEnabled = vpcEnabled;
            return this;
        }
        public Boolean getVpcEnabled() {
            return this.vpcEnabled;
        }

    }

    public static class DescribeRegionsResponseRegionsRegionZones extends TeaModel {
        @NameInMap("Zone")
        @Validation(required = true)
        public java.util.List<DescribeRegionsResponseRegionsRegionZonesZone> zone;

        public static DescribeRegionsResponseRegionsRegionZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseRegionsRegionZones self = new DescribeRegionsResponseRegionsRegionZones();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseRegionsRegionZones setZone(java.util.List<DescribeRegionsResponseRegionsRegionZonesZone> zone) {
            this.zone = zone;
            return this;
        }
        public java.util.List<DescribeRegionsResponseRegionsRegionZonesZone> getZone() {
            return this.zone;
        }

    }

    public static class DescribeRegionsResponseRegionsRegion extends TeaModel {
        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("Zones")
        @Validation(required = true)
        public DescribeRegionsResponseRegionsRegionZones zones;

        public static DescribeRegionsResponseRegionsRegion build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseRegionsRegion self = new DescribeRegionsResponseRegionsRegion();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseRegionsRegion setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeRegionsResponseRegionsRegion setZones(DescribeRegionsResponseRegionsRegionZones zones) {
            this.zones = zones;
            return this;
        }
        public DescribeRegionsResponseRegionsRegionZones getZones() {
            return this.zones;
        }

    }

    public static class DescribeRegionsResponseRegions extends TeaModel {
        @NameInMap("Region")
        @Validation(required = true)
        public java.util.List<DescribeRegionsResponseRegionsRegion> region;

        public static DescribeRegionsResponseRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseRegions self = new DescribeRegionsResponseRegions();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseRegions setRegion(java.util.List<DescribeRegionsResponseRegionsRegion> region) {
            this.region = region;
            return this;
        }
        public java.util.List<DescribeRegionsResponseRegionsRegion> getRegion() {
            return this.region;
        }

    }

}
