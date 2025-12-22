// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class PromoteToMasterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PromoteToMasterResponseBody body;

    public static PromoteToMasterResponse build(java.util.Map<String, ?> map) throws Exception {
        PromoteToMasterResponse self = new PromoteToMasterResponse();
        return TeaModel.build(map, self);
    }

    public PromoteToMasterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PromoteToMasterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PromoteToMasterResponse setBody(PromoteToMasterResponseBody body) {
        this.body = body;
        return this;
    }
    public PromoteToMasterResponseBody getBody() {
        return this.body;
    }

}
