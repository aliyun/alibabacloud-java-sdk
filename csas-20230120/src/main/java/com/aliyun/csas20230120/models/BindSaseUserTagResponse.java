// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class BindSaseUserTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindSaseUserTagResponseBody body;

    public static BindSaseUserTagResponse build(java.util.Map<String, ?> map) throws Exception {
        BindSaseUserTagResponse self = new BindSaseUserTagResponse();
        return TeaModel.build(map, self);
    }

    public BindSaseUserTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindSaseUserTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindSaseUserTagResponse setBody(BindSaseUserTagResponseBody body) {
        this.body = body;
        return this;
    }
    public BindSaseUserTagResponseBody getBody() {
        return this.body;
    }

}
