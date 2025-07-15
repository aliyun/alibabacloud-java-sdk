// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeRTSNativeSDKVvDataResponseBody extends TeaModel {
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
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
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

    /**
     * <p>The total number of playbacks and the number of successful playbacks at each interval.</p>
     */
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
        /**
         * <p>The timestamp of the returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-10T20:00:00Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <p>The number of successful playbacks within the period of time.</p>
         * 
         * <strong>example:</strong>
         * <p>99</p>
         */
        @NameInMap("VvSuccess")
        public String vvSuccess;

        /**
         * <p>The total number of playbacks within the period of time.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
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
