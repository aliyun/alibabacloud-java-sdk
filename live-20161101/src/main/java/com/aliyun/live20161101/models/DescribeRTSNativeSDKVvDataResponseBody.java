// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeRTSNativeSDKVvDataResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    public String dataInterval;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("VvData")
    public java.util.List<DescribeRTSNativeSDKVvDataResponseBodyVvData> vvData;

    public static DescribeRTSNativeSDKVvDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRTSNativeSDKVvDataResponseBody self = new DescribeRTSNativeSDKVvDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRTSNativeSDKVvDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeRTSNativeSDKVvDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeRTSNativeSDKVvDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRTSNativeSDKVvDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeRTSNativeSDKVvDataResponseBody setVvData(java.util.List<DescribeRTSNativeSDKVvDataResponseBodyVvData> vvData) {
        this.vvData = vvData;
        return this;
    }
    public java.util.List<DescribeRTSNativeSDKVvDataResponseBodyVvData> getVvData() {
        return this.vvData;
    }

    public static class DescribeRTSNativeSDKVvDataResponseBodyVvData extends TeaModel {
        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("VvSuccess")
        public String vvSuccess;

        @NameInMap("VvTotal")
        public String vvTotal;

        public static DescribeRTSNativeSDKVvDataResponseBodyVvData build(java.util.Map<String, ?> map) throws Exception {
            DescribeRTSNativeSDKVvDataResponseBodyVvData self = new DescribeRTSNativeSDKVvDataResponseBodyVvData();
            return TeaModel.build(map, self);
        }

        public DescribeRTSNativeSDKVvDataResponseBodyVvData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeRTSNativeSDKVvDataResponseBodyVvData setVvSuccess(String vvSuccess) {
            this.vvSuccess = vvSuccess;
            return this;
        }
        public String getVvSuccess() {
            return this.vvSuccess;
        }

        public DescribeRTSNativeSDKVvDataResponseBodyVvData setVvTotal(String vvTotal) {
            this.vvTotal = vvTotal;
            return this;
        }
        public String getVvTotal() {
            return this.vvTotal;
        }

    }

}
