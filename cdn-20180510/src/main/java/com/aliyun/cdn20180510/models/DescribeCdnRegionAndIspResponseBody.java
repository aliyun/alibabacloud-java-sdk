// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnRegionAndIspResponseBody extends TeaModel {
    /**
     * <p>The list of ISPs.</p>
     */
    @NameInMap("Isps")
    public DescribeCdnRegionAndIspResponseBodyIsps isps;

    /**
     * <p>The list of regions.</p>
     */
    @NameInMap("Regions")
    public DescribeCdnRegionAndIspResponseBodyRegions regions;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCdnRegionAndIspResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnRegionAndIspResponseBody self = new DescribeCdnRegionAndIspResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnRegionAndIspResponseBody setIsps(DescribeCdnRegionAndIspResponseBodyIsps isps) {
        this.isps = isps;
        return this;
    }
    public DescribeCdnRegionAndIspResponseBodyIsps getIsps() {
        return this.isps;
    }

    public DescribeCdnRegionAndIspResponseBody setRegions(DescribeCdnRegionAndIspResponseBodyRegions regions) {
        this.regions = regions;
        return this;
    }
    public DescribeCdnRegionAndIspResponseBodyRegions getRegions() {
        return this.regions;
    }

    public DescribeCdnRegionAndIspResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCdnRegionAndIspResponseBodyIspsIsp extends TeaModel {
        /**
         * <p>The English name of the ISP.</p>
         */
        @NameInMap("NameEn")
        public String nameEn;

        /**
         * <p>The Chinese name of the ISP.</p>
         */
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

    public static class DescribeCdnRegionAndIspResponseBodyRegionsRegion extends TeaModel {
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

}
