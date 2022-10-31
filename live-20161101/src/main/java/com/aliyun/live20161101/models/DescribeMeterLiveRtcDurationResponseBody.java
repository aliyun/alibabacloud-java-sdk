// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeMeterLiveRtcDurationResponseBody extends TeaModel {
    @NameInMap("AudioSummaryDuration")
    public Long audioSummaryDuration;

    @NameInMap("Data")
    public java.util.List<DescribeMeterLiveRtcDurationResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalSummaryDuration")
    public Long totalSummaryDuration;

    @NameInMap("V1080SummaryDuration")
    public Long v1080SummaryDuration;

    @NameInMap("V480SummaryDuration")
    public Long v480SummaryDuration;

    @NameInMap("V720SummaryDuration")
    public Long v720SummaryDuration;

    public static DescribeMeterLiveRtcDurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterLiveRtcDurationResponseBody self = new DescribeMeterLiveRtcDurationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMeterLiveRtcDurationResponseBody setAudioSummaryDuration(Long audioSummaryDuration) {
        this.audioSummaryDuration = audioSummaryDuration;
        return this;
    }
    public Long getAudioSummaryDuration() {
        return this.audioSummaryDuration;
    }

    public DescribeMeterLiveRtcDurationResponseBody setData(java.util.List<DescribeMeterLiveRtcDurationResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeMeterLiveRtcDurationResponseBodyData> getData() {
        return this.data;
    }

    public DescribeMeterLiveRtcDurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMeterLiveRtcDurationResponseBody setTotalSummaryDuration(Long totalSummaryDuration) {
        this.totalSummaryDuration = totalSummaryDuration;
        return this;
    }
    public Long getTotalSummaryDuration() {
        return this.totalSummaryDuration;
    }

    public DescribeMeterLiveRtcDurationResponseBody setV1080SummaryDuration(Long v1080SummaryDuration) {
        this.v1080SummaryDuration = v1080SummaryDuration;
        return this;
    }
    public Long getV1080SummaryDuration() {
        return this.v1080SummaryDuration;
    }

    public DescribeMeterLiveRtcDurationResponseBody setV480SummaryDuration(Long v480SummaryDuration) {
        this.v480SummaryDuration = v480SummaryDuration;
        return this;
    }
    public Long getV480SummaryDuration() {
        return this.v480SummaryDuration;
    }

    public DescribeMeterLiveRtcDurationResponseBody setV720SummaryDuration(Long v720SummaryDuration) {
        this.v720SummaryDuration = v720SummaryDuration;
        return this;
    }
    public Long getV720SummaryDuration() {
        return this.v720SummaryDuration;
    }

    public static class DescribeMeterLiveRtcDurationResponseBodyData extends TeaModel {
        @NameInMap("AudioDuration")
        public Long audioDuration;

        @NameInMap("Timestamp")
        public String timestamp;

        @NameInMap("TotalDuration")
        public Long totalDuration;

        @NameInMap("V1080Duration")
        public Long v1080Duration;

        @NameInMap("V480Duration")
        public Long v480Duration;

        @NameInMap("V720Duration")
        public Long v720Duration;

        public static DescribeMeterLiveRtcDurationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeterLiveRtcDurationResponseBodyData self = new DescribeMeterLiveRtcDurationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMeterLiveRtcDurationResponseBodyData setAudioDuration(Long audioDuration) {
            this.audioDuration = audioDuration;
            return this;
        }
        public Long getAudioDuration() {
            return this.audioDuration;
        }

        public DescribeMeterLiveRtcDurationResponseBodyData setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public DescribeMeterLiveRtcDurationResponseBodyData setTotalDuration(Long totalDuration) {
            this.totalDuration = totalDuration;
            return this;
        }
        public Long getTotalDuration() {
            return this.totalDuration;
        }

        public DescribeMeterLiveRtcDurationResponseBodyData setV1080Duration(Long v1080Duration) {
            this.v1080Duration = v1080Duration;
            return this;
        }
        public Long getV1080Duration() {
            return this.v1080Duration;
        }

        public DescribeMeterLiveRtcDurationResponseBodyData setV480Duration(Long v480Duration) {
            this.v480Duration = v480Duration;
            return this;
        }
        public Long getV480Duration() {
            return this.v480Duration;
        }

        public DescribeMeterLiveRtcDurationResponseBodyData setV720Duration(Long v720Duration) {
            this.v720Duration = v720Duration;
            return this;
        }
        public Long getV720Duration() {
            return this.v720Duration;
        }

    }

}
