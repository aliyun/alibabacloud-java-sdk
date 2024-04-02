// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeOpenApiRcpStatsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StatList")
    public java.util.List<DescribeOpenApiRcpStatsResponseBodyStatList> statList;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeOpenApiRcpStatsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOpenApiRcpStatsResponseBody self = new DescribeOpenApiRcpStatsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOpenApiRcpStatsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOpenApiRcpStatsResponseBody setStatList(java.util.List<DescribeOpenApiRcpStatsResponseBodyStatList> statList) {
        this.statList = statList;
        return this;
    }
    public java.util.List<DescribeOpenApiRcpStatsResponseBodyStatList> getStatList() {
        return this.statList;
    }

    public DescribeOpenApiRcpStatsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeOpenApiRcpStatsResponseBodyStatList extends TeaModel {
        @NameInMap("BlockCount")
        public Integer blockCount;

        @NameInMap("Date")
        public String date;

        @NameInMap("PassCount")
        public Integer passCount;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("ReviewCount")
        public Integer reviewCount;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("TotalDuration")
        public Integer totalDuration;

        public static DescribeOpenApiRcpStatsResponseBodyStatList build(java.util.Map<String, ?> map) throws Exception {
            DescribeOpenApiRcpStatsResponseBodyStatList self = new DescribeOpenApiRcpStatsResponseBodyStatList();
            return TeaModel.build(map, self);
        }

        public DescribeOpenApiRcpStatsResponseBodyStatList setBlockCount(Integer blockCount) {
            this.blockCount = blockCount;
            return this;
        }
        public Integer getBlockCount() {
            return this.blockCount;
        }

        public DescribeOpenApiRcpStatsResponseBodyStatList setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public DescribeOpenApiRcpStatsResponseBodyStatList setPassCount(Integer passCount) {
            this.passCount = passCount;
            return this;
        }
        public Integer getPassCount() {
            return this.passCount;
        }

        public DescribeOpenApiRcpStatsResponseBodyStatList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeOpenApiRcpStatsResponseBodyStatList setReviewCount(Integer reviewCount) {
            this.reviewCount = reviewCount;
            return this;
        }
        public Integer getReviewCount() {
            return this.reviewCount;
        }

        public DescribeOpenApiRcpStatsResponseBodyStatList setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public DescribeOpenApiRcpStatsResponseBodyStatList setTotalDuration(Integer totalDuration) {
            this.totalDuration = totalDuration;
            return this;
        }
        public Integer getTotalDuration() {
            return this.totalDuration;
        }

    }

}
