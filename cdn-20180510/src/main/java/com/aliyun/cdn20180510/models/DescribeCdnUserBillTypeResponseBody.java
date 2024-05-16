// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnUserBillTypeResponseBody extends TeaModel {
    /**
     * <p>Details about the metering methods returned.</p>
     */
    @NameInMap("BillTypeData")
    public DescribeCdnUserBillTypeResponseBodyBillTypeData billTypeData;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCdnUserBillTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnUserBillTypeResponseBody self = new DescribeCdnUserBillTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnUserBillTypeResponseBody setBillTypeData(DescribeCdnUserBillTypeResponseBodyBillTypeData billTypeData) {
        this.billTypeData = billTypeData;
        return this;
    }
    public DescribeCdnUserBillTypeResponseBodyBillTypeData getBillTypeData() {
        return this.billTypeData;
    }

    public DescribeCdnUserBillTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCdnUserBillTypeResponseBodyBillTypeDataBillTypeDataItem extends TeaModel {
        /**
         * <p>The metering method.</p>
         * <br>
         * <p>> If the metering method is suffixed with \\*\\*_overseas\\*\\*, the billable region is outside the Chinese mainland. For example, "BillType": "month_avg_day_bandwidth_overseas" indicates that the metering method is pay by average daily peak bandwidth per month in a billable region outside the Chinese mainland.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   hour_flow: pay by hourly data transfer</p>
         * <p>*   day_bandwidth: pay by daily bandwidth</p>
         * <p>*   month_95: pay by monthly 95th percentile bandwidth</p>
         * <p>*   month_avg_day_bandwidth: pay by average daily peak bandwidth per month</p>
         * <p>*   month_4th_day_bandwidth: pay by monthly 4th peak bandwidth</p>
         * <p>*   month_avg_day_95: pay by average daily 95th percentile bandwidth per month</p>
         * <p>*   month_95_night_half: pay by 95th percentile bandwidth with 50% off from 00:00 to 08:00</p>
         * <p>*   hour_vas: pay by value-added services per hour</p>
         * <p>*   quic_hour_count: pay by hourly QUIC requests</p>
         * <p>*   day_count: pay by daily requests</p>
         * <p>*   hour_count: pay by hourly requests</p>
         * <p>*   day_95: pay by daily 95th percentile bandwidth</p>
         */
        @NameInMap("BillType")
        public String billType;

        /**
         * <p>The billing cycle.</p>
         */
        @NameInMap("BillingCycle")
        public String billingCycle;

        /**
         * <p>The dimension. Valid values:</p>
         * <br>
         * <p>*   flow: traffic and bandwidth</p>
         * <p>*   vas: value-added services (HTTPS and requests for dynamic content)</p>
         * <p>*   quic: the number of QUIC requests</p>
         * <p>*   websocket: the WebSocket communications protocol</p>
         * <p>*   rtlog2sls: log entries delivered to Log Service in real time</p>
         * <p>*   stationflow: traffic over the internal network</p>
         */
        @NameInMap("Dimension")
        public String dimension;

        /**
         * <p>The time when the metering method ended.</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The name of the product.</p>
         */
        @NameInMap("Product")
        public String product;

        /**
         * <p>The time when the metering method started.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static DescribeCdnUserBillTypeResponseBodyBillTypeDataBillTypeDataItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnUserBillTypeResponseBodyBillTypeDataBillTypeDataItem self = new DescribeCdnUserBillTypeResponseBodyBillTypeDataBillTypeDataItem();
            return TeaModel.build(map, self);
        }

        public DescribeCdnUserBillTypeResponseBodyBillTypeDataBillTypeDataItem setBillType(String billType) {
            this.billType = billType;
            return this;
        }
        public String getBillType() {
            return this.billType;
        }

        public DescribeCdnUserBillTypeResponseBodyBillTypeDataBillTypeDataItem setBillingCycle(String billingCycle) {
            this.billingCycle = billingCycle;
            return this;
        }
        public String getBillingCycle() {
            return this.billingCycle;
        }

        public DescribeCdnUserBillTypeResponseBodyBillTypeDataBillTypeDataItem setDimension(String dimension) {
            this.dimension = dimension;
            return this;
        }
        public String getDimension() {
            return this.dimension;
        }

        public DescribeCdnUserBillTypeResponseBodyBillTypeDataBillTypeDataItem setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeCdnUserBillTypeResponseBodyBillTypeDataBillTypeDataItem setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public DescribeCdnUserBillTypeResponseBodyBillTypeDataBillTypeDataItem setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
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
