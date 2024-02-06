// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class GetCredentialPoolStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCredentialPoolStatisticsResponseBody body;

    public static GetCredentialPoolStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCredentialPoolStatisticsResponse self = new GetCredentialPoolStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetCredentialPoolStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCredentialPoolStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCredentialPoolStatisticsResponse setBody(GetCredentialPoolStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCredentialPoolStatisticsResponseBody getBody() {
        return this.body;
    }

}
