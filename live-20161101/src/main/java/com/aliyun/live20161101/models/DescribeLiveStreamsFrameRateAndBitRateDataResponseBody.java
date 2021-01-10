// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamsFrameRateAndBitRateDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FrameRateAndBitRateInfos")
    public DescribeLiveStreamsFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfos frameRateAndBitRateInfos;

    public static DescribeLiveStreamsFrameRateAndBitRateDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamsFrameRateAndBitRateDataResponseBody self = new DescribeLiveStreamsFrameRateAndBitRateDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamsFrameRateAndBitRateDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveStreamsFrameRateAndBitRateDataResponseBody setFrameRateAndBitRateInfos(DescribeLiveStreamsFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfos frameRateAndBitRateInfos) {
        this.frameRateAndBitRateInfos = frameRateAndBitRateInfos;
        return this;
    }
    public DescribeLiveStreamsFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfos getFrameRateAndBitRateInfos() {
        return this.frameRateAndBitRateInfos;
    }

    public static class DescribeLiveStreamsFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfosFrameRateAndBitRateInfo extends TeaModel {
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

        public static DescribeLiveStreamsFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfosFrameRateAndBitRateInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamsFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfosFrameRateAndBitRateInfo self = new DescribeLiveStreamsFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfosFrameRateAndBitRateInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamsFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfosFrameRateAndBitRateInfo setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public DescribeLiveStreamsFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfosFrameRateAndBitRateInfo setAudioFrameRate(Float audioFrameRate) {
            this.audioFrameRate = audioFrameRate;
            return this;
        }
        public Float getAudioFrameRate() {
            return this.audioFrameRate;
        }

        public DescribeLiveStreamsFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfosFrameRateAndBitRateInfo setVideoFrameRate(Float videoFrameRate) {
            this.videoFrameRate = videoFrameRate;
            return this;
        }
        public Float getVideoFrameRate() {
            return this.videoFrameRate;
        }

        public DescribeLiveStreamsFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfosFrameRateAndBitRateInfo setStreamUrl(String streamUrl) {
            this.streamUrl = streamUrl;
            return this;
        }
        public String getStreamUrl() {
            return this.streamUrl;
        }

        public DescribeLiveStreamsFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfosFrameRateAndBitRateInfo setBitRate(Float bitRate) {
            this.bitRate = bitRate;
            return this;
        }
        public Float getBitRate() {
            return this.bitRate;
        }

    }

    public static class DescribeLiveStreamsFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfos extends TeaModel {
        @NameInMap("FrameRateAndBitRateInfo")
        public java.util.List<DescribeLiveStreamsFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfosFrameRateAndBitRateInfo> frameRateAndBitRateInfo;

        public static DescribeLiveStreamsFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamsFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfos self = new DescribeLiveStreamsFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfos();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamsFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfos setFrameRateAndBitRateInfo(java.util.List<DescribeLiveStreamsFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfosFrameRateAndBitRateInfo> frameRateAndBitRateInfo) {
            this.frameRateAndBitRateInfo = frameRateAndBitRateInfo;
            return this;
        }
        public java.util.List<DescribeLiveStreamsFrameRateAndBitRateDataResponseBodyFrameRateAndBitRateInfosFrameRateAndBitRateInfo> getFrameRateAndBitRateInfo() {
            return this.frameRateAndBitRateInfo;
        }

    }

}
