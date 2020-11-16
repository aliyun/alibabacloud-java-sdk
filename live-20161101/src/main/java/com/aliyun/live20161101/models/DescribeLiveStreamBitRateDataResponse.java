// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamBitRateDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("FrameRateAndBitRateInfos")
    @Validation(required = true)
    public DescribeLiveStreamBitRateDataResponseFrameRateAndBitRateInfos frameRateAndBitRateInfos;

    public static DescribeLiveStreamBitRateDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamBitRateDataResponse self = new DescribeLiveStreamBitRateDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamBitRateDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveStreamBitRateDataResponse setFrameRateAndBitRateInfos(DescribeLiveStreamBitRateDataResponseFrameRateAndBitRateInfos frameRateAndBitRateInfos) {
        this.frameRateAndBitRateInfos = frameRateAndBitRateInfos;
        return this;
    }
    public DescribeLiveStreamBitRateDataResponseFrameRateAndBitRateInfos getFrameRateAndBitRateInfos() {
        return this.frameRateAndBitRateInfos;
    }

    public static class DescribeLiveStreamBitRateDataResponseFrameRateAndBitRateInfosFrameRateAndBitRateInfo extends TeaModel {
        @NameInMap("StreamUrl")
        @Validation(required = true)
        public String streamUrl;

        @NameInMap("VideoFrameRate")
        @Validation(required = true)
        public Float videoFrameRate;

        @NameInMap("AudioFrameRate")
        @Validation(required = true)
        public Float audioFrameRate;

        @NameInMap("BitRate")
        @Validation(required = true)
        public Float bitRate;

        @NameInMap("Time")
        @Validation(required = true)
        public String time;

        public static DescribeLiveStreamBitRateDataResponseFrameRateAndBitRateInfosFrameRateAndBitRateInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamBitRateDataResponseFrameRateAndBitRateInfosFrameRateAndBitRateInfo self = new DescribeLiveStreamBitRateDataResponseFrameRateAndBitRateInfosFrameRateAndBitRateInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamBitRateDataResponseFrameRateAndBitRateInfosFrameRateAndBitRateInfo setStreamUrl(String streamUrl) {
            this.streamUrl = streamUrl;
            return this;
        }
        public String getStreamUrl() {
            return this.streamUrl;
        }

        public DescribeLiveStreamBitRateDataResponseFrameRateAndBitRateInfosFrameRateAndBitRateInfo setVideoFrameRate(Float videoFrameRate) {
            this.videoFrameRate = videoFrameRate;
            return this;
        }
        public Float getVideoFrameRate() {
            return this.videoFrameRate;
        }

        public DescribeLiveStreamBitRateDataResponseFrameRateAndBitRateInfosFrameRateAndBitRateInfo setAudioFrameRate(Float audioFrameRate) {
            this.audioFrameRate = audioFrameRate;
            return this;
        }
        public Float getAudioFrameRate() {
            return this.audioFrameRate;
        }

        public DescribeLiveStreamBitRateDataResponseFrameRateAndBitRateInfosFrameRateAndBitRateInfo setBitRate(Float bitRate) {
            this.bitRate = bitRate;
            return this;
        }
        public Float getBitRate() {
            return this.bitRate;
        }

        public DescribeLiveStreamBitRateDataResponseFrameRateAndBitRateInfosFrameRateAndBitRateInfo setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class DescribeLiveStreamBitRateDataResponseFrameRateAndBitRateInfos extends TeaModel {
        @NameInMap("FrameRateAndBitRateInfo")
        @Validation(required = true)
        public java.util.List<DescribeLiveStreamBitRateDataResponseFrameRateAndBitRateInfosFrameRateAndBitRateInfo> frameRateAndBitRateInfo;

        public static DescribeLiveStreamBitRateDataResponseFrameRateAndBitRateInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamBitRateDataResponseFrameRateAndBitRateInfos self = new DescribeLiveStreamBitRateDataResponseFrameRateAndBitRateInfos();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamBitRateDataResponseFrameRateAndBitRateInfos setFrameRateAndBitRateInfo(java.util.List<DescribeLiveStreamBitRateDataResponseFrameRateAndBitRateInfosFrameRateAndBitRateInfo> frameRateAndBitRateInfo) {
            this.frameRateAndBitRateInfo = frameRateAndBitRateInfo;
            return this;
        }
        public java.util.List<DescribeLiveStreamBitRateDataResponseFrameRateAndBitRateInfosFrameRateAndBitRateInfo> getFrameRateAndBitRateInfo() {
            return this.frameRateAndBitRateInfo;
        }

    }

}
