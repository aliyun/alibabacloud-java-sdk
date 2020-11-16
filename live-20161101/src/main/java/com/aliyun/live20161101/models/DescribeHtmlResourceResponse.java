// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeHtmlResourceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("HtmlResource")
    @Validation(required = true)
    public DescribeHtmlResourceResponseHtmlResource htmlResource;

    public static DescribeHtmlResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHtmlResourceResponse self = new DescribeHtmlResourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHtmlResourceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHtmlResourceResponse setHtmlResource(DescribeHtmlResourceResponseHtmlResource htmlResource) {
        this.htmlResource = htmlResource;
        return this;
    }
    public DescribeHtmlResourceResponseHtmlResource getHtmlResource() {
        return this.htmlResource;
    }

    public static class DescribeHtmlResourceResponseHtmlResource extends TeaModel {
        @NameInMap("HtmlResourceId")
        @Validation(required = true)
        public String htmlResourceId;

        @NameInMap("HtmlUrl")
        @Validation(required = true)
        public String htmlUrl;

        @NameInMap("HtmlContent")
        @Validation(required = true)
        public String htmlContent;

        @NameInMap("CasterId")
        @Validation(required = true)
        public String casterId;

        @NameInMap("Config")
        @Validation(required = true)
        public String config;

        @NameInMap("StreamId")
        @Validation(required = true)
        public String streamId;

        public static DescribeHtmlResourceResponseHtmlResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeHtmlResourceResponseHtmlResource self = new DescribeHtmlResourceResponseHtmlResource();
            return TeaModel.build(map, self);
        }

        public DescribeHtmlResourceResponseHtmlResource setHtmlResourceId(String htmlResourceId) {
            this.htmlResourceId = htmlResourceId;
            return this;
        }
        public String getHtmlResourceId() {
            return this.htmlResourceId;
        }

        public DescribeHtmlResourceResponseHtmlResource setHtmlUrl(String htmlUrl) {
            this.htmlUrl = htmlUrl;
            return this;
        }
        public String getHtmlUrl() {
            return this.htmlUrl;
        }

        public DescribeHtmlResourceResponseHtmlResource setHtmlContent(String htmlContent) {
            this.htmlContent = htmlContent;
            return this;
        }
        public String getHtmlContent() {
            return this.htmlContent;
        }

        public DescribeHtmlResourceResponseHtmlResource setCasterId(String casterId) {
            this.casterId = casterId;
            return this;
        }
        public String getCasterId() {
            return this.casterId;
        }

        public DescribeHtmlResourceResponseHtmlResource setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public DescribeHtmlResourceResponseHtmlResource setStreamId(String streamId) {
            this.streamId = streamId;
            return this;
        }
        public String getStreamId() {
            return this.streamId;
        }

    }

}
