// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetAgenticTableIndexResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAgenticTableIndexResponseBody body;

    public static GetAgenticTableIndexResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgenticTableIndexResponse self = new GetAgenticTableIndexResponse();
        return TeaModel.build(map, self);
    }

    public GetAgenticTableIndexResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgenticTableIndexResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgenticTableIndexResponse setBody(GetAgenticTableIndexResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgenticTableIndexResponseBody getBody() {
        return this.body;
    }

}
