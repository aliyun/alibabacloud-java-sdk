// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveUserBillPredictionResponseBody extends TeaModel {
    @NameInMap("BillPredictionData")
    public DescribeLiveUserBillPredictionResponseBodyBillPredictionData billPredictionData;

    /**
     * <p>The metering method. Valid values:</p>
     * <ul>
     * <li>hour_flow: pay by hourly data transfer</li>
     * <li>day_bandwidth: pay by daily bandwidth</li>
     * <li>month_95: pay by monthly 95th percentile bandwidth</li>
     * <li>month_avg_day_bandwidth: pay by average daily peak bandwidth per month</li>
     * <li>month_4th_day_bandwidth: pay by 4th peak bandwidth per month</li>
     * <li>month_avg_day_95: pay by average daily 95th percentile bandwidth per month</li>
     * <li>month_95_night_half: pay by 95th percentile bandwidth with 50% off from 00:00 to 08:00</li>
     * <li>hour_vas: pay by value-added services per hour</li>
     * <li>day_count: pay by daily requests</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>day_bandwidth</p>
     */
    @NameInMap("BillType")
    public String billType;

    /**
     * <p>The end time. If you do not specify the request parameter EndTime, the end time is the current time by default. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-10-25T10:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B95BE680-5A6A-1CAD-8AB1-09DFF5D6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start time. If you do not specify the request parameter StartTime, the start time is 00:00 on the first day of the month by default. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-09-30T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeLiveUserBillPredictionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveUserBillPredictionResponseBody self = new DescribeLiveUserBillPredictionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveUserBillPredictionResponseBody setBillPredictionData(DescribeLiveUserBillPredictionResponseBodyBillPredictionData billPredictionData) {
        this.billPredictionData = billPredictionData;
        return this;
    }
    public DescribeLiveUserBillPredictionResponseBodyBillPredictionData getBillPredictionData() {
        return this.billPredictionData;
    }

    public DescribeLiveUserBillPredictionResponseBody setBillType(String billType) {
        this.billType = billType;
        return this;
    }
    public String getBillType() {
        return this.billType;
    }

    public DescribeLiveUserBillPredictionResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveUserBillPredictionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveUserBillPredictionResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeLiveUserBillPredictionResponseBodyBillPredictionDataBillPredictionDataItem extends TeaModel {
        @NameInMap("Area")
        public String area;

        @NameInMap("TimeStp")
        public String timeStp;

        @NameInMap("Value")
        public Float value;

        public static DescribeLiveUserBillPredictionResponseBodyBillPredictionDataBillPredictionDataItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveUserBillPredictionResponseBodyBillPredictionDataBillPredictionDataItem self = new DescribeLiveUserBillPredictionResponseBodyBillPredictionDataBillPredictionDataItem();
            return TeaModel.build(map, self);
        }

        public DescribeLiveUserBillPredictionResponseBodyBillPredictionDataBillPredictionDataItem setArea(String area) {
            this.area = area;
            return this;
        }
        public String getArea() {
            return this.area;
        }

        public DescribeLiveUserBillPredictionResponseBodyBillPredictionDataBillPredictionDataItem setTimeStp(String timeStp) {
            this.timeStp = timeStp;
            return this;
        }
        public String getTimeStp() {
            return this.timeStp;
        }

        public DescribeLiveUserBillPredictionResponseBodyBillPredictionDataBillPredictionDataItem setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class DescribeLiveUserBillPredictionResponseBodyBillPredictionData extends TeaModel {
        @NameInMap("BillPredictionDataItem")
        public java.util.List<DescribeLiveUserBillPredictionResponseBodyBillPredictionDataBillPredictionDataItem> billPredictionDataItem;

        public static DescribeLiveUserBillPredictionResponseBodyBillPredictionData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveUserBillPredictionResponseBodyBillPredictionData self = new DescribeLiveUserBillPredictionResponseBodyBillPredictionData();
            return TeaModel.build(map, self);
        }

        public DescribeLiveUserBillPredictionResponseBodyBillPredictionData setBillPredictionDataItem(java.util.List<DescribeLiveUserBillPredictionResponseBodyBillPredictionDataBillPredictionDataItem> billPredictionDataItem) {
            this.billPredictionDataItem = billPredictionDataItem;
            return this;
        }
        public java.util.List<DescribeLiveUserBillPredictionResponseBodyBillPredictionDataBillPredictionDataItem> getBillPredictionDataItem() {
            return this.billPredictionDataItem;
        }

    }

}
