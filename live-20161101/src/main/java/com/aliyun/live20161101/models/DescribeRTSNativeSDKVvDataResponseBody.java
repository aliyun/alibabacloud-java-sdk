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
     * <p>The end time. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-10T21:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Id</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start time. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-10T20:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The total playback count and total successful playback count for each time interval. Unit: count.</p>
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
         * <p>The start time of the time interval. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-10T20:00:00Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <p>The total number of successful playbacks within the specified time period.</p>
         * 
         * <strong>example:</strong>
         * <p>99</p>
         */
        @NameInMap("VvSuccess")
        public String vvSuccess;

        /**
         * <p>The total number of playbacks within the specified time period.</p>
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
