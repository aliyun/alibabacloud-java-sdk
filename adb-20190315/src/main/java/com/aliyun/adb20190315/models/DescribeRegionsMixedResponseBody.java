// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeRegionsMixedResponseBody extends TeaModel {
    @NameInMap("Regions")
    public DescribeRegionsMixedResponseBodyRegions regions;

    /**
     * <strong>example:</strong>
     * <p>2E9450FF-F8AD-54C6-B3C3-009FBD7C0700</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRegionsMixedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsMixedResponseBody self = new DescribeRegionsMixedResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRegionsMixedResponseBody setRegions(DescribeRegionsMixedResponseBodyRegions regions) {
        this.regions = regions;
        return this;
    }
    public DescribeRegionsMixedResponseBodyRegions getRegions() {
        return this.regions;
    }

    public DescribeRegionsMixedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRegionsMixedResponseBodyRegionsRegion extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>3.0</p>
         */
        @NameInMap("Version")
        public String version;

        public static DescribeRegionsMixedResponseBodyRegionsRegion build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsMixedResponseBodyRegionsRegion self = new DescribeRegionsMixedResponseBodyRegionsRegion();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsMixedResponseBodyRegionsRegion setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeRegionsMixedResponseBodyRegionsRegion setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeRegionsMixedResponseBodyRegions extends TeaModel {
        @NameInMap("Region")
        public java.util.List<DescribeRegionsMixedResponseBodyRegionsRegion> region;

        public static DescribeRegionsMixedResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsMixedResponseBodyRegions self = new DescribeRegionsMixedResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsMixedResponseBodyRegions setRegion(java.util.List<DescribeRegionsMixedResponseBodyRegionsRegion> region) {
            this.region = region;
            return this;
        }
        public java.util.List<DescribeRegionsMixedResponseBodyRegionsRegion> getRegion() {
            return this.region;
        }

    }

}
