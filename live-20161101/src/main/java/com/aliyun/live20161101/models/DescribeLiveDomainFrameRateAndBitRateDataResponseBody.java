// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainFrameRateAndBitRateDataResponseBody extends TeaModel {
    /**
     * <p>The frame rates and bitrates of the live streams that were queried.</p>
     */
    @NameInMap("FrameRateAndBitRateInfos")
    public DescribeLiveDomainFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfos frameRateAndBitRateInfos;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C3F2C2C4-59BB-4B62-81FF-345BE557E3E3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLiveDomainFrameRateAndBitRateDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainFrameRateAndBitRateDataResponseBody self = new DescribeLiveDomainFrameRateAndBitRateDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainFrameRateAndBitRateDataResponseBody setFrameRateAndBitRateInfos(DescribeLiveDomainFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfos frameRateAndBitRateInfos) {
        this.frameRateAndBitRateInfos = frameRateAndBitRateInfos;
        return this;
    }
    public DescribeLiveDomainFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfos getFrameRateAndBitRateInfos() {
        return this.frameRateAndBitRateInfos;
    }

    public DescribeLiveDomainFrameRateAndBitRateDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLiveDomainFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfosFrameRateAndBitRateInfo extends TeaModel {
        /**
         * <p>The audio frame rate of the live stream. Unit: FPS.</p>
         * 
         * <strong>example:</strong>
         * <p>42.9</p>
         */
        @NameInMap("AudioFrameRate")
        public Float audioFrameRate;

        /**
         * <p>The bitrate of the live stream. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>30693.96</p>
         */
        @NameInMap("BitRate")
        public Float bitRate;

        /**
         * <p>The URL of the live stream.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://demo.aliyundoc.com/test/liveStream****_3_4</p>
         */
        @NameInMap("StreamUrl")
        public String streamUrl;

        /**
         * <p>The video frame rate of the live stream. Unit: frames per second (FPS).</p>
         * 
         * <strong>example:</strong>
         * <p>24.9</p>
         */
        @NameInMap("VideoFrameRate")
        public Float videoFrameRate;

        public static DescribeLiveDomainFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfosFrameRateAndBitRateInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfosFrameRateAndBitRateInfo self = new DescribeLiveDomainFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfosFrameRateAndBitRateInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfosFrameRateAndBitRateInfo setAudioFrameRate(Float audioFrameRate) {
            this.audioFrameRate = audioFrameRate;
            return this;
        }
        public Float getAudioFrameRate() {
            return this.audioFrameRate;
        }

        public DescribeLiveDomainFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfosFrameRateAndBitRateInfo setBitRate(Float bitRate) {
            this.bitRate = bitRate;
            return this;
        }
        public Float getBitRate() {
            return this.bitRate;
        }

        public DescribeLiveDomainFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfosFrameRateAndBitRateInfo setStreamUrl(String streamUrl) {
            this.streamUrl = streamUrl;
            return this;
        }
        public String getStreamUrl() {
            return this.streamUrl;
        }

        public DescribeLiveDomainFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfosFrameRateAndBitRateInfo setVideoFrameRate(Float videoFrameRate) {
            this.videoFrameRate = videoFrameRate;
            return this;
        }
        public Float getVideoFrameRate() {
            return this.videoFrameRate;
        }

    }

    public static class DescribeLiveDomainFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfos extends TeaModel {
        @NameInMap("FrameRateAndBitRateInfo")
        public java.util.List<DescribeLiveDomainFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfosFrameRateAndBitRateInfo> frameRateAndBitRateInfo;

        public static DescribeLiveDomainFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfos self = new DescribeLiveDomainFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfos();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfos setFrameRateAndBitRateInfo(java.util.List<DescribeLiveDomainFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfosFrameRateAndBitRateInfo> frameRateAndBitRateInfo) {
            this.frameRateAndBitRateInfo = frameRateAndBitRateInfo;
            return this;
        }
        public java.util.List<DescribeLiveDomainFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfosFrameRateAndBitRateInfo> getFrameRateAndBitRateInfo() {
            return this.frameRateAndBitRateInfo;
        }

    }

}
