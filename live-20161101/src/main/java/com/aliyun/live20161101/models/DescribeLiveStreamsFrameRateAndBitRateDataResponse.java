// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamsFrameRateAndBitRateDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("FrameRateAndBitRateInfos")
    @Validation(required = true)
    public DescribeLiveStreamsFrameRateAndBitRateDataResponseFrameRateAndBitRateInfos frameRateAndBitRateInfos;

    public static DescribeLiveStreamsFrameRateAndBitRateDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamsFrameRateAndBitRateDataResponse self = new DescribeLiveStreamsFrameRateAndBitRateDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamsFrameRateAndBitRateDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveStreamsFrameRateAndBitRateDataResponse setFrameRateAndBitRateInfos(DescribeLiveStreamsFrameRateAndBitRateDataResponseFrameRateAndBitRateInfos frameRateAndBitRateInfos) {
        this.frameRateAndBitRateInfos = frameRateAndBitRateInfos;
        return this;
    }
    public DescribeLiveStreamsFrameRateAndBitRateDataResponseFrameRateAndBitRateInfos getFrameRateAndBitRateInfos() {
        return this.frameRateAndBitRateInfos;
    }

    public static class DescribeLiveStreamsFrameRateAndBitRateDataResponseFrameRateAndBitRateInfosFrameRateAndBitRateInfo extends TeaModel {
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

        public static DescribeLiveStreamsFrameRateAndBitRateDataResponseFrameRateAndBitRateInfosFrameRateAndBitRateInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamsFrameRateAndBitRateDataResponseFrameRateAndBitRateInfosFrameRateAndBitRateInfo self = new DescribeLiveStreamsFrameRateAndBitRateDataResponseFrameRateAndBitRateInfosFrameRateAndBitRateInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamsFrameRateAndBitRateDataResponseFrameRateAndBitRateInfosFrameRateAndBitRateInfo setStreamUrl(String streamUrl) {
            this.streamUrl = streamUrl;
            return this;
        }
        public String getStreamUrl() {
            return this.streamUrl;
        }

        public DescribeLiveStreamsFrameRateAndBitRateDataResponseFrameRateAndBitRateInfosFrameRateAndBitRateInfo setVideoFrameRate(Float videoFrameRate) {
            this.videoFrameRate = videoFrameRate;
            return this;
        }
        public Float getVideoFrameRate() {
            return this.videoFrameRate;
        }

        public DescribeLiveStreamsFrameRateAndBitRateDataResponseFrameRateAndBitRateInfosFrameRateAndBitRateInfo setAudioFrameRate(Float audioFrameRate) {
            this.audioFrameRate = audioFrameRate;
            return this;
        }
        public Float getAudioFrameRate() {
            return this.audioFrameRate;
        }

        public DescribeLiveStreamsFrameRateAndBitRateDataResponseFrameRateAndBitRateInfosFrameRateAndBitRateInfo setBitRate(Float bitRate) {
            this.bitRate = bitRate;
            return this;
        }
        public Float getBitRate() {
            return this.bitRate;
        }

        public DescribeLiveStreamsFrameRateAndBitRateDataResponseFrameRateAndBitRateInfosFrameRateAndBitRateInfo setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class DescribeLiveStreamsFrameRateAndBitRateDataResponseFrameRateAndBitRateInfos extends TeaModel {
        @NameInMap("FrameRateAndBitRateInfo")
        @Validation(required = true)
        public java.util.List<DescribeLiveStreamsFrameRateAndBitRateDataResponseFrameRateAndBitRateInfosFrameRateAndBitRateInfo> frameRateAndBitRateInfo;

        public static DescribeLiveStreamsFrameRateAndBitRateDataResponseFrameRateAndBitRateInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamsFrameRateAndBitRateDataResponseFrameRateAndBitRateInfos self = new DescribeLiveStreamsFrameRateAndBitRateDataResponseFrameRateAndBitRateInfos();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamsFrameRateAndBitRateDataResponseFrameRateAndBitRateInfos setFrameRateAndBitRateInfo(java.util.List<DescribeLiveStreamsFrameRateAndBitRateDataResponseFrameRateAndBitRateInfosFrameRateAndBitRateInfo> frameRateAndBitRateInfo) {
            this.frameRateAndBitRateInfo = frameRateAndBitRateInfo;
            return this;
        }
        public java.util.List<DescribeLiveStreamsFrameRateAndBitRateDataResponseFrameRateAndBitRateInfosFrameRateAndBitRateInfo> getFrameRateAndBitRateInfo() {
            return this.frameRateAndBitRateInfo;
        }

    }

}
