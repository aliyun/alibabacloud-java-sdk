// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetResourceTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetResourceTagsResponseBody body;

    public static GetResourceTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceTagsResponse self = new GetResourceTagsResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourceTagsResponse setBody(GetResourceTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceTagsResponseBody getBody() {
        return this.body;
    }

}
