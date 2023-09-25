// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20160801.models;

import com.aliyun.tea.*;

public class DescribeSubscriptionObjectModifyStatusResponseBody extends TeaModel {
    @NameInMap("Detail")
    public DescribeSubscriptionObjectModifyStatusResponseBodyDetail detail;

    @NameInMap("Percent")
    public String percent;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static DescribeSubscriptionObjectModifyStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubscriptionObjectModifyStatusResponseBody self = new DescribeSubscriptionObjectModifyStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSubscriptionObjectModifyStatusResponseBody setDetail(DescribeSubscriptionObjectModifyStatusResponseBodyDetail detail) {
        this.detail = detail;
        return this;
    }
    public DescribeSubscriptionObjectModifyStatusResponseBodyDetail getDetail() {
        return this.detail;
    }

    public DescribeSubscriptionObjectModifyStatusResponseBody setPercent(String percent) {
        this.percent = percent;
        return this;
    }
    public String getPercent() {
        return this.percent;
    }

    public DescribeSubscriptionObjectModifyStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSubscriptionObjectModifyStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class DescribeSubscriptionObjectModifyStatusResponseBodyDetailCheckItem extends TeaModel {
        @NameInMap("CheckStatus")
        public String checkStatus;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("ItemName")
        public String itemName;

        @NameInMap("RepairMethod")
        public String repairMethod;

        public static DescribeSubscriptionObjectModifyStatusResponseBodyDetailCheckItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubscriptionObjectModifyStatusResponseBodyDetailCheckItem self = new DescribeSubscriptionObjectModifyStatusResponseBodyDetailCheckItem();
            return TeaModel.build(map, self);
        }

        public DescribeSubscriptionObjectModifyStatusResponseBodyDetailCheckItem setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public DescribeSubscriptionObjectModifyStatusResponseBodyDetailCheckItem setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSubscriptionObjectModifyStatusResponseBodyDetailCheckItem setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public DescribeSubscriptionObjectModifyStatusResponseBodyDetailCheckItem setRepairMethod(String repairMethod) {
            this.repairMethod = repairMethod;
            return this;
        }
        public String getRepairMethod() {
            return this.repairMethod;
        }

    }

    public static class DescribeSubscriptionObjectModifyStatusResponseBodyDetail extends TeaModel {
        @NameInMap("CheckItem")
        public java.util.List<DescribeSubscriptionObjectModifyStatusResponseBodyDetailCheckItem> checkItem;

        public static DescribeSubscriptionObjectModifyStatusResponseBodyDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubscriptionObjectModifyStatusResponseBodyDetail self = new DescribeSubscriptionObjectModifyStatusResponseBodyDetail();
            return TeaModel.build(map, self);
        }

        public DescribeSubscriptionObjectModifyStatusResponseBodyDetail setCheckItem(java.util.List<DescribeSubscriptionObjectModifyStatusResponseBodyDetailCheckItem> checkItem) {
            this.checkItem = checkItem;
            return this;
        }
        public java.util.List<DescribeSubscriptionObjectModifyStatusResponseBodyDetailCheckItem> getCheckItem() {
            return this.checkItem;
        }

    }

}
