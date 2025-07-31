// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetStreamJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetStreamJobsResponseBody body;

    public static GetStreamJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStreamJobsResponse self = new GetStreamJobsResponse();
        return TeaModel.build(map, self);
    }

    public GetStreamJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStreamJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStreamJobsResponse setBody(GetStreamJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStreamJobsResponseBody getBody() {
        return this.body;
    }

}
