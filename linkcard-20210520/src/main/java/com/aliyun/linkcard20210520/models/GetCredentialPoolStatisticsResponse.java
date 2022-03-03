// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class GetCredentialPoolStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetCredentialPoolStatisticsResponse setBody(GetCredentialPoolStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCredentialPoolStatisticsResponseBody getBody() {
        return this.body;
    }

}
