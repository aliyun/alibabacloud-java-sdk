// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnUserBillTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("BillTypeData")
    public DescribeCdnUserBillTypeResponseBodyBillTypeData billTypeData;

    public static DescribeCdnUserBillTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnUserBillTypeResponseBody self = new DescribeCdnUserBillTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnUserBillTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCdnUserBillTypeResponseBody setBillTypeData(DescribeCdnUserBillTypeResponseBodyBillTypeData billTypeData) {
        this.billTypeData = billTypeData;
        return this;
    }
    public DescribeCdnUserBillTypeResponseBodyBillTypeData getBillTypeData() {
        return this.billTypeData;
    }

    public static class DescribeCdnUserBillTypeResponseBodyBillTypeDataBillTypeDataItem extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("BillingCycle")
        public String billingCycle;

        @NameInMap("Product")
        public String product;

        @NameInMap("BillType")
        public String billType;

        @NameInMap("Dimension")
        public String dimension;

        public static DescribeCdnUserBillTypeResponseBodyBillTypeDataBillTypeDataItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnUserBillTypeResponseBodyBillTypeDataBillTypeDataItem self = new DescribeCdnUserBillTypeResponseBodyBillTypeDataBillTypeDataItem();
            return TeaModel.build(map, self);
        }

        public DescribeCdnUserBillTypeResponseBodyBillTypeDataBillTypeDataItem setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeCdnUserBillTypeResponseBodyBillTypeDataBillTypeDataItem setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeCdnUserBillTypeResponseBodyBillTypeDataBillTypeDataItem setBillingCycle(String billingCycle) {
            this.billingCycle = billingCycle;
            return this;
        }
        public String getBillingCycle() {
            return this.billingCycle;
        }

        public DescribeCdnUserBillTypeResponseBodyBillTypeDataBillTypeDataItem setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public DescribeCdnUserBillTypeResponseBodyBillTypeDataBillTypeDataItem setBillType(String billType) {
            this.billType = billType;
            return this;
        }
        public String getBillType() {
            return this.billType;
        }

        public DescribeCdnUserBillTypeResponseBodyBillTypeDataBillTypeDataItem setDimension(String dimension) {
            this.dimension = dimension;
            return this;
        }
        public String getDimension() {
            return this.dimension;
        }

    }

    public static class DescribeCdnUserBillTypeResponseBodyBillTypeData extends TeaModel {
        @NameInMap("BillTypeDataItem")
        public java.util.List<DescribeCdnUserBillTypeResponseBodyBillTypeDataBillTypeDataItem> billTypeDataItem;

        public static DescribeCdnUserBillTypeResponseBodyBillTypeData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnUserBillTypeResponseBodyBillTypeData self = new DescribeCdnUserBillTypeResponseBodyBillTypeData();
            return TeaModel.build(map, self);
        }

        public DescribeCdnUserBillTypeResponseBodyBillTypeData setBillTypeDataItem(java.util.List<DescribeCdnUserBillTypeResponseBodyBillTypeDataBillTypeDataItem> billTypeDataItem) {
            this.billTypeDataItem = billTypeDataItem;
            return this;
        }
        public java.util.List<DescribeCdnUserBillTypeResponseBodyBillTypeDataBillTypeDataItem> getBillTypeDataItem() {
            return this.billTypeDataItem;
        }

    }

}
