// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetInstanceInspectionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceInspectionsResponseBody body;

    public static GetInstanceInspectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceInspectionsResponse self = new GetInstanceInspectionsResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceInspectionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceInspectionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceInspectionsResponse setBody(GetInstanceInspectionsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceInspectionsResponseBody getBody() {
        return this.body;
    }

}
