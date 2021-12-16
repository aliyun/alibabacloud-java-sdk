// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserBillHistoryResponseBody extends TeaModel {
    @NameInMap("BillHistoryData")
    public DescribeDcdnUserBillHistoryResponseBodyBillHistoryData billHistoryData;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnUserBillHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnUserBillHistoryResponseBody self = new DescribeDcdnUserBillHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnUserBillHistoryResponseBody setBillHistoryData(DescribeDcdnUserBillHistoryResponseBodyBillHistoryData billHistoryData) {
        this.billHistoryData = billHistoryData;
        return this;
    }
    public DescribeDcdnUserBillHistoryResponseBodyBillHistoryData getBillHistoryData() {
        return this.billHistoryData;
    }

    public DescribeDcdnUserBillHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDcdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItemBillingDataBillingDataItem extends TeaModel {
        @NameInMap("Bandwidth")
        public Float bandwidth;

        @NameInMap("CdnRegion")
        public String cdnRegion;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("Count")
        public Float count;

        @NameInMap("Flow")
        public Float flow;

        public static DescribeDcdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItemBillingDataBillingDataItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItemBillingDataBillingDataItem self = new DescribeDcdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItemBillingDataBillingDataItem();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItemBillingDataBillingDataItem setBandwidth(Float bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Float getBandwidth() {
            return this.bandwidth;
        }

        public DescribeDcdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItemBillingDataBillingDataItem setCdnRegion(String cdnRegion) {
            this.cdnRegion = cdnRegion;
            return this;
        }
        public String getCdnRegion() {
            return this.cdnRegion;
        }

        public DescribeDcdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItemBillingDataBillingDataItem setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeDcdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItemBillingDataBillingDataItem setCount(Float count) {
            this.count = count;
            return this;
        }
        public Float getCount() {
            return this.count;
        }

        public DescribeDcdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItemBillingDataBillingDataItem setFlow(Float flow) {
            this.flow = flow;
            return this;
        }
        public Float getFlow() {
            return this.flow;
        }

    }

    public static class DescribeDcdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItemBillingData extends TeaModel {
        @NameInMap("BillingDataItem")
        public java.util.List<DescribeDcdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItemBillingDataBillingDataItem> billingDataItem;

        public static DescribeDcdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItemBillingData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItemBillingData self = new DescribeDcdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItemBillingData();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItemBillingData setBillingDataItem(java.util.List<DescribeDcdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItemBillingDataBillingDataItem> billingDataItem) {
            this.billingDataItem = billingDataItem;
            return this;
        }
        public java.util.List<DescribeDcdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItemBillingDataBillingDataItem> getBillingDataItem() {
            return this.billingDataItem;
        }

    }

    public static class DescribeDcdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItem extends TeaModel {
        @NameInMap("BillTime")
        public String billTime;

        @NameInMap("BillType")
        public String billType;

        @NameInMap("BillingData")
        public DescribeDcdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItemBillingData billingData;

        @NameInMap("Dimension")
        public String dimension;

        public static DescribeDcdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItem self = new DescribeDcdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItem();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItem setBillTime(String billTime) {
            this.billTime = billTime;
            return this;
        }
        public String getBillTime() {
            return this.billTime;
        }

        public DescribeDcdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItem setBillType(String billType) {
            this.billType = billType;
            return this;
        }
        public String getBillType() {
            return this.billType;
        }

        public DescribeDcdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItem setBillingData(DescribeDcdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItemBillingData billingData) {
            this.billingData = billingData;
            return this;
        }
        public DescribeDcdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItemBillingData getBillingData() {
            return this.billingData;
        }

        public DescribeDcdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItem setDimension(String dimension) {
            this.dimension = dimension;
            return this;
        }
        public String getDimension() {
            return this.dimension;
        }

    }

    public static class DescribeDcdnUserBillHistoryResponseBodyBillHistoryData extends TeaModel {
        @NameInMap("BillHistoryDataItem")
        public java.util.List<DescribeDcdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItem> billHistoryDataItem;

        public static DescribeDcdnUserBillHistoryResponseBodyBillHistoryData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnUserBillHistoryResponseBodyBillHistoryData self = new DescribeDcdnUserBillHistoryResponseBodyBillHistoryData();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnUserBillHistoryResponseBodyBillHistoryData setBillHistoryDataItem(java.util.List<DescribeDcdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItem> billHistoryDataItem) {
            this.billHistoryDataItem = billHistoryDataItem;
            return this;
        }
        public java.util.List<DescribeDcdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItem> getBillHistoryDataItem() {
            return this.billHistoryDataItem;
        }

    }

}
