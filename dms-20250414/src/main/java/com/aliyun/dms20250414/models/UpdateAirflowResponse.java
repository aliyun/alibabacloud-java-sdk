// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class UpdateAirflowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAirflowResponseBody body;

    public static UpdateAirflowResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAirflowResponse self = new UpdateAirflowResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAirflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAirflowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAirflowResponse setBody(UpdateAirflowResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAirflowResponseBody getBody() {
        return this.body;
    }

}
