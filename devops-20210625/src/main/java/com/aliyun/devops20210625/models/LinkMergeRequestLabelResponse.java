// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class LinkMergeRequestLabelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public LinkMergeRequestLabelResponseBody body;

    public static LinkMergeRequestLabelResponse build(java.util.Map<String, ?> map) throws Exception {
        LinkMergeRequestLabelResponse self = new LinkMergeRequestLabelResponse();
        return TeaModel.build(map, self);
    }

    public LinkMergeRequestLabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LinkMergeRequestLabelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LinkMergeRequestLabelResponse setBody(LinkMergeRequestLabelResponseBody body) {
        this.body = body;
        return this;
    }
    public LinkMergeRequestLabelResponseBody getBody() {
        return this.body;
    }

}
