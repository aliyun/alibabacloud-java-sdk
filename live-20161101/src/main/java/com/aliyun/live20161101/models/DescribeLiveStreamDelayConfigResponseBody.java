// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamDelayConfigResponseBody extends TeaModel {
    @NameInMap("LiveStreamFlvDelayConfig")
    public DescribeLiveStreamDelayConfigResponseBodyLiveStreamFlvDelayConfig liveStreamFlvDelayConfig;

    @NameInMap("LiveStreamRtmpDelayConfig")
    public DescribeLiveStreamDelayConfigResponseBodyLiveStreamRtmpDelayConfig liveStreamRtmpDelayConfig;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LiveStreamHlsDelayConfig")
    public DescribeLiveStreamDelayConfigResponseBodyLiveStreamHlsDelayConfig liveStreamHlsDelayConfig;

    public static DescribeLiveStreamDelayConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamDelayConfigResponseBody self = new DescribeLiveStreamDelayConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamDelayConfigResponseBody setLiveStreamFlvDelayConfig(DescribeLiveStreamDelayConfigResponseBodyLiveStreamFlvDelayConfig liveStreamFlvDelayConfig) {
        this.liveStreamFlvDelayConfig = liveStreamFlvDelayConfig;
        return this;
    }
    public DescribeLiveStreamDelayConfigResponseBodyLiveStreamFlvDelayConfig getLiveStreamFlvDelayConfig() {
        return this.liveStreamFlvDelayConfig;
    }

    public DescribeLiveStreamDelayConfigResponseBody setLiveStreamRtmpDelayConfig(DescribeLiveStreamDelayConfigResponseBodyLiveStreamRtmpDelayConfig liveStreamRtmpDelayConfig) {
        this.liveStreamRtmpDelayConfig = liveStreamRtmpDelayConfig;
        return this;
    }
    public DescribeLiveStreamDelayConfigResponseBodyLiveStreamRtmpDelayConfig getLiveStreamRtmpDelayConfig() {
        return this.liveStreamRtmpDelayConfig;
    }

    public DescribeLiveStreamDelayConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveStreamDelayConfigResponseBody setLiveStreamHlsDelayConfig(DescribeLiveStreamDelayConfigResponseBodyLiveStreamHlsDelayConfig liveStreamHlsDelayConfig) {
        this.liveStreamHlsDelayConfig = liveStreamHlsDelayConfig;
        return this;
    }
    public DescribeLiveStreamDelayConfigResponseBodyLiveStreamHlsDelayConfig getLiveStreamHlsDelayConfig() {
        return this.liveStreamHlsDelayConfig;
    }

    public static class DescribeLiveStreamDelayConfigResponseBodyLiveStreamFlvDelayConfig extends TeaModel {
        @NameInMap("Delay")
        public Integer delay;

        @NameInMap("Level")
        public String level;

        public static DescribeLiveStreamDelayConfigResponseBodyLiveStreamFlvDelayConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamDelayConfigResponseBodyLiveStreamFlvDelayConfig self = new DescribeLiveStreamDelayConfigResponseBodyLiveStreamFlvDelayConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamDelayConfigResponseBodyLiveStreamFlvDelayConfig setDelay(Integer delay) {
            this.delay = delay;
            return this;
        }
        public Integer getDelay() {
            return this.delay;
        }

        public DescribeLiveStreamDelayConfigResponseBodyLiveStreamFlvDelayConfig setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

    public static class DescribeLiveStreamDelayConfigResponseBodyLiveStreamRtmpDelayConfig extends TeaModel {
        @NameInMap("Delay")
        public Integer delay;

        @NameInMap("Level")
        public String level;

        public static DescribeLiveStreamDelayConfigResponseBodyLiveStreamRtmpDelayConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamDelayConfigResponseBodyLiveStreamRtmpDelayConfig self = new DescribeLiveStreamDelayConfigResponseBodyLiveStreamRtmpDelayConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamDelayConfigResponseBodyLiveStreamRtmpDelayConfig setDelay(Integer delay) {
            this.delay = delay;
            return this;
        }
        public Integer getDelay() {
            return this.delay;
        }

        public DescribeLiveStreamDelayConfigResponseBodyLiveStreamRtmpDelayConfig setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

    public static class DescribeLiveStreamDelayConfigResponseBodyLiveStreamHlsDelayConfig extends TeaModel {
        @NameInMap("Delay")
        public Integer delay;

        @NameInMap("Level")
        public String level;

        public static DescribeLiveStreamDelayConfigResponseBodyLiveStreamHlsDelayConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamDelayConfigResponseBodyLiveStreamHlsDelayConfig self = new DescribeLiveStreamDelayConfigResponseBodyLiveStreamHlsDelayConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamDelayConfigResponseBodyLiveStreamHlsDelayConfig setDelay(Integer delay) {
            this.delay = delay;
            return this;
        }
        public Integer getDelay() {
            return this.delay;
        }

        public DescribeLiveStreamDelayConfigResponseBodyLiveStreamHlsDelayConfig setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

}
