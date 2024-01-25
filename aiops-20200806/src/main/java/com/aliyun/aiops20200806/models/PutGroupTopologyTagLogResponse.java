// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class PutGroupTopologyTagLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutGroupTopologyTagLogResponseBody body;

    public static PutGroupTopologyTagLogResponse build(java.util.Map<String, ?> map) throws Exception {
        PutGroupTopologyTagLogResponse self = new PutGroupTopologyTagLogResponse();
        return TeaModel.build(map, self);
    }

    public PutGroupTopologyTagLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutGroupTopologyTagLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutGroupTopologyTagLogResponse setBody(PutGroupTopologyTagLogResponseBody body) {
        this.body = body;
        return this;
    }
    public PutGroupTopologyTagLogResponseBody getBody() {
        return this.body;
    }

}
