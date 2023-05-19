// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnUserBillHistoryResponseBody extends TeaModel {
    /**
     * <p>Invalid Parameter StartTime.</p>
     */
    @NameInMap("BillHistoryData")
    public DescribeCdnUserBillHistoryResponseBodyBillHistoryData billHistoryData;

    /**
     * <p>Invalid Parameter AliUid.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCdnUserBillHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnUserBillHistoryResponseBody self = new DescribeCdnUserBillHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnUserBillHistoryResponseBody setBillHistoryData(DescribeCdnUserBillHistoryResponseBodyBillHistoryData billHistoryData) {
        this.billHistoryData = billHistoryData;
        return this;
    }
    public DescribeCdnUserBillHistoryResponseBodyBillHistoryData getBillHistoryData() {
        return this.billHistoryData;
    }

    public DescribeCdnUserBillHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItemBillingDataBillingDataItem extends TeaModel {
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

        public static DescribeCdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItemBillingDataBillingDataItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItemBillingDataBillingDataItem self = new DescribeCdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItemBillingDataBillingDataItem();
            return TeaModel.build(map, self);
        }

        public DescribeCdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItemBillingDataBillingDataItem setBandwidth(Float bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Float getBandwidth() {
            return this.bandwidth;
        }

        public DescribeCdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItemBillingDataBillingDataItem setCdnRegion(String cdnRegion) {
            this.cdnRegion = cdnRegion;
            return this;
        }
        public String getCdnRegion() {
            return this.cdnRegion;
        }

        public DescribeCdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItemBillingDataBillingDataItem setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeCdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItemBillingDataBillingDataItem setCount(Float count) {
            this.count = count;
            return this;
        }
        public Float getCount() {
            return this.count;
        }

        public DescribeCdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItemBillingDataBillingDataItem setFlow(Float flow) {
            this.flow = flow;
            return this;
        }
        public Float getFlow() {
            return this.flow;
        }

    }

    public static class DescribeCdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItemBillingData extends TeaModel {
        @NameInMap("BillingDataItem")
        public java.util.List<DescribeCdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItemBillingDataBillingDataItem> billingDataItem;

        public static DescribeCdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItemBillingData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItemBillingData self = new DescribeCdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItemBillingData();
            return TeaModel.build(map, self);
        }

        public DescribeCdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItemBillingData setBillingDataItem(java.util.List<DescribeCdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItemBillingDataBillingDataItem> billingDataItem) {
            this.billingDataItem = billingDataItem;
            return this;
        }
        public java.util.List<DescribeCdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItemBillingDataBillingDataItem> getBillingDataItem() {
            return this.billingDataItem;
        }

    }

    public static class DescribeCdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItem extends TeaModel {
        @NameInMap("BillTime")
        public String billTime;

        @NameInMap("BillType")
        public String billType;

        @NameInMap("BillingData")
        public DescribeCdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItemBillingData billingData;

        /**
         * <p>Invalid Parameter EndTime.</p>
         */
        @NameInMap("Dimension")
        public String dimension;

        public static DescribeCdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItem self = new DescribeCdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItem();
            return TeaModel.build(map, self);
        }

        public DescribeCdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItem setBillTime(String billTime) {
            this.billTime = billTime;
            return this;
        }
        public String getBillTime() {
            return this.billTime;
        }

        public DescribeCdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItem setBillType(String billType) {
            this.billType = billType;
            return this;
        }
        public String getBillType() {
            return this.billType;
        }

        public DescribeCdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItem setBillingData(DescribeCdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItemBillingData billingData) {
            this.billingData = billingData;
            return this;
        }
        public DescribeCdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItemBillingData getBillingData() {
            return this.billingData;
        }

        public DescribeCdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItem setDimension(String dimension) {
            this.dimension = dimension;
            return this;
        }
        public String getDimension() {
            return this.dimension;
        }

    }

    public static class DescribeCdnUserBillHistoryResponseBodyBillHistoryData extends TeaModel {
        @NameInMap("BillHistoryDataItem")
        public java.util.List<DescribeCdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItem> billHistoryDataItem;

        public static DescribeCdnUserBillHistoryResponseBodyBillHistoryData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnUserBillHistoryResponseBodyBillHistoryData self = new DescribeCdnUserBillHistoryResponseBodyBillHistoryData();
            return TeaModel.build(map, self);
        }

        public DescribeCdnUserBillHistoryResponseBodyBillHistoryData setBillHistoryDataItem(java.util.List<DescribeCdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItem> billHistoryDataItem) {
            this.billHistoryDataItem = billHistoryDataItem;
            return this;
        }
        public java.util.List<DescribeCdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItem> getBillHistoryDataItem() {
            return this.billHistoryDataItem;
        }

    }

}
