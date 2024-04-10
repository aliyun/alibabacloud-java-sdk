// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class GetTopicAttributesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTopicAttributesResponseBody body;

    public static GetTopicAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTopicAttributesResponse self = new GetTopicAttributesResponse();
        return TeaModel.build(map, self);
    }

    public GetTopicAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTopicAttributesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTopicAttributesResponse setBody(GetTopicAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTopicAttributesResponseBody getBody() {
        return this.body;
    }

}
