// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetDataServiceAuthorizedProjectsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataServiceAuthorizedProjectsResponseBody body;

    public static GetDataServiceAuthorizedProjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceAuthorizedProjectsResponse self = new GetDataServiceAuthorizedProjectsResponse();
        return TeaModel.build(map, self);
    }

    public GetDataServiceAuthorizedProjectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataServiceAuthorizedProjectsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataServiceAuthorizedProjectsResponse setBody(GetDataServiceAuthorizedProjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataServiceAuthorizedProjectsResponseBody getBody() {
        return this.body;
    }

}
