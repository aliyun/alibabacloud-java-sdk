// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeToutiaoLivePlayResponseBody extends TeaModel {
    /**
     * <p>The information about the live stream.</p>
     */
    @NameInMap("Content")
    public java.util.List<DescribeToutiaoLivePlayResponseBodyContent> content;

    /**
     * <p>The description of the response status.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F****</p>
     */
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
        /**
         * <p>The name of the application to which the live stream belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>liveApp****</p>
         */
        @NameInMap("App")
        public String app;

        /**
         * <p>The bandwidth. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0801239013671875</p>
         */
        @NameInMap("Bandwidth")
        public Float bandwidth;

        /**
         * <p>The Content Delivery Network (CDN) name.</p>
         * 
         * <strong>example:</strong>
         * <p>ali</p>
         */
        @NameInMap("CdnName")
        public String cdnName;

        /**
         * <p>The streaming domain.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The number of viewers.</p>
         * 
         * <strong>example:</strong>
         * <p>452</p>
         */
        @NameInMap("PlayNum")
        public Long playNum;

        /**
         * <p>The name of the live stream.</p>
         * 
         * <strong>example:</strong>
         * <p>liveStream****</p>
         */
        @NameInMap("StreamName")
        public String streamName;

        /**
         * <p>The timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1625484600</p>
         */
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
