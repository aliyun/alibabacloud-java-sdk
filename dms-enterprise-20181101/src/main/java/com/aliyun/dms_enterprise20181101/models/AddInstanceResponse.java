// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class AddInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddInstanceResponseBody body;

    public static AddInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        AddInstanceResponse self = new AddInstanceResponse();
        return TeaModel.build(map, self);
    }

    public AddInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddInstanceResponse setBody(AddInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public AddInstanceResponseBody getBody() {
        return this.body;
    }

}
