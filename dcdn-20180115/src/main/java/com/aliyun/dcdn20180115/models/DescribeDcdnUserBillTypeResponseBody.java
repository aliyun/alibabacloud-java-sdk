// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserBillTypeResponseBody extends TeaModel {
    @NameInMap("BillTypeData")
    public DescribeDcdnUserBillTypeResponseBodyBillTypeData billTypeData;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnUserBillTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnUserBillTypeResponseBody self = new DescribeDcdnUserBillTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnUserBillTypeResponseBody setBillTypeData(DescribeDcdnUserBillTypeResponseBodyBillTypeData billTypeData) {
        this.billTypeData = billTypeData;
        return this;
    }
    public DescribeDcdnUserBillTypeResponseBodyBillTypeData getBillTypeData() {
        return this.billTypeData;
    }

    public DescribeDcdnUserBillTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDcdnUserBillTypeResponseBodyBillTypeDataBillTypeDataItem extends TeaModel {
        @NameInMap("BillType")
        public String billType;

        @NameInMap("BillingCycle")
        public String billingCycle;

        @NameInMap("Dimension")
        public String dimension;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Product")
        public String product;

        @NameInMap("StartTime")
        public String startTime;

        public static DescribeDcdnUserBillTypeResponseBodyBillTypeDataBillTypeDataItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnUserBillTypeResponseBodyBillTypeDataBillTypeDataItem self = new DescribeDcdnUserBillTypeResponseBodyBillTypeDataBillTypeDataItem();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnUserBillTypeResponseBodyBillTypeDataBillTypeDataItem setBillType(String billType) {
            this.billType = billType;
            return this;
        }
        public String getBillType() {
            return this.billType;
        }

        public DescribeDcdnUserBillTypeResponseBodyBillTypeDataBillTypeDataItem setBillingCycle(String billingCycle) {
            this.billingCycle = billingCycle;
            return this;
        }
        public String getBillingCycle() {
            return this.billingCycle;
        }

        public DescribeDcdnUserBillTypeResponseBodyBillTypeDataBillTypeDataItem setDimension(String dimension) {
            this.dimension = dimension;
            return this;
        }
        public String getDimension() {
            return this.dimension;
        }

        public DescribeDcdnUserBillTypeResponseBodyBillTypeDataBillTypeDataItem setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeDcdnUserBillTypeResponseBodyBillTypeDataBillTypeDataItem setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public DescribeDcdnUserBillTypeResponseBodyBillTypeDataBillTypeDataItem setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class DescribeDcdnUserBillTypeResponseBodyBillTypeData extends TeaModel {
        @NameInMap("BillTypeDataItem")
        public java.util.List<DescribeDcdnUserBillTypeResponseBodyBillTypeDataBillTypeDataItem> billTypeDataItem;

        public static DescribeDcdnUserBillTypeResponseBodyBillTypeData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnUserBillTypeResponseBodyBillTypeData self = new DescribeDcdnUserBillTypeResponseBodyBillTypeData();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnUserBillTypeResponseBodyBillTypeData setBillTypeDataItem(java.util.List<DescribeDcdnUserBillTypeResponseBodyBillTypeDataBillTypeDataItem> billTypeDataItem) {
            this.billTypeDataItem = billTypeDataItem;
            return this;
        }
        public java.util.List<DescribeDcdnUserBillTypeResponseBodyBillTypeDataBillTypeDataItem> getBillTypeDataItem() {
            return this.billTypeDataItem;
        }

    }

}
