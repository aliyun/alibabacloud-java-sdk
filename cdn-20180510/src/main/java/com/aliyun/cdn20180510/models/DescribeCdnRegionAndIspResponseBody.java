// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnRegionAndIspResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Regions")
    public DescribeCdnRegionAndIspResponseBodyRegions regions;

    @NameInMap("Isps")
    public DescribeCdnRegionAndIspResponseBodyIsps isps;

    public static DescribeCdnRegionAndIspResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnRegionAndIspResponseBody self = new DescribeCdnRegionAndIspResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnRegionAndIspResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCdnRegionAndIspResponseBody setRegions(DescribeCdnRegionAndIspResponseBodyRegions regions) {
        this.regions = regions;
        return this;
    }
    public DescribeCdnRegionAndIspResponseBodyRegions getRegions() {
        return this.regions;
    }

    public DescribeCdnRegionAndIspResponseBody setIsps(DescribeCdnRegionAndIspResponseBodyIsps isps) {
        this.isps = isps;
        return this;
    }
    public DescribeCdnRegionAndIspResponseBodyIsps getIsps() {
        return this.isps;
    }

    public static class DescribeCdnRegionAndIspResponseBodyRegionsRegion extends TeaModel {
        @NameInMap("NameEn")
        public String nameEn;

        @NameInMap("NameZh")
        public String nameZh;

        public static DescribeCdnRegionAndIspResponseBodyRegionsRegion build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnRegionAndIspResponseBodyRegionsRegion self = new DescribeCdnRegionAndIspResponseBodyRegionsRegion();
            return TeaModel.build(map, self);
        }

        public DescribeCdnRegionAndIspResponseBodyRegionsRegion setNameEn(String nameEn) {
            this.nameEn = nameEn;
            return this;
        }
        public String getNameEn() {
            return this.nameEn;
        }

        public DescribeCdnRegionAndIspResponseBodyRegionsRegion setNameZh(String nameZh) {
            this.nameZh = nameZh;
            return this;
        }
        public String getNameZh() {
            return this.nameZh;
        }

    }

    public static class DescribeCdnRegionAndIspResponseBodyRegions extends TeaModel {
        @NameInMap("Region")
        public java.util.List<DescribeCdnRegionAndIspResponseBodyRegionsRegion> region;

        public static DescribeCdnRegionAndIspResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnRegionAndIspResponseBodyRegions self = new DescribeCdnRegionAndIspResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public DescribeCdnRegionAndIspResponseBodyRegions setRegion(java.util.List<DescribeCdnRegionAndIspResponseBodyRegionsRegion> region) {
            this.region = region;
            return this;
        }
        public java.util.List<DescribeCdnRegionAndIspResponseBodyRegionsRegion> getRegion() {
            return this.region;
        }

    }

    public static class DescribeCdnRegionAndIspResponseBodyIspsIsp extends TeaModel {
        @NameInMap("NameEn")
        public String nameEn;

        @NameInMap("NameZh")
        public String nameZh;

        public static DescribeCdnRegionAndIspResponseBodyIspsIsp build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnRegionAndIspResponseBodyIspsIsp self = new DescribeCdnRegionAndIspResponseBodyIspsIsp();
            return TeaModel.build(map, self);
        }

        public DescribeCdnRegionAndIspResponseBodyIspsIsp setNameEn(String nameEn) {
            this.nameEn = nameEn;
            return this;
        }
        public String getNameEn() {
            return this.nameEn;
        }

        public DescribeCdnRegionAndIspResponseBodyIspsIsp setNameZh(String nameZh) {
            this.nameZh = nameZh;
            return this;
        }
        public String getNameZh() {
            return this.nameZh;
        }

    }

    public static class DescribeCdnRegionAndIspResponseBodyIsps extends TeaModel {
        @NameInMap("Isp")
        public java.util.List<DescribeCdnRegionAndIspResponseBodyIspsIsp> isp;

        public static DescribeCdnRegionAndIspResponseBodyIsps build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnRegionAndIspResponseBodyIsps self = new DescribeCdnRegionAndIspResponseBodyIsps();
            return TeaModel.build(map, self);
        }

        public DescribeCdnRegionAndIspResponseBodyIsps setIsp(java.util.List<DescribeCdnRegionAndIspResponseBodyIspsIsp> isp) {
            this.isp = isp;
            return this;
        }
        public java.util.List<DescribeCdnRegionAndIspResponseBodyIspsIsp> getIsp() {
            return this.isp;
        }

    }

}
