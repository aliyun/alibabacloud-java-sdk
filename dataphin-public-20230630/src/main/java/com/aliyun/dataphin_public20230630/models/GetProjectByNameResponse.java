// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetProjectByNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetProjectByNameResponseBody body;

    public static GetProjectByNameResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProjectByNameResponse self = new GetProjectByNameResponse();
        return TeaModel.build(map, self);
    }

    public GetProjectByNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProjectByNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProjectByNameResponse setBody(GetProjectByNameResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProjectByNameResponseBody getBody() {
        return this.body;
    }

}
