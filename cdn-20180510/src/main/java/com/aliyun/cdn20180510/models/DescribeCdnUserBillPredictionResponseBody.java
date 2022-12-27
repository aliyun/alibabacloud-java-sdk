// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnUserBillPredictionResponseBody extends TeaModel {
    // The list of bill prediction data.
    @NameInMap("BillPredictionData")
    public DescribeCdnUserBillPredictionResponseBodyBillPredictionData billPredictionData;

    // The metering method.
    // 
    // >  If the metering method ends with **\_overseas**, it indicates that the billable region is outside the Chinese mainland. For example, BillType": "month_avg_day_bandwidth_overseas specifies a billable region outside the Chinese mainland and that the metering method is pay by daily peak bandwidth per month.
    // 
    // Valid values:
    // 
    // *   hour_flow: pay by hourly data transfer.
    // *   day_bandwidth: pay by daily bandwidth.
    // *   month\_95: pay by monthly 95th percentile bandwidth.
    // *   month_avg_day_bandwidth: pay by average daily peak bandwidth per month.
    // *   month\_4th_day_bandwidth: pay by 4th peak bandwidth per month.
    // *   month_avg_day\_95: pay by average daily 95th percentile bandwidth per month.
    // *   month\_95\_night_half: pay by 95th percentile bandwidth with 50% off from 00:00 to 08:00.
    // *   hour_vas: pay by value-added services on an hourly basis.
    // *   day_count: pay by the number of requests per day.
    @NameInMap("BillType")
    public String billType;

    // The end time of the estimation.
    @NameInMap("EndTime")
    public String endTime;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The start time of the estimation.
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
        // The billable region.
        @NameInMap("Area")
        public String area;

        // The time when the value used as the estimated value is generated. This field is returned only if the metering method is pay by 95th percentile, pay by 95th percentile bandwidth with 50% off from 00:00 to 08:00, or pay by 4th peak bandwidth per month.
        @NameInMap("TimeStp")
        public String timeStp;

        // The estimated value.
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
