// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

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

    public static class DescribeRegionsResponseBodyRegionsRDSRegion extends TeaModel {
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeRegionsResponseBodyRegionsRDSRegion build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyRegionsRDSRegion self = new DescribeRegionsResponseBodyRegionsRDSRegion();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyRegionsRDSRegion setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeRegionsResponseBodyRegionsRDSRegion setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeRegionsResponseBodyRegions extends TeaModel {
        @NameInMap("RDSRegion")
        public java.util.List<DescribeRegionsResponseBodyRegionsRDSRegion> RDSRegion;

        public static DescribeRegionsResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyRegions self = new DescribeRegionsResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyRegions setRDSRegion(java.util.List<DescribeRegionsResponseBodyRegionsRDSRegion> RDSRegion) {
            this.RDSRegion = RDSRegion;
            return this;
        }
        public java.util.List<DescribeRegionsResponseBodyRegionsRDSRegion> getRDSRegion() {
            return this.RDSRegion;
        }

    }

}
