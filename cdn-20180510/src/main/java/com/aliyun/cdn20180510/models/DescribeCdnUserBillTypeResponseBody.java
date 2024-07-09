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
     * 
     * <strong>example:</strong>
     * <p>C370DAF1-C838-4288-A1A0-9A87633D248E</p>
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
         * <blockquote>
         * <p>If the metering method is suffixed with \<em>\</em>_overseas\<em>\</em>, the billable region is outside the Chinese mainland. For example, &quot;BillType&quot;: &quot;month_avg_day_bandwidth_overseas&quot; indicates that the metering method is pay by average daily peak bandwidth per month in a billable region outside the Chinese mainland.</p>
         * </blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li>hour_flow: pay by hourly data transfer</li>
         * <li>day_bandwidth: pay by daily bandwidth</li>
         * <li>month_95: pay by monthly 95th percentile bandwidth</li>
         * <li>month_avg_day_bandwidth: pay by average daily peak bandwidth per month</li>
         * <li>month_4th_day_bandwidth: pay by monthly 4th peak bandwidth</li>
         * <li>month_avg_day_95: pay by average daily 95th percentile bandwidth per month</li>
         * <li>month_95_night_half: pay by 95th percentile bandwidth with 50% off from 00:00 to 08:00</li>
         * <li>hour_vas: pay by value-added services per hour</li>
         * <li>quic_hour_count: pay by hourly QUIC requests</li>
         * <li>day_count: pay by daily requests</li>
         * <li>hour_count: pay by hourly requests</li>
         * <li>day_95: pay by daily 95th percentile bandwidth</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>month_avg_day_bandwidth_overseas</p>
         */
        @NameInMap("BillType")
        public String billType;

        /**
         * <p>The billing cycle.</p>
         * 
         * <strong>example:</strong>
         * <p>month</p>
         */
        @NameInMap("BillingCycle")
        public String billingCycle;

        /**
         * <p>The dimension. Valid values:</p>
         * <ul>
         * <li>flow: traffic and bandwidth</li>
         * <li>vas: value-added services (HTTPS and requests for dynamic content)</li>
         * <li>quic: the number of QUIC requests</li>
         * <li>websocket: the WebSocket communications protocol</li>
         * <li>rtlog2sls: log entries delivered to Log Service in real time</li>
         * <li>stationflow: traffic over the internal network</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>flow</p>
         */
        @NameInMap("Dimension")
        public String dimension;

        /**
         * <p>The time when the metering method ended.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-10-31T16:00:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The name of the product.</p>
         * 
         * <strong>example:</strong>
         * <p>cdn</p>
         */
        @NameInMap("Product")
        public String product;

        /**
         * <p>The time when the metering method started.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-10-30T16:00:00Z</p>
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
