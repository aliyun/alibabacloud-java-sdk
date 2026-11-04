// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class DeletePhoneTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePhoneTagsResponseBody body;

    public static DeletePhoneTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePhoneTagsResponse self = new DeletePhoneTagsResponse();
        return TeaModel.build(map, self);
    }

    public DeletePhoneTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePhoneTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePhoneTagsResponse setBody(DeletePhoneTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePhoneTagsResponseBody getBody() {
        return this.body;
    }

}
