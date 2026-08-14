// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebAreaBlockConfigsResponseBody extends TeaModel {
    @NameInMap("AreaBlockConfigs")
    public java.util.List<DescribeWebAreaBlockConfigsResponseBodyAreaBlockConfigs> areaBlockConfigs;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeWebAreaBlockConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebAreaBlockConfigsResponseBody self = new DescribeWebAreaBlockConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWebAreaBlockConfigsResponseBody setAreaBlockConfigs(java.util.List<DescribeWebAreaBlockConfigsResponseBodyAreaBlockConfigs> areaBlockConfigs) {
        this.areaBlockConfigs = areaBlockConfigs;
        return this;
    }
    public java.util.List<DescribeWebAreaBlockConfigsResponseBodyAreaBlockConfigs> getAreaBlockConfigs() {
        return this.areaBlockConfigs;
    }

    public DescribeWebAreaBlockConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeWebAreaBlockConfigsResponseBodyAreaBlockConfigsRegionList extends TeaModel {
        @NameInMap("Block")
        public Integer block;

        @NameInMap("Region")
        public String region;

        public static DescribeWebAreaBlockConfigsResponseBodyAreaBlockConfigsRegionList build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebAreaBlockConfigsResponseBodyAreaBlockConfigsRegionList self = new DescribeWebAreaBlockConfigsResponseBodyAreaBlockConfigsRegionList();
            return TeaModel.build(map, self);
        }

        public DescribeWebAreaBlockConfigsResponseBodyAreaBlockConfigsRegionList setBlock(Integer block) {
            this.block = block;
            return this;
        }
        public Integer getBlock() {
            return this.block;
        }

        public DescribeWebAreaBlockConfigsResponseBodyAreaBlockConfigsRegionList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

    public static class DescribeWebAreaBlockConfigsResponseBodyAreaBlockConfigs extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("RegionList")
        public java.util.List<DescribeWebAreaBlockConfigsResponseBodyAreaBlockConfigsRegionList> regionList;

        public static DescribeWebAreaBlockConfigsResponseBodyAreaBlockConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebAreaBlockConfigsResponseBodyAreaBlockConfigs self = new DescribeWebAreaBlockConfigsResponseBodyAreaBlockConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeWebAreaBlockConfigsResponseBodyAreaBlockConfigs setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeWebAreaBlockConfigsResponseBodyAreaBlockConfigs setRegionList(java.util.List<DescribeWebAreaBlockConfigsResponseBodyAreaBlockConfigsRegionList> regionList) {
            this.regionList = regionList;
            return this;
        }
        public java.util.List<DescribeWebAreaBlockConfigsResponseBodyAreaBlockConfigsRegionList> getRegionList() {
            return this.regionList;
        }

    }

}
