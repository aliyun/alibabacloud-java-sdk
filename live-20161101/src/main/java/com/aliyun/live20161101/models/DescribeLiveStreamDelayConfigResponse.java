// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamDelayConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("LiveStreamHlsDelayConfig")
    @Validation(required = true)
    public DescribeLiveStreamDelayConfigResponseLiveStreamHlsDelayConfig liveStreamHlsDelayConfig;

    @NameInMap("LiveStreamFlvDelayConfig")
    @Validation(required = true)
    public DescribeLiveStreamDelayConfigResponseLiveStreamFlvDelayConfig liveStreamFlvDelayConfig;

    @NameInMap("LiveStreamRtmpDelayConfig")
    @Validation(required = true)
    public DescribeLiveStreamDelayConfigResponseLiveStreamRtmpDelayConfig liveStreamRtmpDelayConfig;

    public static DescribeLiveStreamDelayConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamDelayConfigResponse self = new DescribeLiveStreamDelayConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamDelayConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveStreamDelayConfigResponse setLiveStreamHlsDelayConfig(DescribeLiveStreamDelayConfigResponseLiveStreamHlsDelayConfig liveStreamHlsDelayConfig) {
        this.liveStreamHlsDelayConfig = liveStreamHlsDelayConfig;
        return this;
    }
    public DescribeLiveStreamDelayConfigResponseLiveStreamHlsDelayConfig getLiveStreamHlsDelayConfig() {
        return this.liveStreamHlsDelayConfig;
    }

    public DescribeLiveStreamDelayConfigResponse setLiveStreamFlvDelayConfig(DescribeLiveStreamDelayConfigResponseLiveStreamFlvDelayConfig liveStreamFlvDelayConfig) {
        this.liveStreamFlvDelayConfig = liveStreamFlvDelayConfig;
        return this;
    }
    public DescribeLiveStreamDelayConfigResponseLiveStreamFlvDelayConfig getLiveStreamFlvDelayConfig() {
        return this.liveStreamFlvDelayConfig;
    }

    public DescribeLiveStreamDelayConfigResponse setLiveStreamRtmpDelayConfig(DescribeLiveStreamDelayConfigResponseLiveStreamRtmpDelayConfig liveStreamRtmpDelayConfig) {
        this.liveStreamRtmpDelayConfig = liveStreamRtmpDelayConfig;
        return this;
    }
    public DescribeLiveStreamDelayConfigResponseLiveStreamRtmpDelayConfig getLiveStreamRtmpDelayConfig() {
        return this.liveStreamRtmpDelayConfig;
    }

    public static class DescribeLiveStreamDelayConfigResponseLiveStreamHlsDelayConfig extends TeaModel {
        @NameInMap("Level")
        @Validation(required = true)
        public String level;

        @NameInMap("Delay")
        @Validation(required = true)
        public Integer delay;

        public static DescribeLiveStreamDelayConfigResponseLiveStreamHlsDelayConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamDelayConfigResponseLiveStreamHlsDelayConfig self = new DescribeLiveStreamDelayConfigResponseLiveStreamHlsDelayConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamDelayConfigResponseLiveStreamHlsDelayConfig setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeLiveStreamDelayConfigResponseLiveStreamHlsDelayConfig setDelay(Integer delay) {
            this.delay = delay;
            return this;
        }
        public Integer getDelay() {
            return this.delay;
        }

    }

    public static class DescribeLiveStreamDelayConfigResponseLiveStreamFlvDelayConfig extends TeaModel {
        @NameInMap("Level")
        @Validation(required = true)
        public String level;

        @NameInMap("Delay")
        @Validation(required = true)
        public Integer delay;

        public static DescribeLiveStreamDelayConfigResponseLiveStreamFlvDelayConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamDelayConfigResponseLiveStreamFlvDelayConfig self = new DescribeLiveStreamDelayConfigResponseLiveStreamFlvDelayConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamDelayConfigResponseLiveStreamFlvDelayConfig setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeLiveStreamDelayConfigResponseLiveStreamFlvDelayConfig setDelay(Integer delay) {
            this.delay = delay;
            return this;
        }
        public Integer getDelay() {
            return this.delay;
        }

    }

    public static class DescribeLiveStreamDelayConfigResponseLiveStreamRtmpDelayConfig extends TeaModel {
        @NameInMap("Level")
        @Validation(required = true)
        public String level;

        @NameInMap("Delay")
        @Validation(required = true)
        public Integer delay;

        public static DescribeLiveStreamDelayConfigResponseLiveStreamRtmpDelayConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamDelayConfigResponseLiveStreamRtmpDelayConfig self = new DescribeLiveStreamDelayConfigResponseLiveStreamRtmpDelayConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamDelayConfigResponseLiveStreamRtmpDelayConfig setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeLiveStreamDelayConfigResponseLiveStreamRtmpDelayConfig setDelay(Integer delay) {
            this.delay = delay;
            return this;
        }
        public Integer getDelay() {
            return this.delay;
        }

    }

}
