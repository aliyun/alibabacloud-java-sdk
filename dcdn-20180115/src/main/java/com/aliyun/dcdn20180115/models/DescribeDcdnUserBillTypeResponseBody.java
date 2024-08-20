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
     * 
     * <strong>example:</strong>
     * <p>C370DAF1-C838-4288-A1A0-9A87633D248E</p>
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
         * <ul>
         * <li><strong>hour_flow</strong>: pay by hourly traffic</li>
         * <li><strong>day_bandwidth</strong>: pay by daily bandwidth</li>
         * <li><strong>month_95</strong>: pay by monthly 95th percentile</li>
         * <li><strong>month_avg_day_bandwidth</strong>: pay by average daily peak bandwidth per month</li>
         * <li><strong>month_4th_day_bandwidth</strong>: pay by 4th peak bandwidth per month</li>
         * <li><strong>month_avg_day_95</strong>: pay by average daily 95th percentile per month</li>
         * <li><strong>month_95_night_half</strong>: pay by 95th percentile (50% off during nighttime)</li>
         * <li><strong>hour_vas</strong>: pay by value-added service per month</li>
         * <li><strong>quic_hour_count</strong>: pay by QUIC request per hour</li>
         * <li><strong>hour_count</strong>: pay by request per hour</li>
         * <li><strong>rtlog_count_day</strong>: pay by the number of real-time logs per day</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>month_avg_day_bandwidth_overseas</p>
         */
        @NameInMap("BillType")
        public String billType;

        /**
         * <p>The metering cycle.</p>
         * 
         * <strong>example:</strong>
         * <p>month</p>
         */
        @NameInMap("BillingCycle")
        public String billingCycle;

        /**
         * <p>The dimension. Valid values:</p>
         * <ul>
         * <li><strong>flow</strong>: network traffic and bandwidth</li>
         * <li><strong>vas</strong>: value-added services (HTTPS and requests for dynamic content)</li>
         * <li><strong>websocket</strong>: WebSocket</li>
         * <li><strong>quic</strong>: QUIC requests</li>
         * <li><strong>rtlog2sls</strong>: log entries delivered to Log Service in real time</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>flow</p>
         */
        @NameInMap("Dimension")
        public String dimension;

        /**
         * <p>The time when the metering method ends.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-10-31T16:00:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The name of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>dcdn</p>
         */
        @NameInMap("Product")
        public String product;

        /**
         * <p>The time when the metering method takes effect.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-10-30T16:00:00Z</p>
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
