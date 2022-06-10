// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class AddItemToSubBizsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddItemToSubBizsResponseBody body;

    public static AddItemToSubBizsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddItemToSubBizsResponse self = new AddItemToSubBizsResponse();
        return TeaModel.build(map, self);
    }

    public AddItemToSubBizsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddItemToSubBizsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddItemToSubBizsResponse setBody(AddItemToSubBizsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddItemToSubBizsResponseBody getBody() {
        return this.body;
    }

}
