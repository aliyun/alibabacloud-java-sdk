// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetCheckConnectivityJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCheckConnectivityJobsResponseBody body;

    public static GetCheckConnectivityJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCheckConnectivityJobsResponse self = new GetCheckConnectivityJobsResponse();
        return TeaModel.build(map, self);
    }

    public GetCheckConnectivityJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCheckConnectivityJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCheckConnectivityJobsResponse setBody(GetCheckConnectivityJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCheckConnectivityJobsResponseBody getBody() {
        return this.body;
    }

}
