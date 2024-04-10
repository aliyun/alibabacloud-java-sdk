// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetFlowJSONAssestResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFlowJSONAssestResponseBody body;

    public static GetFlowJSONAssestResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFlowJSONAssestResponse self = new GetFlowJSONAssestResponse();
        return TeaModel.build(map, self);
    }

    public GetFlowJSONAssestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFlowJSONAssestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFlowJSONAssestResponse setBody(GetFlowJSONAssestResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFlowJSONAssestResponseBody getBody() {
        return this.body;
    }

}
