// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class AddPhoneTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddPhoneTagsResponseBody body;

    public static AddPhoneTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddPhoneTagsResponse self = new AddPhoneTagsResponse();
        return TeaModel.build(map, self);
    }

    public AddPhoneTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddPhoneTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddPhoneTagsResponse setBody(AddPhoneTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddPhoneTagsResponseBody getBody() {
        return this.body;
    }

}
