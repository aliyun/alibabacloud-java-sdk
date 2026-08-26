// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeRTSNativeSDKPlayFailStatusResponseBody extends TeaModel {
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
     * <p>The total number of error status codes for each time interval.</p>
     */
    @NameInMap("PlayFailStatus")
    public java.util.List<DescribeRTSNativeSDKPlayFailStatusResponseBodyPlayFailStatus> playFailStatus;

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

    public static DescribeRTSNativeSDKPlayFailStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRTSNativeSDKPlayFailStatusResponseBody self = new DescribeRTSNativeSDKPlayFailStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRTSNativeSDKPlayFailStatusResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeRTSNativeSDKPlayFailStatusResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeRTSNativeSDKPlayFailStatusResponseBody setPlayFailStatus(java.util.List<DescribeRTSNativeSDKPlayFailStatusResponseBodyPlayFailStatus> playFailStatus) {
        this.playFailStatus = playFailStatus;
        return this;
    }
    public java.util.List<DescribeRTSNativeSDKPlayFailStatusResponseBodyPlayFailStatus> getPlayFailStatus() {
        return this.playFailStatus;
    }

    public DescribeRTSNativeSDKPlayFailStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRTSNativeSDKPlayFailStatusResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeRTSNativeSDKPlayFailStatusResponseBodyPlayFailStatus extends TeaModel {
        /**
         * <p>The beginning of the time interval. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-10T20:00:00Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <p>DNS resolution failure.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("V20001")
        public String v20001;

        /**
         * <p>Authentication failure.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("V20002")
        public String v20002;

        /**
         * <p>Connection signaling timeout.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("V20011")
        public String v20011;

        /**
         * <p>Subscription signaling error.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("V20012")
        public String v20012;

        /**
         * <p>Subscribed stream does not exist.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("V20013")
        public String v20013;

        /**
         * <p>Media packet receiving timeout.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("V20052")
        public String v20052;

        public static DescribeRTSNativeSDKPlayFailStatusResponseBodyPlayFailStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeRTSNativeSDKPlayFailStatusResponseBodyPlayFailStatus self = new DescribeRTSNativeSDKPlayFailStatusResponseBodyPlayFailStatus();
            return TeaModel.build(map, self);
        }

        public DescribeRTSNativeSDKPlayFailStatusResponseBodyPlayFailStatus setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeRTSNativeSDKPlayFailStatusResponseBodyPlayFailStatus setV20001(String v20001) {
            this.v20001 = v20001;
            return this;
        }
        public String getV20001() {
            return this.v20001;
        }

        public DescribeRTSNativeSDKPlayFailStatusResponseBodyPlayFailStatus setV20002(String v20002) {
            this.v20002 = v20002;
            return this;
        }
        public String getV20002() {
            return this.v20002;
        }

        public DescribeRTSNativeSDKPlayFailStatusResponseBodyPlayFailStatus setV20011(String v20011) {
            this.v20011 = v20011;
            return this;
        }
        public String getV20011() {
            return this.v20011;
        }

        public DescribeRTSNativeSDKPlayFailStatusResponseBodyPlayFailStatus setV20012(String v20012) {
            this.v20012 = v20012;
            return this;
        }
        public String getV20012() {
            return this.v20012;
        }

        public DescribeRTSNativeSDKPlayFailStatusResponseBodyPlayFailStatus setV20013(String v20013) {
            this.v20013 = v20013;
            return this;
        }
        public String getV20013() {
            return this.v20013;
        }

        public DescribeRTSNativeSDKPlayFailStatusResponseBodyPlayFailStatus setV20052(String v20052) {
            this.v20052 = v20052;
            return this;
        }
        public String getV20052() {
            return this.v20052;
        }

    }

}
