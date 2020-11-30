// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class DescribePackListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PackList")
    @Validation(required = true)
    public java.util.List<DescribePackListResponsePackList> packList;

    public static DescribePackListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePackListResponse self = new DescribePackListResponse();
        return TeaModel.build(map, self);
    }

    public DescribePackListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePackListResponse setPackList(java.util.List<DescribePackListResponsePackList> packList) {
        this.packList = packList;
        return this;
    }
    public java.util.List<DescribePackListResponsePackList> getPackList() {
        return this.packList;
    }

    public static class DescribePackListResponsePackListPackConfig extends TeaModel {
        @NameInMap("PackAdvThre")
        @Validation(required = true)
        public Integer packAdvThre;

        @NameInMap("IpAdvanceThre")
        @Validation(required = true)
        public Integer ipAdvanceThre;

        @NameInMap("IpBasicThre")
        @Validation(required = true)
        public Integer ipBasicThre;

        @NameInMap("PackBasicThre")
        @Validation(required = true)
        public Integer packBasicThre;

        @NameInMap("IpSpec")
        @Validation(required = true)
        public Integer ipSpec;

        public static DescribePackListResponsePackListPackConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribePackListResponsePackListPackConfig self = new DescribePackListResponsePackListPackConfig();
            return TeaModel.build(map, self);
        }

        public DescribePackListResponsePackListPackConfig setPackAdvThre(Integer packAdvThre) {
            this.packAdvThre = packAdvThre;
            return this;
        }
        public Integer getPackAdvThre() {
            return this.packAdvThre;
        }

        public DescribePackListResponsePackListPackConfig setIpAdvanceThre(Integer ipAdvanceThre) {
            this.ipAdvanceThre = ipAdvanceThre;
            return this;
        }
        public Integer getIpAdvanceThre() {
            return this.ipAdvanceThre;
        }

        public DescribePackListResponsePackListPackConfig setIpBasicThre(Integer ipBasicThre) {
            this.ipBasicThre = ipBasicThre;
            return this;
        }
        public Integer getIpBasicThre() {
            return this.ipBasicThre;
        }

        public DescribePackListResponsePackListPackConfig setPackBasicThre(Integer packBasicThre) {
            this.packBasicThre = packBasicThre;
            return this;
        }
        public Integer getPackBasicThre() {
            return this.packBasicThre;
        }

        public DescribePackListResponsePackListPackConfig setIpSpec(Integer ipSpec) {
            this.ipSpec = ipSpec;
            return this;
        }
        public Integer getIpSpec() {
            return this.ipSpec;
        }

    }

    public static class DescribePackListResponsePackList extends TeaModel {
        @NameInMap("AvailableDeleteBlackholeCount")
        @Validation(required = true)
        public Integer availableDeleteBlackholeCount;

        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        @NameInMap("PackId")
        @Validation(required = true)
        public String packId;

        @NameInMap("PackConfig")
        @Validation(required = true)
        public DescribePackListResponsePackListPackConfig packConfig;

        public static DescribePackListResponsePackList build(java.util.Map<String, ?> map) throws Exception {
            DescribePackListResponsePackList self = new DescribePackListResponsePackList();
            return TeaModel.build(map, self);
        }

        public DescribePackListResponsePackList setAvailableDeleteBlackholeCount(Integer availableDeleteBlackholeCount) {
            this.availableDeleteBlackholeCount = availableDeleteBlackholeCount;
            return this;
        }
        public Integer getAvailableDeleteBlackholeCount() {
            return this.availableDeleteBlackholeCount;
        }

        public DescribePackListResponsePackList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribePackListResponsePackList setPackId(String packId) {
            this.packId = packId;
            return this;
        }
        public String getPackId() {
            return this.packId;
        }

        public DescribePackListResponsePackList setPackConfig(DescribePackListResponsePackListPackConfig packConfig) {
            this.packConfig = packConfig;
            return this;
        }
        public DescribePackListResponsePackListPackConfig getPackConfig() {
            return this.packConfig;
        }

    }

}
