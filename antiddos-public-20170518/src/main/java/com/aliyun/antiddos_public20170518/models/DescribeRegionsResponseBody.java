// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeRegionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Regions")
    public java.util.List<DescribeRegionsResponseBodyRegions> regions;

    public static DescribeRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsResponseBody self = new DescribeRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRegionsResponseBody setRegions(java.util.List<DescribeRegionsResponseBodyRegions> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<DescribeRegionsResponseBodyRegions> getRegions() {
        return this.regions;
    }

    public static class DescribeRegionsResponseBodyRegions extends TeaModel {
        @NameInMap("RegionEnName")
        public String regionEnName;

        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("RegionNo")
        public String regionNo;

        @NameInMap("RegionNoAlias")
        public String regionNoAlias;

        public static DescribeRegionsResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyRegions self = new DescribeRegionsResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyRegions setRegionEnName(String regionEnName) {
            this.regionEnName = regionEnName;
            return this;
        }
        public String getRegionEnName() {
            return this.regionEnName;
        }

        public DescribeRegionsResponseBodyRegions setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public DescribeRegionsResponseBodyRegions setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeRegionsResponseBodyRegions setRegionNoAlias(String regionNoAlias) {
            this.regionNoAlias = regionNoAlias;
            return this;
        }
        public String getRegionNoAlias() {
            return this.regionNoAlias;
        }

    }

}
