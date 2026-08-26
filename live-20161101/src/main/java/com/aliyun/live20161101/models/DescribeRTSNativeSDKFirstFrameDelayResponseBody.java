// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeRTSNativeSDKFirstFrameDelayResponseBody extends TeaModel {
    /**
     * <p>The time granularity.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("DataInterval")
    public String dataInterval;

    /**
     * <p>The end time. The time is in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-10T21:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The average first frame delay for each time interval. Unit: milliseconds.</p>
     */
    @NameInMap("FrameDelayData")
    public java.util.List<DescribeRTSNativeSDKFirstFrameDelayResponseBodyFrameDelayData> frameDelayData;

    /**
     * <p>Id</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start time. The time is in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-10T20:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeRTSNativeSDKFirstFrameDelayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRTSNativeSDKFirstFrameDelayResponseBody self = new DescribeRTSNativeSDKFirstFrameDelayResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRTSNativeSDKFirstFrameDelayResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeRTSNativeSDKFirstFrameDelayResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeRTSNativeSDKFirstFrameDelayResponseBody setFrameDelayData(java.util.List<DescribeRTSNativeSDKFirstFrameDelayResponseBodyFrameDelayData> frameDelayData) {
        this.frameDelayData = frameDelayData;
        return this;
    }
    public java.util.List<DescribeRTSNativeSDKFirstFrameDelayResponseBodyFrameDelayData> getFrameDelayData() {
        return this.frameDelayData;
    }

    public DescribeRTSNativeSDKFirstFrameDelayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRTSNativeSDKFirstFrameDelayResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeRTSNativeSDKFirstFrameDelayResponseBodyFrameDelayData extends TeaModel {
        /**
         * <p>The average first frame delay during the time interval.</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        @NameInMap("FrameDelay")
        public String frameDelay;

        /**
         * <p>The beginning of the time interval. The time is in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-10T20:00:00Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeRTSNativeSDKFirstFrameDelayResponseBodyFrameDelayData build(java.util.Map<String, ?> map) throws Exception {
            DescribeRTSNativeSDKFirstFrameDelayResponseBodyFrameDelayData self = new DescribeRTSNativeSDKFirstFrameDelayResponseBodyFrameDelayData();
            return TeaModel.build(map, self);
        }

        public DescribeRTSNativeSDKFirstFrameDelayResponseBodyFrameDelayData setFrameDelay(String frameDelay) {
            this.frameDelay = frameDelay;
            return this;
        }
        public String getFrameDelay() {
            return this.frameDelay;
        }

        public DescribeRTSNativeSDKFirstFrameDelayResponseBodyFrameDelayData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

}
