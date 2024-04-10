// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class SetTopicAttributesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetTopicAttributesResponseBody body;

    public static SetTopicAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        SetTopicAttributesResponse self = new SetTopicAttributesResponse();
        return TeaModel.build(map, self);
    }

    public SetTopicAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetTopicAttributesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetTopicAttributesResponse setBody(SetTopicAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public SetTopicAttributesResponseBody getBody() {
        return this.body;
    }

}
