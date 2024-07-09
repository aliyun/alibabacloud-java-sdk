// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnUserBillPredictionResponseBody extends TeaModel {
    /**
     * <p>The estimated bill data.</p>
     */
    @NameInMap("BillPredictionData")
    public DescribeCdnUserBillPredictionResponseBodyBillPredictionData billPredictionData;

    /**
     * <p>The metering method.</p>
     * <blockquote>
     * <p>If the metering method ends with _overseas, the billable region is outside the Chinese mainland. For example, BillType&quot;: &quot;month_avg_day_bandwidth_overseas specifies a billable region outside the Chinese mainland and that the metering method is pay by daily peak bandwidth per month.</p>
     * </blockquote>
     * <p>Valid values:</p>
     * <ul>
     * <li>hour_flow: pay by hourly data transfer</li>
     * <li>day_bandwidth: pay by daily bandwidth</li>
     * <li>month_95: pay by monthly 95th percentile bandwidth.</li>
     * <li>month_avg_day_bandwidth: pay by average daily peak bandwidth per month</li>
     * <li>month_4th_day_bandwidth: pay by monthly 4th peak bandwidth</li>
     * <li>month_avg_day_95: pay by average daily 95th percentile bandwidth per month</li>
     * <li>month_95_night_half: pay by 95th percentile bandwidth with 50% off from 00:00 to 08:00.</li>
     * <li>hour_vas: pay by value-added services per hour</li>
     * <li>day_count: pay by daily requests</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>month_95</p>
     */
    @NameInMap("BillType")
    public String billType;

    /**
     * <p>The end time of the estimation.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-10-25T10:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C370DAF1-C838-4288-A1A0-9A87633D248E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start time of the estimation.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-09-30T16:00:00Z</p>
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
        /**
         * <p>The billable region.</p>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("Area")
        public String area;

        /**
         * <p>The time when the value used as the estimated value is generated. This parameter is returned only if the metering method is pay by 95th percentile, pay by 95th percentile bandwidth with 50% off from 00:00 to 08:00, or pay by 4th peak bandwidth per month.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-10-15T16:00:00Z</p>
         */
        @NameInMap("TimeStp")
        public String timeStp;

        /**
         * <p>The estimated value.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
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
