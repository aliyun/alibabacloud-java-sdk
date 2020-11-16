// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainFrameRateAndBitRateDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("FrameRateAndBitRateInfos")
    @Validation(required = true)
    public DescribeLiveDomainFrameRateAndBitRateDataResponseFrameRateAndBitRateInfos frameRateAndBitRateInfos;

    public static DescribeLiveDomainFrameRateAndBitRateDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainFrameRateAndBitRateDataResponse self = new DescribeLiveDomainFrameRateAndBitRateDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainFrameRateAndBitRateDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDomainFrameRateAndBitRateDataResponse setFrameRateAndBitRateInfos(DescribeLiveDomainFrameRateAndBitRateDataResponseFrameRateAndBitRateInfos frameRateAndBitRateInfos) {
        this.frameRateAndBitRateInfos = frameRateAndBitRateInfos;
        return this;
    }
    public DescribeLiveDomainFrameRateAndBitRateDataResponseFrameRateAndBitRateInfos getFrameRateAndBitRateInfos() {
        return this.frameRateAndBitRateInfos;
    }

    public static class DescribeLiveDomainFrameRateAndBitRateDataResponseFrameRateAndBitRateInfosFrameRateAndBitRateInfo extends TeaModel {
        @NameInMap("AudioFrameRate")
        @Validation(required = true)
        public Float audioFrameRate;

        @NameInMap("BitRate")
        @Validation(required = true)
        public Float bitRate;

        @NameInMap("VideoFrameRate")
        @Validation(required = true)
        public Float videoFrameRate;

        @NameInMap("StreamUrl")
        @Validation(required = true)
        public String streamUrl;

        public static DescribeLiveDomainFrameRateAndBitRateDataResponseFrameRateAndBitRateInfosFrameRateAndBitRateInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainFrameRateAndBitRateDataResponseFrameRateAndBitRateInfosFrameRateAndBitRateInfo self = new DescribeLiveDomainFrameRateAndBitRateDataResponseFrameRateAndBitRateInfosFrameRateAndBitRateInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainFrameRateAndBitRateDataResponseFrameRateAndBitRateInfosFrameRateAndBitRateInfo setAudioFrameRate(Float audioFrameRate) {
            this.audioFrameRate = audioFrameRate;
            return this;
        }
        public Float getAudioFrameRate() {
            return this.audioFrameRate;
        }

        public DescribeLiveDomainFrameRateAndBitRateDataResponseFrameRateAndBitRateInfosFrameRateAndBitRateInfo setBitRate(Float bitRate) {
            this.bitRate = bitRate;
            return this;
        }
        public Float getBitRate() {
            return this.bitRate;
        }

        public DescribeLiveDomainFrameRateAndBitRateDataResponseFrameRateAndBitRateInfosFrameRateAndBitRateInfo setVideoFrameRate(Float videoFrameRate) {
            this.videoFrameRate = videoFrameRate;
            return this;
        }
        public Float getVideoFrameRate() {
            return this.videoFrameRate;
        }

        public DescribeLiveDomainFrameRateAndBitRateDataResponseFrameRateAndBitRateInfosFrameRateAndBitRateInfo setStreamUrl(String streamUrl) {
            this.streamUrl = streamUrl;
            return this;
        }
        public String getStreamUrl() {
            return this.streamUrl;
        }

    }

    public static class DescribeLiveDomainFrameRateAndBitRateDataResponseFrameRateAndBitRateInfos extends TeaModel {
        @NameInMap("FrameRateAndBitRateInfo")
        @Validation(required = true)
        public java.util.List<DescribeLiveDomainFrameRateAndBitRateDataResponseFrameRateAndBitRateInfosFrameRateAndBitRateInfo> frameRateAndBitRateInfo;

        public static DescribeLiveDomainFrameRateAndBitRateDataResponseFrameRateAndBitRateInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainFrameRateAndBitRateDataResponseFrameRateAndBitRateInfos self = new DescribeLiveDomainFrameRateAndBitRateDataResponseFrameRateAndBitRateInfos();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainFrameRateAndBitRateDataResponseFrameRateAndBitRateInfos setFrameRateAndBitRateInfo(java.util.List<DescribeLiveDomainFrameRateAndBitRateDataResponseFrameRateAndBitRateInfosFrameRateAndBitRateInfo> frameRateAndBitRateInfo) {
            this.frameRateAndBitRateInfo = frameRateAndBitRateInfo;
            return this;
        }
        public java.util.List<DescribeLiveDomainFrameRateAndBitRateDataResponseFrameRateAndBitRateInfosFrameRateAndBitRateInfo> getFrameRateAndBitRateInfo() {
            return this.frameRateAndBitRateInfo;
        }

    }

}
