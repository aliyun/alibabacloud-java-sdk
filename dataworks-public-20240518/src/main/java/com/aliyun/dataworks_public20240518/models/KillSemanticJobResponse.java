// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class KillSemanticJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public KillSemanticJobResponseBody body;

    public static KillSemanticJobResponse build(java.util.Map<String, ?> map) throws Exception {
        KillSemanticJobResponse self = new KillSemanticJobResponse();
        return TeaModel.build(map, self);
    }

    public KillSemanticJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public KillSemanticJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public KillSemanticJobResponse setBody(KillSemanticJobResponseBody body) {
        this.body = body;
        return this;
    }
    public KillSemanticJobResponseBody getBody() {
        return this.body;
    }

}
