// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveShiftConfigsResponseBody extends TeaModel {
    /**
     * <p>The time shifting configurations.</p>
     */
    @NameInMap("Content")
    public DescribeLiveShiftConfigsResponseBodyContent content;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B49E6DDA-F413-422B-B58E-2FA23F286726</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLiveShiftConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveShiftConfigsResponseBody self = new DescribeLiveShiftConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveShiftConfigsResponseBody setContent(DescribeLiveShiftConfigsResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public DescribeLiveShiftConfigsResponseBodyContent getContent() {
        return this.content;
    }

    public DescribeLiveShiftConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLiveShiftConfigsResponseBodyContentConfig extends TeaModel {
        /**
         * <p>The application for which you configure time shifting.</p>
         * 
         * <strong>example:</strong>
         * <p>liveApp****</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The domain name for which you configure time shifting.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>Whether to ignore time shift generation for the transcode stream.</p>
         * <ul>
         * <li>true: Ignore time shifting generation.</li>
         * <li>false: Generate time shifting.</li>
         * </ul>
         * <p>The default value is true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IgnoreTranscode")
        public Boolean ignoreTranscode;

        /**
         * <p>The name of the live stream for which you configure time shifting.</p>
         * 
         * <strong>example:</strong>
         * <p>liveStream****</p>
         */
        @NameInMap("StreamName")
        public String streamName;

        /**
         * <p>The number of days for which the time shifting configurations are retained.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("Vision")
        public Integer vision;

        public static DescribeLiveShiftConfigsResponseBodyContentConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveShiftConfigsResponseBodyContentConfig self = new DescribeLiveShiftConfigsResponseBodyContentConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLiveShiftConfigsResponseBodyContentConfig setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeLiveShiftConfigsResponseBodyContentConfig setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveShiftConfigsResponseBodyContentConfig setIgnoreTranscode(Boolean ignoreTranscode) {
            this.ignoreTranscode = ignoreTranscode;
            return this;
        }
        public Boolean getIgnoreTranscode() {
            return this.ignoreTranscode;
        }

        public DescribeLiveShiftConfigsResponseBodyContentConfig setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeLiveShiftConfigsResponseBodyContentConfig setVision(Integer vision) {
            this.vision = vision;
            return this;
        }
        public Integer getVision() {
            return this.vision;
        }

    }

    public static class DescribeLiveShiftConfigsResponseBodyContent extends TeaModel {
        @NameInMap("Config")
        public java.util.List<DescribeLiveShiftConfigsResponseBodyContentConfig> config;

        public static DescribeLiveShiftConfigsResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveShiftConfigsResponseBodyContent self = new DescribeLiveShiftConfigsResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public DescribeLiveShiftConfigsResponseBodyContent setConfig(java.util.List<DescribeLiveShiftConfigsResponseBodyContentConfig> config) {
            this.config = config;
            return this;
        }
        public java.util.List<DescribeLiveShiftConfigsResponseBodyContentConfig> getConfig() {
            return this.config;
        }

    }

}
