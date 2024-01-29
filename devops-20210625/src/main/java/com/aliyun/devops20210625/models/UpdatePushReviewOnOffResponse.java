// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdatePushReviewOnOffResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePushReviewOnOffResponseBody body;

    public static UpdatePushReviewOnOffResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePushReviewOnOffResponse self = new UpdatePushReviewOnOffResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePushReviewOnOffResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePushReviewOnOffResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePushReviewOnOffResponse setBody(UpdatePushReviewOnOffResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePushReviewOnOffResponseBody getBody() {
        return this.body;
    }

}
