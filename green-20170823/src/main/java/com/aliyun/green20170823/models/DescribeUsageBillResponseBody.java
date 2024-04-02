// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeUsageBillResponseBody extends TeaModel {
    @NameInMap("BillList")
    public java.util.List<DescribeUsageBillResponseBodyBillList> billList;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeUsageBillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUsageBillResponseBody self = new DescribeUsageBillResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUsageBillResponseBody setBillList(java.util.List<DescribeUsageBillResponseBodyBillList> billList) {
        this.billList = billList;
        return this;
    }
    public java.util.List<DescribeUsageBillResponseBodyBillList> getBillList() {
        return this.billList;
    }

    public DescribeUsageBillResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeUsageBillResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeUsageBillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUsageBillResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeUsageBillResponseBodyBillList extends TeaModel {
        @NameInMap("BizType")
        public String bizType;

        @NameInMap("ConfirmCount")
        public Long confirmCount;

        @NameInMap("Day")
        public String day;

        @NameInMap("FreeCount")
        public Long freeCount;

        @NameInMap("Region")
        public String region;

        @NameInMap("ReviewCount")
        public Long reviewCount;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("SubUid")
        public String subUid;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeUsageBillResponseBodyBillList build(java.util.Map<String, ?> map) throws Exception {
            DescribeUsageBillResponseBodyBillList self = new DescribeUsageBillResponseBodyBillList();
            return TeaModel.build(map, self);
        }

        public DescribeUsageBillResponseBodyBillList setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public DescribeUsageBillResponseBodyBillList setConfirmCount(Long confirmCount) {
            this.confirmCount = confirmCount;
            return this;
        }
        public Long getConfirmCount() {
            return this.confirmCount;
        }

        public DescribeUsageBillResponseBodyBillList setDay(String day) {
            this.day = day;
            return this;
        }
        public String getDay() {
            return this.day;
        }

        public DescribeUsageBillResponseBodyBillList setFreeCount(Long freeCount) {
            this.freeCount = freeCount;
            return this;
        }
        public Long getFreeCount() {
            return this.freeCount;
        }

        public DescribeUsageBillResponseBodyBillList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeUsageBillResponseBodyBillList setReviewCount(Long reviewCount) {
            this.reviewCount = reviewCount;
            return this;
        }
        public Long getReviewCount() {
            return this.reviewCount;
        }

        public DescribeUsageBillResponseBodyBillList setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public DescribeUsageBillResponseBodyBillList setSubUid(String subUid) {
            this.subUid = subUid;
            return this;
        }
        public String getSubUid() {
            return this.subUid;
        }

        public DescribeUsageBillResponseBodyBillList setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
