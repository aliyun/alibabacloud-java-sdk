// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetWorkitemRelationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWorkitemRelationsResponseBody body;

    public static GetWorkitemRelationsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkitemRelationsResponse self = new GetWorkitemRelationsResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkitemRelationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkitemRelationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWorkitemRelationsResponse setBody(GetWorkitemRelationsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkitemRelationsResponseBody getBody() {
        return this.body;
    }

}
