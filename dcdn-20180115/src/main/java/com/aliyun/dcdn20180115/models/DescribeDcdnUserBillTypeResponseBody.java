// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserBillTypeResponseBody extends TeaModel {
    /**
     * <p>The information about the metering method.</p>
     */
    @NameInMap("BillTypeData")
    public DescribeDcdnUserBillTypeResponseBodyBillTypeData billTypeData;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The metering method. Valid values:</p>
         * <br>
         * <p>*   **hour_flow**: pay by hourly traffic</p>
         * <p>*   **day_bandwidth**: pay by daily bandwidth</p>
         * <p>*   **month\_95**: pay by monthly 95th percentile</p>
         * <p>*   **month_avg_day_bandwidth**: pay by average daily peak bandwidth per month</p>
         * <p>*   **month\_4th_day_bandwidth**: pay by 4th peak bandwidth per month</p>
         * <p>*   **month_avg_day\_95**: pay by average daily 95th percentile per month</p>
         * <p>*   **month\_95\_night_half**: pay by 95th percentile (50% off during nighttime)</p>
         * <p>*   **hour_vas**: pay by value-added service per month</p>
         * <p>*   **quic_hour_count**: pay by QUIC request per hour</p>
         * <p>*   **hour_count**: pay by request per hour</p>
         * <p>*   **rtlog_count_day**: pay by the number of real-time logs per day</p>
         */
        @NameInMap("BillType")
        public String billType;

        /**
         * <p>The metering cycle.</p>
         */
        @NameInMap("BillingCycle")
        public String billingCycle;

        /**
         * <p>The dimension. Valid values:</p>
         * <br>
         * <p>*   **flow**: network traffic and bandwidth</p>
         * <p>*   **vas**: value-added services (HTTPS and requests for dynamic content)</p>
         * <p>*   **websocket**: WebSocket</p>
         * <p>*   **quic**: QUIC requests</p>
         * <p>*   **rtlog2sls**: log entries delivered to Log Service in real time</p>
         */
        @NameInMap("Dimension")
        public String dimension;

        /**
         * <p>The time when the metering method ends.</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The name of the service.</p>
         */
        @NameInMap("Product")
        public String product;

        /**
         * <p>The time when the metering method takes effect.</p>
         */
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
