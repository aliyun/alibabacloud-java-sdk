// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class DescribeRegionsOutput extends TeaModel {
    @NameInMap("Regions")
    public DescribeRegionsOutputRegions regions;

    public static DescribeRegionsOutput build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsOutput self = new DescribeRegionsOutput();
        return TeaModel.build(map, self);
    }

    public DescribeRegionsOutput setRegions(DescribeRegionsOutputRegions regions) {
        this.regions = regions;
        return this;
    }
    public DescribeRegionsOutputRegions getRegions() {
        return this.regions;
    }

    public static class DescribeRegionsOutputRegionsRegion extends TeaModel {
        @NameInMap("LocalName")
        public String localName;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeRegionsOutputRegionsRegion build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsOutputRegionsRegion self = new DescribeRegionsOutputRegionsRegion();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsOutputRegionsRegion setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescribeRegionsOutputRegionsRegion setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeRegionsOutputRegions extends TeaModel {
        @NameInMap("Region")
        public java.util.List<DescribeRegionsOutputRegionsRegion> region;

        public static DescribeRegionsOutputRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsOutputRegions self = new DescribeRegionsOutputRegions();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsOutputRegions setRegion(java.util.List<DescribeRegionsOutputRegionsRegion> region) {
            this.region = region;
            return this;
        }
        public java.util.List<DescribeRegionsOutputRegionsRegion> getRegion() {
            return this.region;
        }

    }

}
