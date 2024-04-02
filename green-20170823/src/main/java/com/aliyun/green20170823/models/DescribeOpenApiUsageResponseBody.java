// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeOpenApiUsageResponseBody extends TeaModel {
    @NameInMap("OpenApiUsageList")
    public java.util.List<DescribeOpenApiUsageResponseBodyOpenApiUsageList> openApiUsageList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeOpenApiUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOpenApiUsageResponseBody self = new DescribeOpenApiUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOpenApiUsageResponseBody setOpenApiUsageList(java.util.List<DescribeOpenApiUsageResponseBodyOpenApiUsageList> openApiUsageList) {
        this.openApiUsageList = openApiUsageList;
        return this;
    }
    public java.util.List<DescribeOpenApiUsageResponseBodyOpenApiUsageList> getOpenApiUsageList() {
        return this.openApiUsageList;
    }

    public DescribeOpenApiUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOpenApiUsageResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeOpenApiUsageResponseBodyOpenApiUsageList extends TeaModel {
        @NameInMap("BlockCount")
        public Integer blockCount;

        @NameInMap("BlockDuration")
        public Integer blockDuration;

        @NameInMap("Date")
        public String date;

        @NameInMap("InnerTotalCount")
        public Integer innerTotalCount;

        @NameInMap("OuterTotalCount")
        public Integer outerTotalCount;

        @NameInMap("PassCount")
        public Integer passCount;

        @NameInMap("PassDuration")
        public Integer passDuration;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("ReviewCount")
        public Integer reviewCount;

        @NameInMap("ReviewDuration")
        public Integer reviewDuration;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("TotalDuration")
        public Integer totalDuration;

        public static DescribeOpenApiUsageResponseBodyOpenApiUsageList build(java.util.Map<String, ?> map) throws Exception {
            DescribeOpenApiUsageResponseBodyOpenApiUsageList self = new DescribeOpenApiUsageResponseBodyOpenApiUsageList();
            return TeaModel.build(map, self);
        }

        public DescribeOpenApiUsageResponseBodyOpenApiUsageList setBlockCount(Integer blockCount) {
            this.blockCount = blockCount;
            return this;
        }
        public Integer getBlockCount() {
            return this.blockCount;
        }

        public DescribeOpenApiUsageResponseBodyOpenApiUsageList setBlockDuration(Integer blockDuration) {
            this.blockDuration = blockDuration;
            return this;
        }
        public Integer getBlockDuration() {
            return this.blockDuration;
        }

        public DescribeOpenApiUsageResponseBodyOpenApiUsageList setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public DescribeOpenApiUsageResponseBodyOpenApiUsageList setInnerTotalCount(Integer innerTotalCount) {
            this.innerTotalCount = innerTotalCount;
            return this;
        }
        public Integer getInnerTotalCount() {
            return this.innerTotalCount;
        }

        public DescribeOpenApiUsageResponseBodyOpenApiUsageList setOuterTotalCount(Integer outerTotalCount) {
            this.outerTotalCount = outerTotalCount;
            return this;
        }
        public Integer getOuterTotalCount() {
            return this.outerTotalCount;
        }

        public DescribeOpenApiUsageResponseBodyOpenApiUsageList setPassCount(Integer passCount) {
            this.passCount = passCount;
            return this;
        }
        public Integer getPassCount() {
            return this.passCount;
        }

        public DescribeOpenApiUsageResponseBodyOpenApiUsageList setPassDuration(Integer passDuration) {
            this.passDuration = passDuration;
            return this;
        }
        public Integer getPassDuration() {
            return this.passDuration;
        }

        public DescribeOpenApiUsageResponseBodyOpenApiUsageList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeOpenApiUsageResponseBodyOpenApiUsageList setReviewCount(Integer reviewCount) {
            this.reviewCount = reviewCount;
            return this;
        }
        public Integer getReviewCount() {
            return this.reviewCount;
        }

        public DescribeOpenApiUsageResponseBodyOpenApiUsageList setReviewDuration(Integer reviewDuration) {
            this.reviewDuration = reviewDuration;
            return this;
        }
        public Integer getReviewDuration() {
            return this.reviewDuration;
        }

        public DescribeOpenApiUsageResponseBodyOpenApiUsageList setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public DescribeOpenApiUsageResponseBodyOpenApiUsageList setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public DescribeOpenApiUsageResponseBodyOpenApiUsageList setTotalDuration(Integer totalDuration) {
            this.totalDuration = totalDuration;
            return this;
        }
        public Integer getTotalDuration() {
            return this.totalDuration;
        }

    }

}
