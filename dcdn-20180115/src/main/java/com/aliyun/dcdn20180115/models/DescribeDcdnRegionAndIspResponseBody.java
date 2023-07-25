// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnRegionAndIspResponseBody extends TeaModel {
    @NameInMap("Isps")
    public DescribeDcdnRegionAndIspResponseBodyIsps isps;

    /**
     * <p>The list of regions.</p>
     */
    @NameInMap("Regions")
    public DescribeDcdnRegionAndIspResponseBodyRegions regions;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnRegionAndIspResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnRegionAndIspResponseBody self = new DescribeDcdnRegionAndIspResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnRegionAndIspResponseBody setIsps(DescribeDcdnRegionAndIspResponseBodyIsps isps) {
        this.isps = isps;
        return this;
    }
    public DescribeDcdnRegionAndIspResponseBodyIsps getIsps() {
        return this.isps;
    }

    public DescribeDcdnRegionAndIspResponseBody setRegions(DescribeDcdnRegionAndIspResponseBodyRegions regions) {
        this.regions = regions;
        return this;
    }
    public DescribeDcdnRegionAndIspResponseBodyRegions getRegions() {
        return this.regions;
    }

    public DescribeDcdnRegionAndIspResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDcdnRegionAndIspResponseBodyIspsIsp extends TeaModel {
        @NameInMap("NameEn")
        public String nameEn;

        @NameInMap("NameZh")
        public String nameZh;

        public static DescribeDcdnRegionAndIspResponseBodyIspsIsp build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnRegionAndIspResponseBodyIspsIsp self = new DescribeDcdnRegionAndIspResponseBodyIspsIsp();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnRegionAndIspResponseBodyIspsIsp setNameEn(String nameEn) {
            this.nameEn = nameEn;
            return this;
        }
        public String getNameEn() {
            return this.nameEn;
        }

        public DescribeDcdnRegionAndIspResponseBodyIspsIsp setNameZh(String nameZh) {
            this.nameZh = nameZh;
            return this;
        }
        public String getNameZh() {
            return this.nameZh;
        }

    }

    public static class DescribeDcdnRegionAndIspResponseBodyIsps extends TeaModel {
        @NameInMap("Isp")
        public java.util.List<DescribeDcdnRegionAndIspResponseBodyIspsIsp> isp;

        public static DescribeDcdnRegionAndIspResponseBodyIsps build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnRegionAndIspResponseBodyIsps self = new DescribeDcdnRegionAndIspResponseBodyIsps();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnRegionAndIspResponseBodyIsps setIsp(java.util.List<DescribeDcdnRegionAndIspResponseBodyIspsIsp> isp) {
            this.isp = isp;
            return this;
        }
        public java.util.List<DescribeDcdnRegionAndIspResponseBodyIspsIsp> getIsp() {
            return this.isp;
        }

    }

    public static class DescribeDcdnRegionAndIspResponseBodyRegionsRegion extends TeaModel {
        /**
         * <p>The English name of the region.</p>
         */
        @NameInMap("NameEn")
        public String nameEn;

        /**
         * <p>The Chinese name of the region.</p>
         */
        @NameInMap("NameZh")
        public String nameZh;

        public static DescribeDcdnRegionAndIspResponseBodyRegionsRegion build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnRegionAndIspResponseBodyRegionsRegion self = new DescribeDcdnRegionAndIspResponseBodyRegionsRegion();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnRegionAndIspResponseBodyRegionsRegion setNameEn(String nameEn) {
            this.nameEn = nameEn;
            return this;
        }
        public String getNameEn() {
            return this.nameEn;
        }

        public DescribeDcdnRegionAndIspResponseBodyRegionsRegion setNameZh(String nameZh) {
            this.nameZh = nameZh;
            return this;
        }
        public String getNameZh() {
            return this.nameZh;
        }

    }

    public static class DescribeDcdnRegionAndIspResponseBodyRegions extends TeaModel {
        @NameInMap("Region")
        public java.util.List<DescribeDcdnRegionAndIspResponseBodyRegionsRegion> region;

        public static DescribeDcdnRegionAndIspResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnRegionAndIspResponseBodyRegions self = new DescribeDcdnRegionAndIspResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnRegionAndIspResponseBodyRegions setRegion(java.util.List<DescribeDcdnRegionAndIspResponseBodyRegionsRegion> region) {
            this.region = region;
            return this;
        }
        public java.util.List<DescribeDcdnRegionAndIspResponseBodyRegionsRegion> getRegion() {
            return this.region;
        }

    }

}
