// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeMeterLiveBypassDurationResponseBody extends TeaModel {
    /**
     * <p>The total audio-only duration. Audio-only is a basic specification. Unit: minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("AudioSummaryDuration")
    public Long audioSummaryDuration;

    /**
     * <p>The usage statistics for each time granularity.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeMeterLiveBypassDurationResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4B460F8B-993C-4F48-B98A-910811DEBFEB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total single-stream relay duration for audio. Unit: minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("SingleAudioSummaryDuration")
    public Long singleAudioSummaryDuration;

    /**
     * <p>The total single-stream relay duration for video. Unit: minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("SingleVideoSummaryDuration")
    public Long singleVideoSummaryDuration;

    /**
     * <p>The total duration. Unit: minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>150</p>
     */
    @NameInMap("TotalSummaryDuration")
    public Long totalSummaryDuration;

    /**
     * <p>The total Full HD duration. The video resolution is 1920 × 1080 or lower. Unit: minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("V1080SummaryDuration")
    public Long v1080SummaryDuration;

    /**
     * <p>The total standard definition (SD) duration. The video resolution is 640 × 480 or lower. Unit: minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("V480SummaryDuration")
    public Long v480SummaryDuration;

    /**
     * <p>The total high definition (HD) duration. The video resolution is 1280 × 720 or lower. Unit: minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("V720SummaryDuration")
    public Long v720SummaryDuration;

    public static DescribeMeterLiveBypassDurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterLiveBypassDurationResponseBody self = new DescribeMeterLiveBypassDurationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMeterLiveBypassDurationResponseBody setAudioSummaryDuration(Long audioSummaryDuration) {
        this.audioSummaryDuration = audioSummaryDuration;
        return this;
    }
    public Long getAudioSummaryDuration() {
        return this.audioSummaryDuration;
    }

    public DescribeMeterLiveBypassDurationResponseBody setData(java.util.List<DescribeMeterLiveBypassDurationResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeMeterLiveBypassDurationResponseBodyData> getData() {
        return this.data;
    }

    public DescribeMeterLiveBypassDurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMeterLiveBypassDurationResponseBody setSingleAudioSummaryDuration(Long singleAudioSummaryDuration) {
        this.singleAudioSummaryDuration = singleAudioSummaryDuration;
        return this;
    }
    public Long getSingleAudioSummaryDuration() {
        return this.singleAudioSummaryDuration;
    }

    public DescribeMeterLiveBypassDurationResponseBody setSingleVideoSummaryDuration(Long singleVideoSummaryDuration) {
        this.singleVideoSummaryDuration = singleVideoSummaryDuration;
        return this;
    }
    public Long getSingleVideoSummaryDuration() {
        return this.singleVideoSummaryDuration;
    }

    public DescribeMeterLiveBypassDurationResponseBody setTotalSummaryDuration(Long totalSummaryDuration) {
        this.totalSummaryDuration = totalSummaryDuration;
        return this;
    }
    public Long getTotalSummaryDuration() {
        return this.totalSummaryDuration;
    }

    public DescribeMeterLiveBypassDurationResponseBody setV1080SummaryDuration(Long v1080SummaryDuration) {
        this.v1080SummaryDuration = v1080SummaryDuration;
        return this;
    }
    public Long getV1080SummaryDuration() {
        return this.v1080SummaryDuration;
    }

    public DescribeMeterLiveBypassDurationResponseBody setV480SummaryDuration(Long v480SummaryDuration) {
        this.v480SummaryDuration = v480SummaryDuration;
        return this;
    }
    public Long getV480SummaryDuration() {
        return this.v480SummaryDuration;
    }

    public DescribeMeterLiveBypassDurationResponseBody setV720SummaryDuration(Long v720SummaryDuration) {
        this.v720SummaryDuration = v720SummaryDuration;
        return this;
    }
    public Long getV720SummaryDuration() {
        return this.v720SummaryDuration;
    }

    public static class DescribeMeterLiveBypassDurationResponseBodyData extends TeaModel {
        /**
         * <p>The audio-only duration. Audio-only is a basic specification. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("AudioDuration")
        public Long audioDuration;

        /**
         * <p>The single-stream relay duration for audio. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Single_Audio")
        public Long singleAudio;

        /**
         * <p>The single-stream relay duration for video. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Single_Video")
        public Long singleVideo;

        /**
         * <p>The timestamp of the data returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-10T20:00:00Z</p>
         */
        @NameInMap("Timestamp")
        public String timestamp;

        /**
         * <p>The duration. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>150</p>
         */
        @NameInMap("TotalDuration")
        public Long totalDuration;

        /**
         * <p>The Full HD duration. The video resolution is 1920 × 1080 or lower. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("V1080Duration")
        public Long v1080Duration;

        /**
         * <p>The SD duration. The video resolution is 640 × 480 or lower. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("V480Duration")
        public Long v480Duration;

        /**
         * <p>The HD duration. The video resolution is 1280 × 720 or lower. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("V720Duration")
        public Long v720Duration;

        public static DescribeMeterLiveBypassDurationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeterLiveBypassDurationResponseBodyData self = new DescribeMeterLiveBypassDurationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMeterLiveBypassDurationResponseBodyData setAudioDuration(Long audioDuration) {
            this.audioDuration = audioDuration;
            return this;
        }
        public Long getAudioDuration() {
            return this.audioDuration;
        }

        public DescribeMeterLiveBypassDurationResponseBodyData setSingleAudio(Long singleAudio) {
            this.singleAudio = singleAudio;
            return this;
        }
        public Long getSingleAudio() {
            return this.singleAudio;
        }

        public DescribeMeterLiveBypassDurationResponseBodyData setSingleVideo(Long singleVideo) {
            this.singleVideo = singleVideo;
            return this;
        }
        public Long getSingleVideo() {
            return this.singleVideo;
        }

        public DescribeMeterLiveBypassDurationResponseBodyData setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public DescribeMeterLiveBypassDurationResponseBodyData setTotalDuration(Long totalDuration) {
            this.totalDuration = totalDuration;
            return this;
        }
        public Long getTotalDuration() {
            return this.totalDuration;
        }

        public DescribeMeterLiveBypassDurationResponseBodyData setV1080Duration(Long v1080Duration) {
            this.v1080Duration = v1080Duration;
            return this;
        }
        public Long getV1080Duration() {
            return this.v1080Duration;
        }

        public DescribeMeterLiveBypassDurationResponseBodyData setV480Duration(Long v480Duration) {
            this.v480Duration = v480Duration;
            return this;
        }
        public Long getV480Duration() {
            return this.v480Duration;
        }

        public DescribeMeterLiveBypassDurationResponseBodyData setV720Duration(Long v720Duration) {
            this.v720Duration = v720Duration;
            return this;
        }
        public Long getV720Duration() {
            return this.v720Duration;
        }

    }

}
