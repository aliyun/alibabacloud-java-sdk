// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamDelayConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LiveStreamHlsDelayConfig")
    public DescribeLiveStreamDelayConfigResponseBodyLiveStreamHlsDelayConfig liveStreamHlsDelayConfig;

    @NameInMap("LiveStreamFlvDelayConfig")
    public DescribeLiveStreamDelayConfigResponseBodyLiveStreamFlvDelayConfig liveStreamFlvDelayConfig;

    @NameInMap("LiveStreamRtmpDelayConfig")
    public DescribeLiveStreamDelayConfigResponseBodyLiveStreamRtmpDelayConfig liveStreamRtmpDelayConfig;

    public static DescribeLiveStreamDelayConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamDelayConfigResponseBody self = new DescribeLiveStreamDelayConfigResponseBody();
        return TeaModel.build(map, self);
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

    public static class DescribeLiveStreamDelayConfigResponseBodyLiveStreamHlsDelayConfig extends TeaModel {
        @NameInMap("Level")
        public String level;

        @NameInMap("Delay")
        public Integer delay;

        public static DescribeLiveStreamDelayConfigResponseBodyLiveStreamHlsDelayConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamDelayConfigResponseBodyLiveStreamHlsDelayConfig self = new DescribeLiveStreamDelayConfigResponseBodyLiveStreamHlsDelayConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamDelayConfigResponseBodyLiveStreamHlsDelayConfig setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeLiveStreamDelayConfigResponseBodyLiveStreamHlsDelayConfig setDelay(Integer delay) {
            this.delay = delay;
            return this;
        }
        public Integer getDelay() {
            return this.delay;
        }

    }

    public static class DescribeLiveStreamDelayConfigResponseBodyLiveStreamFlvDelayConfig extends TeaModel {
        @NameInMap("Level")
        public String level;

        @NameInMap("Delay")
        public Integer delay;

        public static DescribeLiveStreamDelayConfigResponseBodyLiveStreamFlvDelayConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamDelayConfigResponseBodyLiveStreamFlvDelayConfig self = new DescribeLiveStreamDelayConfigResponseBodyLiveStreamFlvDelayConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamDelayConfigResponseBodyLiveStreamFlvDelayConfig setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeLiveStreamDelayConfigResponseBodyLiveStreamFlvDelayConfig setDelay(Integer delay) {
            this.delay = delay;
            return this;
        }
        public Integer getDelay() {
            return this.delay;
        }

    }

    public static class DescribeLiveStreamDelayConfigResponseBodyLiveStreamRtmpDelayConfig extends TeaModel {
        @NameInMap("Level")
        public String level;

        @NameInMap("Delay")
        public Integer delay;

        public static DescribeLiveStreamDelayConfigResponseBodyLiveStreamRtmpDelayConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamDelayConfigResponseBodyLiveStreamRtmpDelayConfig self = new DescribeLiveStreamDelayConfigResponseBodyLiveStreamRtmpDelayConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamDelayConfigResponseBodyLiveStreamRtmpDelayConfig setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeLiveStreamDelayConfigResponseBodyLiveStreamRtmpDelayConfig setDelay(Integer delay) {
            this.delay = delay;
            return this;
        }
        public Integer getDelay() {
            return this.delay;
        }

    }

}
