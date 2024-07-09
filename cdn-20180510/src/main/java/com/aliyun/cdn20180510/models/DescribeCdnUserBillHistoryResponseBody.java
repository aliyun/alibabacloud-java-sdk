// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnUserBillHistoryResponseBody extends TeaModel {
    /**
     * <p>The billing history returned.</p>
     */
    @NameInMap("BillHistoryData")
    public DescribeCdnUserBillHistoryResponseBodyBillHistoryData billHistoryData;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ED61C6C3-8241-4187-AAA7-5157AE175CEC</p>
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
        /**
         * <p>The bandwidth. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>4041</p>
         */
        @NameInMap("Bandwidth")
        public Float bandwidth;

        /**
         * <p>The billable region. Valid values:</p>
         * <ul>
         * <li><strong>CN</strong>: Chinese mainland</li>
         * <li><strong>OverSeas</strong>: outside the Chinese mainland</li>
         * <li><strong>AP1</strong>: Asia Pacific 1</li>
         * <li><strong>AP2</strong>: Asia Pacific 2</li>
         * <li><strong>AP3</strong>: Asia Pacific 3</li>
         * <li><strong>NA</strong>: North America</li>
         * <li><strong>SA</strong>: South America</li>
         * <li><strong>EU</strong>: Europe</li>
         * <li><strong>MEAA</strong>: Middle East and Africa</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AP1</p>
         */
        @NameInMap("CdnRegion")
        public String cdnRegion;

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li><strong>StaticHttp</strong>: static HTTP requests</li>
         * <li><strong>DynamicHttp</strong>: dynamic HTTP requests</li>
         * <li><strong>DynamicHttps</strong>: dynamic HTTPS requests</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DynamicHttp</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The number of requests.</p>
         * 
         * <strong>example:</strong>
         * <p>203601</p>
         */
        @NameInMap("Count")
        public Float count;

        /**
         * <p>The amount of network traffic. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>24567</p>
         */
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
        /**
         * <p>The beginning of the time range that was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-09-30T16:00:00Z</p>
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
        public DescribeCdnUserBillHistoryResponseBodyBillHistoryDataBillHistoryDataItemBillingData billingData;

        /**
         * <p>The dimension.</p>
         * 
         * <strong>example:</strong>
         * <p>flow</p>
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
