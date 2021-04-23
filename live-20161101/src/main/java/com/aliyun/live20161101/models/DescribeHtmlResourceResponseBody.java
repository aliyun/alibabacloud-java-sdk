// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeHtmlResourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HtmlResource")
    public DescribeHtmlResourceResponseBodyHtmlResource htmlResource;

    public static DescribeHtmlResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHtmlResourceResponseBody self = new DescribeHtmlResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHtmlResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHtmlResourceResponseBody setHtmlResource(DescribeHtmlResourceResponseBodyHtmlResource htmlResource) {
        this.htmlResource = htmlResource;
        return this;
    }
    public DescribeHtmlResourceResponseBodyHtmlResource getHtmlResource() {
        return this.htmlResource;
    }

    public static class DescribeHtmlResourceResponseBodyHtmlResource extends TeaModel {
        @NameInMap("HtmlUrl")
        public String htmlUrl;

        @NameInMap("CasterId")
        public String casterId;

        @NameInMap("StreamId")
        public String streamId;

        @NameInMap("Config")
        public String config;

        @NameInMap("HtmlResourceId")
        public String htmlResourceId;

        @NameInMap("HtmlContent")
        public String htmlContent;

        public static DescribeHtmlResourceResponseBodyHtmlResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeHtmlResourceResponseBodyHtmlResource self = new DescribeHtmlResourceResponseBodyHtmlResource();
            return TeaModel.build(map, self);
        }

        public DescribeHtmlResourceResponseBodyHtmlResource setHtmlUrl(String htmlUrl) {
            this.htmlUrl = htmlUrl;
            return this;
        }
        public String getHtmlUrl() {
            return this.htmlUrl;
        }

        public DescribeHtmlResourceResponseBodyHtmlResource setCasterId(String casterId) {
            this.casterId = casterId;
            return this;
        }
        public String getCasterId() {
            return this.casterId;
        }

        public DescribeHtmlResourceResponseBodyHtmlResource setStreamId(String streamId) {
            this.streamId = streamId;
            return this;
        }
        public String getStreamId() {
            return this.streamId;
        }

        public DescribeHtmlResourceResponseBodyHtmlResource setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public DescribeHtmlResourceResponseBodyHtmlResource setHtmlResourceId(String htmlResourceId) {
            this.htmlResourceId = htmlResourceId;
            return this;
        }
        public String getHtmlResourceId() {
            return this.htmlResourceId;
        }

        public DescribeHtmlResourceResponseBodyHtmlResource setHtmlContent(String htmlContent) {
            this.htmlContent = htmlContent;
            return this;
        }
        public String getHtmlContent() {
            return this.htmlContent;
        }

    }

}
