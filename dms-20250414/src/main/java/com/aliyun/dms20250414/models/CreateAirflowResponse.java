// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CreateAirflowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAirflowResponseBody body;

    public static CreateAirflowResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAirflowResponse self = new CreateAirflowResponse();
        return TeaModel.build(map, self);
    }

    public CreateAirflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAirflowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAirflowResponse setBody(CreateAirflowResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAirflowResponseBody getBody() {
        return this.body;
    }

}
