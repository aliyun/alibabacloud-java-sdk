// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeToutiaoLivePlayResponseBody extends TeaModel {
    @NameInMap("Content")
    public java.util.List<DescribeToutiaoLivePlayResponseBodyContent> content;

    @NameInMap("Description")
    public String description;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeToutiaoLivePlayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeToutiaoLivePlayResponseBody self = new DescribeToutiaoLivePlayResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeToutiaoLivePlayResponseBody setContent(java.util.List<DescribeToutiaoLivePlayResponseBodyContent> content) {
        this.content = content;
        return this;
    }
    public java.util.List<DescribeToutiaoLivePlayResponseBodyContent> getContent() {
        return this.content;
    }

    public DescribeToutiaoLivePlayResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeToutiaoLivePlayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeToutiaoLivePlayResponseBodyContent extends TeaModel {
        @NameInMap("App")
        public String app;

        @NameInMap("Bandwidth")
        public Float bandwidth;

        @NameInMap("CdnName")
        public String cdnName;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("PlayNum")
        public Long playNum;

        @NameInMap("StreamName")
        public String streamName;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static DescribeToutiaoLivePlayResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeToutiaoLivePlayResponseBodyContent self = new DescribeToutiaoLivePlayResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public DescribeToutiaoLivePlayResponseBodyContent setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public DescribeToutiaoLivePlayResponseBodyContent setBandwidth(Float bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Float getBandwidth() {
            return this.bandwidth;
        }

        public DescribeToutiaoLivePlayResponseBodyContent setCdnName(String cdnName) {
            this.cdnName = cdnName;
            return this;
        }
        public String getCdnName() {
            return this.cdnName;
        }

        public DescribeToutiaoLivePlayResponseBodyContent setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeToutiaoLivePlayResponseBodyContent setPlayNum(Long playNum) {
            this.playNum = playNum;
            return this;
        }
        public Long getPlayNum() {
            return this.playNum;
        }

        public DescribeToutiaoLivePlayResponseBodyContent setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeToutiaoLivePlayResponseBodyContent setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
