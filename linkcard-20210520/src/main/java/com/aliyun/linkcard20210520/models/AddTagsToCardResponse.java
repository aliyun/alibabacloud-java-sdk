// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class AddTagsToCardResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddTagsToCardResponseBody body;

    public static AddTagsToCardResponse build(java.util.Map<String, ?> map) throws Exception {
        AddTagsToCardResponse self = new AddTagsToCardResponse();
        return TeaModel.build(map, self);
    }

    public AddTagsToCardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddTagsToCardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddTagsToCardResponse setBody(AddTagsToCardResponseBody body) {
        this.body = body;
        return this;
    }
    public AddTagsToCardResponseBody getBody() {
        return this.body;
    }

}
