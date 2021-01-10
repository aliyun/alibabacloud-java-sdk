// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamBitRateDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FrameRateAndBitRateInfos")
    public DescribeLiveStreamBitRateDataResponseBodyFrameRateAndBitRateInfos frameRateAndBitRateInfos;

    public static DescribeLiveStreamBitRateDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamBitRateDataResponseBody self = new DescribeLiveStreamBitRateDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamBitRateDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveStreamBitRateDataResponseBody setFrameRateAndBitRateInfos(DescribeLiveStreamBitRateDataResponseBodyFrameRateAndBitRateInfos frameRateAndBitRateInfos) {
        this.frameRateAndBitRateInfos = frameRateAndBitRateInfos;
        return this;
    }
    public DescribeLiveStreamBitRateDataResponseBodyFrameRateAndBitRateInfos getFrameRateAndBitRateInfos() {
        return this.frameRateAndBitRateInfos;
    }

    public static class DescribeLiveStreamBitRateDataResponseBodyFrameRateAndBitRateInfosFrameRateAndBitRateInfo extends TeaModel {
        @NameInMap("Time")
        public String time;

        @NameInMap("AudioFrameRate")
        public Float audioFrameRate;

        @NameInMap("VideoFrameRate")
        public Float videoFrameRate;

        @NameInMap("StreamUrl")
        public String streamUrl;

        @NameInMap("BitRate")
        public Float bitRate;

        public static DescribeLiveStreamBitRateDataResponseBodyFrameRateAndBitRateInfosFrameRateAndBitRateInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamBitRateDataResponseBodyFrameRateAndBitRateInfosFrameRateAndBitRateInfo self = new DescribeLiveStreamBitRateDataResponseBodyFrameRateAndBitRateInfosFrameRateAndBitRateInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamBitRateDataResponseBodyFrameRateAndBitRateInfosFrameRateAndBitRateInfo setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public DescribeLiveStreamBitRateDataResponseBodyFrameRateAndBitRateInfosFrameRateAndBitRateInfo setAudioFrameRate(Float audioFrameRate) {
            this.audioFrameRate = audioFrameRate;
            return this;
        }
        public Float getAudioFrameRate() {
            return this.audioFrameRate;
        }

        public DescribeLiveStreamBitRateDataResponseBodyFrameRateAndBitRateInfosFrameRateAndBitRateInfo setVideoFrameRate(Float videoFrameRate) {
            this.videoFrameRate = videoFrameRate;
            return this;
        }
        public Float getVideoFrameRate() {
            return this.videoFrameRate;
        }

        public DescribeLiveStreamBitRateDataResponseBodyFrameRateAndBitRateInfosFrameRateAndBitRateInfo setStreamUrl(String streamUrl) {
            this.streamUrl = streamUrl;
            return this;
        }
        public String getStreamUrl() {
            return this.streamUrl;
        }

        public DescribeLiveStreamBitRateDataResponseBodyFrameRateAndBitRateInfosFrameRateAndBitRateInfo setBitRate(Float bitRate) {
            this.bitRate = bitRate;
            return this;
        }
        public Float getBitRate() {
            return this.bitRate;
        }

    }

    public static class DescribeLiveStreamBitRateDataResponseBodyFrameRateAndBitRateInfos extends TeaModel {
        @NameInMap("FrameRateAndBitRateInfo")
        public java.util.List<DescribeLiveStreamBitRateDataResponseBodyFrameRateAndBitRateInfosFrameRateAndBitRateInfo> frameRateAndBitRateInfo;

        public static DescribeLiveStreamBitRateDataResponseBodyFrameRateAndBitRateInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamBitRateDataResponseBodyFrameRateAndBitRateInfos self = new DescribeLiveStreamBitRateDataResponseBodyFrameRateAndBitRateInfos();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamBitRateDataResponseBodyFrameRateAndBitRateInfos setFrameRateAndBitRateInfo(java.util.List<DescribeLiveStreamBitRateDataResponseBodyFrameRateAndBitRateInfosFrameRateAndBitRateInfo> frameRateAndBitRateInfo) {
            this.frameRateAndBitRateInfo = frameRateAndBitRateInfo;
            return this;
        }
        public java.util.List<DescribeLiveStreamBitRateDataResponseBodyFrameRateAndBitRateInfosFrameRateAndBitRateInfo> getFrameRateAndBitRateInfo() {
            return this.frameRateAndBitRateInfo;
        }

    }

}
