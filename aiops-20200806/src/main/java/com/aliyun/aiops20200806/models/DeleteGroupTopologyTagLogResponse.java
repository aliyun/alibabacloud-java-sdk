// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DeleteGroupTopologyTagLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteGroupTopologyTagLogResponseBody body;

    public static DeleteGroupTopologyTagLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGroupTopologyTagLogResponse self = new DeleteGroupTopologyTagLogResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGroupTopologyTagLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGroupTopologyTagLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGroupTopologyTagLogResponse setBody(DeleteGroupTopologyTagLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGroupTopologyTagLogResponseBody getBody() {
        return this.body;
    }

}
