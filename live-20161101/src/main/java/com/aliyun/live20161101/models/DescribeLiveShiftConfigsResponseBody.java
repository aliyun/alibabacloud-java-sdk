// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveShiftConfigsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Content")
    public DescribeLiveShiftConfigsResponseBodyContent content;

    public static DescribeLiveShiftConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveShiftConfigsResponseBody self = new DescribeLiveShiftConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveShiftConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveShiftConfigsResponseBody setContent(DescribeLiveShiftConfigsResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public DescribeLiveShiftConfigsResponseBodyContent getContent() {
        return this.content;
    }

    public static class DescribeLiveShiftConfigsResponseBodyContentConfig extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("Vision")
        public Integer vision;

        @NameInMap("StreamName")
        public String streamName;

        @NameInMap("DomainName")
        public String domainName;

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

        public DescribeLiveShiftConfigsResponseBodyContentConfig setVision(Integer vision) {
            this.vision = vision;
            return this;
        }
        public Integer getVision() {
            return this.vision;
        }

        public DescribeLiveShiftConfigsResponseBodyContentConfig setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeLiveShiftConfigsResponseBodyContentConfig setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
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
