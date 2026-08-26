// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveRtcRecordUsageDataResponseBody extends TeaModel {
    /**
     * <p>The ID of the ApsaraVideo Real-time Communication application that was queried.</p>
     * 
     * <strong>example:</strong>
     * <p>7fd341b3-c6fa-43e1-96b8-7295a1dd****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The audio-only summary duration. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("AudioSummaryDuration")
    public Double audioSummaryDuration;

    /**
     * <p>The usage statistics information.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeLiveRtcRecordUsageDataResponseBodyData> data;

    /**
     * <p>The recording mode. Valid values:</p>
     * <ul>
     * <li><p>0: single-stream recording mode.</p>
     * </li>
     * <li><p>1: stream mixing recording mode.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RecordMode")
    public String recordMode;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F2*************B92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total summary duration. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>150</p>
     */
    @NameInMap("TotalSummaryDuration")
    public Double totalSummaryDuration;

    /**
     * <p>The summary duration of video above 720p (including 1080p). Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("V1080SummaryDuration")
    public Double v1080SummaryDuration;

    /**
     * <p>The summary duration of video at 480p or lower. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("V480SummaryDuration")
    public Double v480SummaryDuration;

    /**
     * <p>The summary duration of video at 720p or lower. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("V720SummaryDuration")
    public Double v720SummaryDuration;

    public static DescribeLiveRtcRecordUsageDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveRtcRecordUsageDataResponseBody self = new DescribeLiveRtcRecordUsageDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveRtcRecordUsageDataResponseBody setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeLiveRtcRecordUsageDataResponseBody setAudioSummaryDuration(Double audioSummaryDuration) {
        this.audioSummaryDuration = audioSummaryDuration;
        return this;
    }
    public Double getAudioSummaryDuration() {
        return this.audioSummaryDuration;
    }

    public DescribeLiveRtcRecordUsageDataResponseBody setData(java.util.List<DescribeLiveRtcRecordUsageDataResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeLiveRtcRecordUsageDataResponseBodyData> getData() {
        return this.data;
    }

    public DescribeLiveRtcRecordUsageDataResponseBody setRecordMode(String recordMode) {
        this.recordMode = recordMode;
        return this;
    }
    public String getRecordMode() {
        return this.recordMode;
    }

    public DescribeLiveRtcRecordUsageDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveRtcRecordUsageDataResponseBody setTotalSummaryDuration(Double totalSummaryDuration) {
        this.totalSummaryDuration = totalSummaryDuration;
        return this;
    }
    public Double getTotalSummaryDuration() {
        return this.totalSummaryDuration;
    }

    public DescribeLiveRtcRecordUsageDataResponseBody setV1080SummaryDuration(Double v1080SummaryDuration) {
        this.v1080SummaryDuration = v1080SummaryDuration;
        return this;
    }
    public Double getV1080SummaryDuration() {
        return this.v1080SummaryDuration;
    }

    public DescribeLiveRtcRecordUsageDataResponseBody setV480SummaryDuration(Double v480SummaryDuration) {
        this.v480SummaryDuration = v480SummaryDuration;
        return this;
    }
    public Double getV480SummaryDuration() {
        return this.v480SummaryDuration;
    }

    public DescribeLiveRtcRecordUsageDataResponseBody setV720SummaryDuration(Double v720SummaryDuration) {
        this.v720SummaryDuration = v720SummaryDuration;
        return this;
    }
    public Double getV720SummaryDuration() {
        return this.v720SummaryDuration;
    }

    public static class DescribeLiveRtcRecordUsageDataResponseBodyData extends TeaModel {
        /**
         * <p>The audio-only duration. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("AudioDuration")
        public Double audioDuration;

        /**
         * <p>The timestamp of the data point. Format: yyyy-MM-ddTHH:mm:ssZ (UTC time).</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-10T20:00:00Z</p>
         */
        @NameInMap("Timestamp")
        public String timestamp;

        /**
         * <p>The total duration. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>150</p>
         */
        @NameInMap("TotalDuration")
        public Double totalDuration;

        /**
         * <p>The duration of video above 720p. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("V1080Duration")
        public Double v1080Duration;

        /**
         * <p>The duration of video at 480p or lower. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("V480Duration")
        public Double v480Duration;

        /**
         * <p>The duration of video at 720p or lower. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("V720Duration")
        public Double v720Duration;

        public static DescribeLiveRtcRecordUsageDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveRtcRecordUsageDataResponseBodyData self = new DescribeLiveRtcRecordUsageDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeLiveRtcRecordUsageDataResponseBodyData setAudioDuration(Double audioDuration) {
            this.audioDuration = audioDuration;
            return this;
        }
        public Double getAudioDuration() {
            return this.audioDuration;
        }

        public DescribeLiveRtcRecordUsageDataResponseBodyData setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public DescribeLiveRtcRecordUsageDataResponseBodyData setTotalDuration(Double totalDuration) {
            this.totalDuration = totalDuration;
            return this;
        }
        public Double getTotalDuration() {
            return this.totalDuration;
        }

        public DescribeLiveRtcRecordUsageDataResponseBodyData setV1080Duration(Double v1080Duration) {
            this.v1080Duration = v1080Duration;
            return this;
        }
        public Double getV1080Duration() {
            return this.v1080Duration;
        }

        public DescribeLiveRtcRecordUsageDataResponseBodyData setV480Duration(Double v480Duration) {
            this.v480Duration = v480Duration;
            return this;
        }
        public Double getV480Duration() {
            return this.v480Duration;
        }

        public DescribeLiveRtcRecordUsageDataResponseBodyData setV720Duration(Double v720Duration) {
            this.v720Duration = v720Duration;
            return this;
        }
        public Double getV720Duration() {
            return this.v720Duration;
        }

    }

}
