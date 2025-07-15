// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamDelayConfigResponseBody extends TeaModel {
    /**
     * <p>The latency of FLV-based playback.</p>
     */
    @NameInMap("LiveStreamFlvDelayConfig")
    public DescribeLiveStreamDelayConfigResponseBodyLiveStreamFlvDelayConfig liveStreamFlvDelayConfig;

    /**
     * <p>The latency of HLS-based playback.</p>
     */
    @NameInMap("LiveStreamHlsDelayConfig")
    public DescribeLiveStreamDelayConfigResponseBodyLiveStreamHlsDelayConfig liveStreamHlsDelayConfig;

    /**
     * <p>The latency of RTMP-based playback.</p>
     */
    @NameInMap("LiveStreamRtmpDelayConfig")
    public DescribeLiveStreamDelayConfigResponseBodyLiveStreamRtmpDelayConfig liveStreamRtmpDelayConfig;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>785C9CB0-EB8A-4912-BBF2-966BEFD32DC3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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

    public DescribeLiveStreamDelayConfigResponseBody setLiveStreamHlsDelayConfig(DescribeLiveStreamDelayConfigResponseBodyLiveStreamHlsDelayConfig liveStreamHlsDelayConfig) {
        this.liveStreamHlsDelayConfig = liveStreamHlsDelayConfig;
        return this;
    }
    public DescribeLiveStreamDelayConfigResponseBodyLiveStreamHlsDelayConfig getLiveStreamHlsDelayConfig() {
        return this.liveStreamHlsDelayConfig;
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

    public static class DescribeLiveStreamDelayConfigResponseBodyLiveStreamFlvDelayConfig extends TeaModel {
        /**
         * <p>The playback latency. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Delay")
        public Integer delay;

        /**
         * <p>The latency level. Valid values:</p>
         * <ul>
         * <li><strong>short</strong>: The latency is less than or equal to 4 seconds.</li>
         * <li><strong>medium</strong>: The latency is greater than 4 seconds, and less than or equal to 8 seconds.</li>
         * <li><strong>long</strong>: The latency is greater than 8 seconds.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>medium</p>
         */
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

    public static class DescribeLiveStreamDelayConfigResponseBodyLiveStreamHlsDelayConfig extends TeaModel {
        /**
         * <p>The playback latency. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Delay")
        public Integer delay;

        /**
         * <p>The latency level. Valid values:</p>
         * <ul>
         * <li><strong>short</strong>: The latency is less than or equal to 4 seconds.</li>
         * <li><strong>medium</strong>: The latency is greater than 4 seconds, and less than or equal to 8 seconds.</li>
         * <li><strong>long</strong>: The latency is greater than 8 seconds.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>short</p>
         */
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

    public static class DescribeLiveStreamDelayConfigResponseBodyLiveStreamRtmpDelayConfig extends TeaModel {
        /**
         * <p>The playback latency. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Delay")
        public Integer delay;

        /**
         * <p>The latency level. Valid values:</p>
         * <ul>
         * <li><strong>short</strong>: The latency is less than or equal to 4 seconds.</li>
         * <li><strong>medium</strong>: The latency is greater than 4 seconds, and less than or equal to 8 seconds.</li>
         * <li><strong>long</strong>: The latency is greater than 8 seconds.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>short</p>
         */
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

}
