// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetIncidentAllResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetIncidentAllResponseBody body;

    public static GetIncidentAllResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIncidentAllResponse self = new GetIncidentAllResponse();
        return TeaModel.build(map, self);
    }

    public GetIncidentAllResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIncidentAllResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIncidentAllResponse setBody(GetIncidentAllResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIncidentAllResponseBody getBody() {
        return this.body;
    }

}
