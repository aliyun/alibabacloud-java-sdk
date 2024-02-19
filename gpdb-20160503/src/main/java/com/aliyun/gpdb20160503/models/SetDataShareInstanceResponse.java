// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class SetDataShareInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetDataShareInstanceResponseBody body;

    public static SetDataShareInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDataShareInstanceResponse self = new SetDataShareInstanceResponse();
        return TeaModel.build(map, self);
    }

    public SetDataShareInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDataShareInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDataShareInstanceResponse setBody(SetDataShareInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDataShareInstanceResponseBody getBody() {
        return this.body;
    }

}
