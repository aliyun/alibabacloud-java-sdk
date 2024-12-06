// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class CancelDatasourceAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelDatasourceAuthorizationResponseBody body;

    public static CancelDatasourceAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelDatasourceAuthorizationResponse self = new CancelDatasourceAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public CancelDatasourceAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelDatasourceAuthorizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelDatasourceAuthorizationResponse setBody(CancelDatasourceAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelDatasourceAuthorizationResponseBody getBody() {
        return this.body;
    }

}
