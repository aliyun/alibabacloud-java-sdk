// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetDataServiceMyProjectsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataServiceMyProjectsResponseBody body;

    public static GetDataServiceMyProjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceMyProjectsResponse self = new GetDataServiceMyProjectsResponse();
        return TeaModel.build(map, self);
    }

    public GetDataServiceMyProjectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataServiceMyProjectsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataServiceMyProjectsResponse setBody(GetDataServiceMyProjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataServiceMyProjectsResponseBody getBody() {
        return this.body;
    }

}
