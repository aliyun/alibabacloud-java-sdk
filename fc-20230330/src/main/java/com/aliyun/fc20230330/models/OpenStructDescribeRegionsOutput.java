// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class OpenStructDescribeRegionsOutput extends TeaModel {
    @NameInMap("Regions")
    public OpenStructDescribeRegionsOutputRegions regions;

    public static OpenStructDescribeRegionsOutput build(java.util.Map<String, ?> map) throws Exception {
        OpenStructDescribeRegionsOutput self = new OpenStructDescribeRegionsOutput();
        return TeaModel.build(map, self);
    }

    public OpenStructDescribeRegionsOutput setRegions(OpenStructDescribeRegionsOutputRegions regions) {
        this.regions = regions;
        return this;
    }
    public OpenStructDescribeRegionsOutputRegions getRegions() {
        return this.regions;
    }

    public static class OpenStructDescribeRegionsOutputRegionsRegion extends TeaModel {
        @NameInMap("LocalName")
        public String localName;

        @NameInMap("RegionId")
        public String regionId;

        public static OpenStructDescribeRegionsOutputRegionsRegion build(java.util.Map<String, ?> map) throws Exception {
            OpenStructDescribeRegionsOutputRegionsRegion self = new OpenStructDescribeRegionsOutputRegionsRegion();
            return TeaModel.build(map, self);
        }

        public OpenStructDescribeRegionsOutputRegionsRegion setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public OpenStructDescribeRegionsOutputRegionsRegion setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class OpenStructDescribeRegionsOutputRegions extends TeaModel {
        @NameInMap("Region")
        public java.util.List<OpenStructDescribeRegionsOutputRegionsRegion> region;

        public static OpenStructDescribeRegionsOutputRegions build(java.util.Map<String, ?> map) throws Exception {
            OpenStructDescribeRegionsOutputRegions self = new OpenStructDescribeRegionsOutputRegions();
            return TeaModel.build(map, self);
        }

        public OpenStructDescribeRegionsOutputRegions setRegion(java.util.List<OpenStructDescribeRegionsOutputRegionsRegion> region) {
            this.region = region;
            return this;
        }
        public java.util.List<OpenStructDescribeRegionsOutputRegionsRegion> getRegion() {
            return this.region;
        }

    }

}
