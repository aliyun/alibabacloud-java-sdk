// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetBusinessLogAlertTopNResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBusinessLogAlertTopNResponseBody body;

    public static GetBusinessLogAlertTopNResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBusinessLogAlertTopNResponse self = new GetBusinessLogAlertTopNResponse();
        return TeaModel.build(map, self);
    }

    public GetBusinessLogAlertTopNResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBusinessLogAlertTopNResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBusinessLogAlertTopNResponse setBody(GetBusinessLogAlertTopNResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBusinessLogAlertTopNResponseBody getBody() {
        return this.body;
    }

}
