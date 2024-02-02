// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class CreateCallTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCallTagsResponseBody body;

    public static CreateCallTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCallTagsResponse self = new CreateCallTagsResponse();
        return TeaModel.build(map, self);
    }

    public CreateCallTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCallTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCallTagsResponse setBody(CreateCallTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCallTagsResponseBody getBody() {
        return this.body;
    }

}
