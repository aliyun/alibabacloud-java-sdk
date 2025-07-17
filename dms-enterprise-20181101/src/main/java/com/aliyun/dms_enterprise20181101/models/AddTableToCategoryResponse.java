// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class AddTableToCategoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddTableToCategoryResponseBody body;

    public static AddTableToCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        AddTableToCategoryResponse self = new AddTableToCategoryResponse();
        return TeaModel.build(map, self);
    }

    public AddTableToCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddTableToCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddTableToCategoryResponse setBody(AddTableToCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public AddTableToCategoryResponseBody getBody() {
        return this.body;
    }

}
