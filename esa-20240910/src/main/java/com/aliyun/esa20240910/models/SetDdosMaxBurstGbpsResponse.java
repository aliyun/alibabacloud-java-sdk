// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class SetDdosMaxBurstGbpsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetDdosMaxBurstGbpsResponseBody body;

    public static SetDdosMaxBurstGbpsResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDdosMaxBurstGbpsResponse self = new SetDdosMaxBurstGbpsResponse();
        return TeaModel.build(map, self);
    }

    public SetDdosMaxBurstGbpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDdosMaxBurstGbpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDdosMaxBurstGbpsResponse setBody(SetDdosMaxBurstGbpsResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDdosMaxBurstGbpsResponseBody getBody() {
        return this.body;
    }

}
