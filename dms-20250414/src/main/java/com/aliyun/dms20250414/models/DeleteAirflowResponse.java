// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DeleteAirflowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAirflowResponseBody body;

    public static DeleteAirflowResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAirflowResponse self = new DeleteAirflowResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAirflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAirflowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAirflowResponse setBody(DeleteAirflowResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAirflowResponseBody getBody() {
        return this.body;
    }

}
