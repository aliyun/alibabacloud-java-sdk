// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class ListAuthenticationLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAuthenticationLogsResponseBody body;

    public static ListAuthenticationLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuthenticationLogsResponse self = new ListAuthenticationLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListAuthenticationLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAuthenticationLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAuthenticationLogsResponse setBody(ListAuthenticationLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAuthenticationLogsResponseBody getBody() {
        return this.body;
    }

}
