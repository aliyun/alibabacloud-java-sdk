// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeToutiaoLivePublishResponseBody extends TeaModel {
    @NameInMap("Content")
    public java.util.List<DescribeToutiaoLivePublishResponseBodyContent> content;

    @NameInMap("Description")
    public String description;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeToutiaoLivePublishResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeToutiaoLivePublishResponseBody self = new DescribeToutiaoLivePublishResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeToutiaoLivePublishResponseBody setContent(java.util.List<DescribeToutiaoLivePublishResponseBodyContent> content) {
        this.content = content;
        return this;
    }
    public java.util.List<DescribeToutiaoLivePublishResponseBodyContent> getContent() {
        return this.content;
    }

    public DescribeToutiaoLivePublishResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeToutiaoLivePublishResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeToutiaoLivePublishResponseBodyContent extends TeaModel {
        @NameInMap("App")
        public String app;

        @NameInMap("Bitrate")
        public Float bitrate;

        @NameInMap("BwDiff")
        public Float bwDiff;

        @NameInMap("CdnName")
        public String cdnName;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("Flr")
        public Float flr;

        @NameInMap("Fps")
        public Float fps;

        @NameInMap("StreamName")
        public String streamName;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static DescribeToutiaoLivePublishResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeToutiaoLivePublishResponseBodyContent self = new DescribeToutiaoLivePublishResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public DescribeToutiaoLivePublishResponseBodyContent setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public DescribeToutiaoLivePublishResponseBodyContent setBitrate(Float bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public Float getBitrate() {
            return this.bitrate;
        }

        public DescribeToutiaoLivePublishResponseBodyContent setBwDiff(Float bwDiff) {
            this.bwDiff = bwDiff;
            return this;
        }
        public Float getBwDiff() {
            return this.bwDiff;
        }

        public DescribeToutiaoLivePublishResponseBodyContent setCdnName(String cdnName) {
            this.cdnName = cdnName;
            return this;
        }
        public String getCdnName() {
            return this.cdnName;
        }

        public DescribeToutiaoLivePublishResponseBodyContent setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeToutiaoLivePublishResponseBodyContent setFlr(Float flr) {
            this.flr = flr;
            return this;
        }
        public Float getFlr() {
            return this.flr;
        }

        public DescribeToutiaoLivePublishResponseBodyContent setFps(Float fps) {
            this.fps = fps;
            return this;
        }
        public Float getFps() {
            return this.fps;
        }

        public DescribeToutiaoLivePublishResponseBodyContent setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeToutiaoLivePublishResponseBodyContent setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
