// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class DescribeSubscriptionInitializeProgressResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<DescribeSubscriptionInitializeProgressResponseBodyItems> items;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeSubscriptionInitializeProgressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubscriptionInitializeProgressResponseBody self = new DescribeSubscriptionInitializeProgressResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSubscriptionInitializeProgressResponseBody setItems(java.util.List<DescribeSubscriptionInitializeProgressResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeSubscriptionInitializeProgressResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeSubscriptionInitializeProgressResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSubscriptionInitializeProgressResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeSubscriptionInitializeProgressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSubscriptionInitializeProgressResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeSubscriptionInitializeProgressResponseBodyItems extends TeaModel {
        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("Status")
        public String status;

        @NameInMap("SubscriptionId")
        public String subscriptionId;

        public static DescribeSubscriptionInitializeProgressResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubscriptionInitializeProgressResponseBodyItems self = new DescribeSubscriptionInitializeProgressResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeSubscriptionInitializeProgressResponseBodyItems setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribeSubscriptionInitializeProgressResponseBodyItems setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeSubscriptionInitializeProgressResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSubscriptionInitializeProgressResponseBodyItems setSubscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }
        public String getSubscriptionId() {
            return this.subscriptionId;
        }

    }

}
