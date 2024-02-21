// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class GetSuggestShrinkableNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSuggestShrinkableNodesResponseBody body;

    public static GetSuggestShrinkableNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSuggestShrinkableNodesResponse self = new GetSuggestShrinkableNodesResponse();
        return TeaModel.build(map, self);
    }

    public GetSuggestShrinkableNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSuggestShrinkableNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSuggestShrinkableNodesResponse setBody(GetSuggestShrinkableNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSuggestShrinkableNodesResponseBody getBody() {
        return this.body;
    }

}
