// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserBillHistoryResponseBody extends TeaModel {
    /**
     * <p>The billing history returned.</p>
     */
    @NameInMap("BillHistoryData")
    public DescribeDcdnUserBillHistoryResponseBodyBillHistoryData billHistoryData;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ED61C6C3-8241-4187-AAA7-5157AE175CEC</p>
     */
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
        /**
         * <p>The bandwidth. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>4839</p>
         */
        @NameInMap("Bandwidth")
        public Float bandwidth;

        /**
         * <p>The region for which the billing records are generated. Valid values: <strong>CN</strong>, <strong>OverSeas</strong>, <strong>AP1</strong>, <strong>AP2</strong>, <strong>AP3</strong>, <strong>NA</strong>, <strong>SA</strong>, <strong>EU</strong>, and <strong>MEAA</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>AP1</p>
         */
        @NameInMap("CdnRegion")
        public String cdnRegion;

        /**
         * <p>The billing method of the disk. Valid values: <strong>StaticHttp</strong>, <strong>DynamicHttp</strong>, and <strong>DynamicHttps</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>DynamicHttp</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The number of billing entries.</p>
         * 
         * <strong>example:</strong>
         * <p>205624</p>
         */
        @NameInMap("Count")
        public Float count;

        /**
         * <p>The amount of network traffic. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>2456</p>
         */
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
        /**
         * <p>The beginning of the time range that was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-09-30T17:00:00Z</p>
         */
        @NameInMap("BillTime")
        public String billTime;

        /**
         * <p>The metering method.</p>
         * 
         * <strong>example:</strong>
         * <p>month_4th_day_bandwidth</p>
         */
        @NameInMap("BillType")
        public String billType;

        /**
         * <p>The billable items.</p>
         */
        @NameInMap("BillingData")
        public DescribeDcdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItemBillingData billingData;

        /**
         * <p>The dimension.</p>
         * 
         * <strong>example:</strong>
         * <p>vas</p>
         */
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
