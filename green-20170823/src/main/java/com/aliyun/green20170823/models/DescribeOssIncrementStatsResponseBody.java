// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeOssIncrementStatsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StatList")
    public java.util.List<DescribeOssIncrementStatsResponseBodyStatList> statList;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeOssIncrementStatsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssIncrementStatsResponseBody self = new DescribeOssIncrementStatsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOssIncrementStatsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOssIncrementStatsResponseBody setStatList(java.util.List<DescribeOssIncrementStatsResponseBodyStatList> statList) {
        this.statList = statList;
        return this;
    }
    public java.util.List<DescribeOssIncrementStatsResponseBodyStatList> getStatList() {
        return this.statList;
    }

    public DescribeOssIncrementStatsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeOssIncrementStatsResponseBodyStatList extends TeaModel {
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

        @NameInMap("Scene")
        public String scene;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeOssIncrementStatsResponseBodyStatList build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssIncrementStatsResponseBodyStatList self = new DescribeOssIncrementStatsResponseBodyStatList();
            return TeaModel.build(map, self);
        }

        public DescribeOssIncrementStatsResponseBodyStatList setBlockCount(Integer blockCount) {
            this.blockCount = blockCount;
            return this;
        }
        public Integer getBlockCount() {
            return this.blockCount;
        }

        public DescribeOssIncrementStatsResponseBodyStatList setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public DescribeOssIncrementStatsResponseBodyStatList setPassCount(Integer passCount) {
            this.passCount = passCount;
            return this;
        }
        public Integer getPassCount() {
            return this.passCount;
        }

        public DescribeOssIncrementStatsResponseBodyStatList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeOssIncrementStatsResponseBodyStatList setReviewCount(Integer reviewCount) {
            this.reviewCount = reviewCount;
            return this;
        }
        public Integer getReviewCount() {
            return this.reviewCount;
        }

        public DescribeOssIncrementStatsResponseBodyStatList setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public DescribeOssIncrementStatsResponseBodyStatList setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
