// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeRTSNativeSDKFirstFrameCostResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    public String dataInterval;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("FirstFrameCostData")
    public java.util.List<DescribeRTSNativeSDKFirstFrameCostResponseBodyFirstFrameCostData> firstFrameCostData;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Connected")
        public String connected;

        @NameInMap("FinishGetStreamInfo")
        public String finishGetStreamInfo;

        @NameInMap("FirstFrameComplete")
        public String firstFrameComplete;

        @NameInMap("FirstPacket")
        public String firstPacket;

        @NameInMap("Initialized")
        public String initialized;

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
