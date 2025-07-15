// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeRTSNativeSDKPlayTimeResponseBody extends TeaModel {
    /**
     * <p>The time granularity.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("DataInterval")
    public String dataInterval;

    /**
     * <p>The end of the time range for which the data was queried.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-10T21:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The average playback duration and average stuttering duration at each interval. Unit: milliseconds.</p>
     */
    @NameInMap("PlayTimeData")
    public java.util.List<DescribeRTSNativeSDKPlayTimeResponseBodyPlayTimeData> playTimeData;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7BF95F2A-3B24-4CDE-9346-7F6FA86697A1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The beginning of the time range for which the data was queried.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-10T20:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeRTSNativeSDKPlayTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRTSNativeSDKPlayTimeResponseBody self = new DescribeRTSNativeSDKPlayTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRTSNativeSDKPlayTimeResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeRTSNativeSDKPlayTimeResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeRTSNativeSDKPlayTimeResponseBody setPlayTimeData(java.util.List<DescribeRTSNativeSDKPlayTimeResponseBodyPlayTimeData> playTimeData) {
        this.playTimeData = playTimeData;
        return this;
    }
    public java.util.List<DescribeRTSNativeSDKPlayTimeResponseBodyPlayTimeData> getPlayTimeData() {
        return this.playTimeData;
    }

    public DescribeRTSNativeSDKPlayTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRTSNativeSDKPlayTimeResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeRTSNativeSDKPlayTimeResponseBodyPlayTimeData extends TeaModel {
        /**
         * <p>The average playback duration within the period of time.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("PlayTime")
        public String playTime;

        /**
         * <p>The average stuttering duration within the period of time.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("StallTime")
        public String stallTime;

        /**
         * <p>The timestamp of the returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-10T20:00:00Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeRTSNativeSDKPlayTimeResponseBodyPlayTimeData build(java.util.Map<String, ?> map) throws Exception {
            DescribeRTSNativeSDKPlayTimeResponseBodyPlayTimeData self = new DescribeRTSNativeSDKPlayTimeResponseBodyPlayTimeData();
            return TeaModel.build(map, self);
        }

        public DescribeRTSNativeSDKPlayTimeResponseBodyPlayTimeData setPlayTime(String playTime) {
            this.playTime = playTime;
            return this;
        }
        public String getPlayTime() {
            return this.playTime;
        }

        public DescribeRTSNativeSDKPlayTimeResponseBodyPlayTimeData setStallTime(String stallTime) {
            this.stallTime = stallTime;
            return this;
        }
        public String getStallTime() {
            return this.stallTime;
        }

        public DescribeRTSNativeSDKPlayTimeResponseBodyPlayTimeData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

}
