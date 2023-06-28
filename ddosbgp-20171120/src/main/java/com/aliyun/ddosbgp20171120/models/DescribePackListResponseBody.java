// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class DescribePackListResponseBody extends TeaModel {
    @NameInMap("PackList")
    public java.util.List<DescribePackListResponseBodyPackList> packList;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribePackListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePackListResponseBody self = new DescribePackListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePackListResponseBody setPackList(java.util.List<DescribePackListResponseBodyPackList> packList) {
        this.packList = packList;
        return this;
    }
    public java.util.List<DescribePackListResponseBodyPackList> getPackList() {
        return this.packList;
    }

    public DescribePackListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePackListResponseBodyPackListPackConfig extends TeaModel {
        @NameInMap("IpAdvanceThre")
        public Integer ipAdvanceThre;

        @NameInMap("IpBasicThre")
        public Integer ipBasicThre;

        @NameInMap("IpSpec")
        public Integer ipSpec;

        @NameInMap("PackAdvThre")
        public Integer packAdvThre;

        @NameInMap("PackBasicThre")
        public Integer packBasicThre;

        public static DescribePackListResponseBodyPackListPackConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribePackListResponseBodyPackListPackConfig self = new DescribePackListResponseBodyPackListPackConfig();
            return TeaModel.build(map, self);
        }

        public DescribePackListResponseBodyPackListPackConfig setIpAdvanceThre(Integer ipAdvanceThre) {
            this.ipAdvanceThre = ipAdvanceThre;
            return this;
        }
        public Integer getIpAdvanceThre() {
            return this.ipAdvanceThre;
        }

        public DescribePackListResponseBodyPackListPackConfig setIpBasicThre(Integer ipBasicThre) {
            this.ipBasicThre = ipBasicThre;
            return this;
        }
        public Integer getIpBasicThre() {
            return this.ipBasicThre;
        }

        public DescribePackListResponseBodyPackListPackConfig setIpSpec(Integer ipSpec) {
            this.ipSpec = ipSpec;
            return this;
        }
        public Integer getIpSpec() {
            return this.ipSpec;
        }

        public DescribePackListResponseBodyPackListPackConfig setPackAdvThre(Integer packAdvThre) {
            this.packAdvThre = packAdvThre;
            return this;
        }
        public Integer getPackAdvThre() {
            return this.packAdvThre;
        }

        public DescribePackListResponseBodyPackListPackConfig setPackBasicThre(Integer packBasicThre) {
            this.packBasicThre = packBasicThre;
            return this;
        }
        public Integer getPackBasicThre() {
            return this.packBasicThre;
        }

    }

    public static class DescribePackListResponseBodyPackList extends TeaModel {
        @NameInMap("AvailableDeleteBlackholeCount")
        public Integer availableDeleteBlackholeCount;

        @NameInMap("PackConfig")
        public DescribePackListResponseBodyPackListPackConfig packConfig;

        @NameInMap("PackId")
        public String packId;

        @NameInMap("Region")
        public String region;

        public static DescribePackListResponseBodyPackList build(java.util.Map<String, ?> map) throws Exception {
            DescribePackListResponseBodyPackList self = new DescribePackListResponseBodyPackList();
            return TeaModel.build(map, self);
        }

        public DescribePackListResponseBodyPackList setAvailableDeleteBlackholeCount(Integer availableDeleteBlackholeCount) {
            this.availableDeleteBlackholeCount = availableDeleteBlackholeCount;
            return this;
        }
        public Integer getAvailableDeleteBlackholeCount() {
            return this.availableDeleteBlackholeCount;
        }

        public DescribePackListResponseBodyPackList setPackConfig(DescribePackListResponseBodyPackListPackConfig packConfig) {
            this.packConfig = packConfig;
            return this;
        }
        public DescribePackListResponseBodyPackListPackConfig getPackConfig() {
            return this.packConfig;
        }

        public DescribePackListResponseBodyPackList setPackId(String packId) {
            this.packId = packId;
            return this;
        }
        public String getPackId() {
            return this.packId;
        }

        public DescribePackListResponseBodyPackList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
