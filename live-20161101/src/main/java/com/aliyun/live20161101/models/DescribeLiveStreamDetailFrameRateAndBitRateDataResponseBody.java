// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamDetailFrameRateAndBitRateDataResponseBody extends TeaModel {
    /**
     * <p>The audio and video frame rates and bitrates at each time granularity.</p>
     */
    @NameInMap("FrameRateAndBitRateInfos")
    public java.util.List<DescribeLiveStreamDetailFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfos> frameRateAndBitRateInfos;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BC858082-736F-4A25-867B-E5B67C85ACF7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLiveStreamDetailFrameRateAndBitRateDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamDetailFrameRateAndBitRateDataResponseBody self = new DescribeLiveStreamDetailFrameRateAndBitRateDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamDetailFrameRateAndBitRateDataResponseBody setFrameRateAndBitRateInfos(java.util.List<DescribeLiveStreamDetailFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfos> frameRateAndBitRateInfos) {
        this.frameRateAndBitRateInfos = frameRateAndBitRateInfos;
        return this;
    }
    public java.util.List<DescribeLiveStreamDetailFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfos> getFrameRateAndBitRateInfos() {
        return this.frameRateAndBitRateInfos;
    }

    public DescribeLiveStreamDetailFrameRateAndBitRateDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLiveStreamDetailFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfos extends TeaModel {
        /**
         * <p>The audio bitrate of the live stream. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("AudioBitRate")
        public Float audioBitRate;

        /**
         * <p>The audio frame rate of the live stream. Unit: FPS.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("AudioFrameRate")
        public Float audioFrameRate;

        /**
         * <p>The bitrate of the live stream. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>1420</p>
         */
        @NameInMap("BitRate")
        public Float bitRate;

        /**
         * <p>The URL of the live stream.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://example.com/AppName/exampleStreamName</p>
         */
        @NameInMap("StreamUrl")
        public String streamUrl;

        /**
         * <p>The time when the data was collected. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-09-13T16:04:00Z</p>
         */
        @NameInMap("Time")
        public String time;

        /**
         * <p>The video bitrate of the live stream. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>1200</p>
         */
        @NameInMap("VideoBitRate")
        public Float videoBitRate;

        /**
         * <p>The video frame rate of the live stream. Unit: frames per second (FPS).</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("VideoFrameRate")
        public Float videoFrameRate;

        public static DescribeLiveStreamDetailFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamDetailFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfos self = new DescribeLiveStreamDetailFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfos();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamDetailFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfos setAudioBitRate(Float audioBitRate) {
            this.audioBitRate = audioBitRate;
            return this;
        }
        public Float getAudioBitRate() {
            return this.audioBitRate;
        }

        public DescribeLiveStreamDetailFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfos setAudioFrameRate(Float audioFrameRate) {
            this.audioFrameRate = audioFrameRate;
            return this;
        }
        public Float getAudioFrameRate() {
            return this.audioFrameRate;
        }

        public DescribeLiveStreamDetailFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfos setBitRate(Float bitRate) {
            this.bitRate = bitRate;
            return this;
        }
        public Float getBitRate() {
            return this.bitRate;
        }

        public DescribeLiveStreamDetailFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfos setStreamUrl(String streamUrl) {
            this.streamUrl = streamUrl;
            return this;
        }
        public String getStreamUrl() {
            return this.streamUrl;
        }

        public DescribeLiveStreamDetailFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfos setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public DescribeLiveStreamDetailFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfos setVideoBitRate(Float videoBitRate) {
            this.videoBitRate = videoBitRate;
            return this;
        }
        public Float getVideoBitRate() {
            return this.videoBitRate;
        }

        public DescribeLiveStreamDetailFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfos setVideoFrameRate(Float videoFrameRate) {
            this.videoFrameRate = videoFrameRate;
            return this;
        }
        public Float getVideoFrameRate() {
            return this.videoFrameRate;
        }

    }

}
