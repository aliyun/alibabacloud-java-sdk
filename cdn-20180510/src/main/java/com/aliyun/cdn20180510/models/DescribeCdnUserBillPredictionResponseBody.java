// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnUserBillPredictionResponseBody extends TeaModel {
    /**
     * <p>The billable region.</p>
     */
    @NameInMap("BillPredictionData")
    public DescribeCdnUserBillPredictionResponseBodyBillPredictionData billPredictionData;

    /**
     * <p>The time when the value used as the estimated value is generated. This parameter is returned only if the metering method is pay by 95th percentile, pay by 95th percentile bandwidth with 50% off from 00:00 to 08:00, or pay by 4th peak bandwidth per month.</p>
     */
    @NameInMap("BillType")
    public String billType;

    /**
     * <p>The metering method.</p>
     * <br>
     * <p>> If the metering method ends with \_overseas, the billable region is outside the Chinese mainland. For example, BillType": "month_avg_day_bandwidth_overseas specifies a billable region outside the Chinese mainland and that the metering method is pay by daily peak bandwidth per month.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   hour_flow: pay by hourly data transfer</p>
     * <p>*   day_bandwidth: pay by daily bandwidth</p>
     * <p>*   month\_95: pay by monthly 95th percentile bandwidth.</p>
     * <p>*   month_avg_day_bandwidth: pay by average daily peak bandwidth per month</p>
     * <p>*   month\_4th_day_bandwidth: pay by monthly 4th peak bandwidth</p>
     * <p>*   month_avg_day\_95: pay by average daily 95th percentile bandwidth per month</p>
     * <p>*   month\_95\_night_half: pay by 95th percentile bandwidth with 50% off from 00:00 to 08:00.</p>
     * <p>*   hour_vas: pay by value-added services per hour</p>
     * <p>*   day_count: pay by daily requests</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The estimated value.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The estimated bill data.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeCdnUserBillPredictionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnUserBillPredictionResponseBody self = new DescribeCdnUserBillPredictionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnUserBillPredictionResponseBody setBillPredictionData(DescribeCdnUserBillPredictionResponseBodyBillPredictionData billPredictionData) {
        this.billPredictionData = billPredictionData;
        return this;
    }
    public DescribeCdnUserBillPredictionResponseBodyBillPredictionData getBillPredictionData() {
        return this.billPredictionData;
    }

    public DescribeCdnUserBillPredictionResponseBody setBillType(String billType) {
        this.billType = billType;
        return this;
    }
    public String getBillType() {
        return this.billType;
    }

    public DescribeCdnUserBillPredictionResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeCdnUserBillPredictionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCdnUserBillPredictionResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeCdnUserBillPredictionResponseBodyBillPredictionDataBillPredictionDataItem extends TeaModel {
        @NameInMap("Area")
        public String area;

        @NameInMap("TimeStp")
        public String timeStp;

        @NameInMap("Value")
        public Float value;

        public static DescribeCdnUserBillPredictionResponseBodyBillPredictionDataBillPredictionDataItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnUserBillPredictionResponseBodyBillPredictionDataBillPredictionDataItem self = new DescribeCdnUserBillPredictionResponseBodyBillPredictionDataBillPredictionDataItem();
            return TeaModel.build(map, self);
        }

        public DescribeCdnUserBillPredictionResponseBodyBillPredictionDataBillPredictionDataItem setArea(String area) {
            this.area = area;
            return this;
        }
        public String getArea() {
            return this.area;
        }

        public DescribeCdnUserBillPredictionResponseBodyBillPredictionDataBillPredictionDataItem setTimeStp(String timeStp) {
            this.timeStp = timeStp;
            return this;
        }
        public String getTimeStp() {
            return this.timeStp;
        }

        public DescribeCdnUserBillPredictionResponseBodyBillPredictionDataBillPredictionDataItem setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class DescribeCdnUserBillPredictionResponseBodyBillPredictionData extends TeaModel {
        @NameInMap("BillPredictionDataItem")
        public java.util.List<DescribeCdnUserBillPredictionResponseBodyBillPredictionDataBillPredictionDataItem> billPredictionDataItem;

        public static DescribeCdnUserBillPredictionResponseBodyBillPredictionData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnUserBillPredictionResponseBodyBillPredictionData self = new DescribeCdnUserBillPredictionResponseBodyBillPredictionData();
            return TeaModel.build(map, self);
        }

        public DescribeCdnUserBillPredictionResponseBodyBillPredictionData setBillPredictionDataItem(java.util.List<DescribeCdnUserBillPredictionResponseBodyBillPredictionDataBillPredictionDataItem> billPredictionDataItem) {
            this.billPredictionDataItem = billPredictionDataItem;
            return this;
        }
        public java.util.List<DescribeCdnUserBillPredictionResponseBodyBillPredictionDataBillPredictionDataItem> getBillPredictionDataItem() {
            return this.billPredictionDataItem;
        }

    }

}
