// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeRTSNativeSDKPlayTimeResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    public String dataInterval;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("PlayTimeData")
    public java.util.List<DescribeRTSNativeSDKPlayTimeResponseBodyPlayTimeData> playTimeData;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("PlayTime")
        public String playTime;

        @NameInMap("StallTime")
        public String stallTime;

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
