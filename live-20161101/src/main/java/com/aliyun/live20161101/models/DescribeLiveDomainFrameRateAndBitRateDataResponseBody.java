// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainFrameRateAndBitRateDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FrameRateAndBitRateInfos")
    public DescribeLiveDomainFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfos frameRateAndBitRateInfos;

    public static DescribeLiveDomainFrameRateAndBitRateDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainFrameRateAndBitRateDataResponseBody self = new DescribeLiveDomainFrameRateAndBitRateDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainFrameRateAndBitRateDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDomainFrameRateAndBitRateDataResponseBody setFrameRateAndBitRateInfos(DescribeLiveDomainFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfos frameRateAndBitRateInfos) {
        this.frameRateAndBitRateInfos = frameRateAndBitRateInfos;
        return this;
    }
    public DescribeLiveDomainFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfos getFrameRateAndBitRateInfos() {
        return this.frameRateAndBitRateInfos;
    }

    public static class DescribeLiveDomainFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfosFrameRateAndBitRateInfo extends TeaModel {
        @NameInMap("AudioFrameRate")
        public Float audioFrameRate;

        @NameInMap("VideoFrameRate")
        public Float videoFrameRate;

        @NameInMap("StreamUrl")
        public String streamUrl;

        @NameInMap("BitRate")
        public Float bitRate;

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

        public DescribeLiveDomainFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfosFrameRateAndBitRateInfo setVideoFrameRate(Float videoFrameRate) {
            this.videoFrameRate = videoFrameRate;
            return this;
        }
        public Float getVideoFrameRate() {
            return this.videoFrameRate;
        }

        public DescribeLiveDomainFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfosFrameRateAndBitRateInfo setStreamUrl(String streamUrl) {
            this.streamUrl = streamUrl;
            return this;
        }
        public String getStreamUrl() {
            return this.streamUrl;
        }

        public DescribeLiveDomainFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfosFrameRateAndBitRateInfo setBitRate(Float bitRate) {
            this.bitRate = bitRate;
            return this;
        }
        public Float getBitRate() {
            return this.bitRate;
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
