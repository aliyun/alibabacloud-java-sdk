// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class PausePhysicalNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PausePhysicalNodeResponseBody body;

    public static PausePhysicalNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        PausePhysicalNodeResponse self = new PausePhysicalNodeResponse();
        return TeaModel.build(map, self);
    }

    public PausePhysicalNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PausePhysicalNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PausePhysicalNodeResponse setBody(PausePhysicalNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public PausePhysicalNodeResponseBody getBody() {
        return this.body;
    }

}
