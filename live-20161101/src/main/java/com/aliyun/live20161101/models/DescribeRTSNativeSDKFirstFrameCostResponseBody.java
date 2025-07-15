// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeRTSNativeSDKFirstFrameCostResponseBody extends TeaModel {
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
     * <p>The average latency of first frames at each interval. Unit: milliseconds.</p>
     */
    @NameInMap("FirstFrameCostData")
    public java.util.List<DescribeRTSNativeSDKFirstFrameCostResponseBodyFirstFrameCostData> firstFrameCostData;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>BC858082-736F-4A25-867B-E5B67C85ACF7</p>
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

    public static DescribeRTSNativeSDKFirstFrameCostResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRTSNativeSDKFirstFrameCostResponseBody self = new DescribeRTSNativeSDKFirstFrameCostResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRTSNativeSDKFirstFrameCostResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeRTSNativeSDKFirstFrameCostResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeRTSNativeSDKFirstFrameCostResponseBody setFirstFrameCostData(java.util.List<DescribeRTSNativeSDKFirstFrameCostResponseBodyFirstFrameCostData> firstFrameCostData) {
        this.firstFrameCostData = firstFrameCostData;
        return this;
    }
    public java.util.List<DescribeRTSNativeSDKFirstFrameCostResponseBodyFirstFrameCostData> getFirstFrameCostData() {
        return this.firstFrameCostData;
    }

    public DescribeRTSNativeSDKFirstFrameCostResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRTSNativeSDKFirstFrameCostResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeRTSNativeSDKFirstFrameCostResponseBodyFirstFrameCostData extends TeaModel {
        /**
         * <p>The time elapsed from initialization to connection establishment.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Connected")
        public String connected;

        /**
         * <p>The time elapsed from connection establishment to subscription.</p>
         * 
         * <strong>example:</strong>
         * <p>89</p>
         */
        @NameInMap("FinishGetStreamInfo")
        public String finishGetStreamInfo;

        /**
         * <p>The time elapsed from first packet processing to display of the first frame.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("FirstFrameComplete")
        public String firstFrameComplete;

        /**
         * <p>The time elapsed from subscription to first packet processing.</p>
         * 
         * <strong>example:</strong>
         * <p>132</p>
         */
        @NameInMap("FirstPacket")
        public String firstPacket;

        /**
         * <p>The time consumed by initialization.</p>
         * 
         * <strong>example:</strong>
         * <p>1100</p>
         */
        @NameInMap("Initialized")
        public String initialized;

        /**
         * <p>The timestamp of the returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-10T20:00:00Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeRTSNativeSDKFirstFrameCostResponseBodyFirstFrameCostData build(java.util.Map<String, ?> map) throws Exception {
            DescribeRTSNativeSDKFirstFrameCostResponseBodyFirstFrameCostData self = new DescribeRTSNativeSDKFirstFrameCostResponseBodyFirstFrameCostData();
            return TeaModel.build(map, self);
        }

        public DescribeRTSNativeSDKFirstFrameCostResponseBodyFirstFrameCostData setConnected(String connected) {
            this.connected = connected;
            return this;
        }
        public String getConnected() {
            return this.connected;
        }

        public DescribeRTSNativeSDKFirstFrameCostResponseBodyFirstFrameCostData setFinishGetStreamInfo(String finishGetStreamInfo) {
            this.finishGetStreamInfo = finishGetStreamInfo;
            return this;
        }
        public String getFinishGetStreamInfo() {
            return this.finishGetStreamInfo;
        }

        public DescribeRTSNativeSDKFirstFrameCostResponseBodyFirstFrameCostData setFirstFrameComplete(String firstFrameComplete) {
            this.firstFrameComplete = firstFrameComplete;
            return this;
        }
        public String getFirstFrameComplete() {
            return this.firstFrameComplete;
        }

        public DescribeRTSNativeSDKFirstFrameCostResponseBodyFirstFrameCostData setFirstPacket(String firstPacket) {
            this.firstPacket = firstPacket;
            return this;
        }
        public String getFirstPacket() {
            return this.firstPacket;
        }

        public DescribeRTSNativeSDKFirstFrameCostResponseBodyFirstFrameCostData setInitialized(String initialized) {
            this.initialized = initialized;
            return this;
        }
        public String getInitialized() {
            return this.initialized;
        }

        public DescribeRTSNativeSDKFirstFrameCostResponseBodyFirstFrameCostData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

}
