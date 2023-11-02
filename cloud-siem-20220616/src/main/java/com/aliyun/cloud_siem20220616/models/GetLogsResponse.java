// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class GetLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetLogsResponseBody body;

    public static GetLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLogsResponse self = new GetLogsResponse();
        return TeaModel.build(map, self);
    }

    public GetLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLogsResponse setBody(GetLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLogsResponseBody getBody() {
        return this.body;
    }

}
