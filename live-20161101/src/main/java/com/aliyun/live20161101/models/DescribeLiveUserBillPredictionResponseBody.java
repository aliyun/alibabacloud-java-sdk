// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveUserBillPredictionResponseBody extends TeaModel {
    @NameInMap("BillPredictionData")
    public DescribeLiveUserBillPredictionResponseBodyBillPredictionData billPredictionData;

    /**
     * <p>The billing method. The following billing methods are supported:</p>
     * <ul>
     * <li><p>hour_flow: Pay-by-traffic on an hourly basis.</p>
     * </li>
     * <li><p>day_bandwidth: Pay-by-bandwidth on a daily basis.</p>
     * </li>
     * <li><p>month_95: Pay-by-monthly 95th percentile peak bandwidth.</p>
     * </li>
     * <li><p>month_avg_day_bandwidth: Pay-by-monthly average of daily peak bandwidth.</p>
     * </li>
     * <li><p>month_4th_day_bandwidth: Pay-by-monthly 4th peak bandwidth.</p>
     * </li>
     * <li><p>month_avg_day_95: Pay-by-monthly average of daily 95th percentile peak bandwidth.</p>
     * </li>
     * <li><p>month_95_night_half: Pay-by-nightly 95th percentile peak bandwidth with a 50% discount.</p>
     * </li>
     * <li><p>hour_vas: Pay-for-value-added services on an hourly basis.</p>
     * </li>
     * <li><p>day_count: Pay-by-daily request count.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>day_bandwidth</p>
     */
    @NameInMap("BillType")
    public String billType;

    /**
     * <p>The end time of the query. The time is in UTC and follows the ISO 8601 standard.
     * Format: YYYY-MM-DDThh:mm:ssZ. The default value is the current time.</p>
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
     * <p>The start time of the query. The time is in UTC and follows the ISO 8601 standard.
     * Format: YYYY-MM-DDThh:mm:ssZ. The default value is 00:00 on the first day of the month.</p>
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
