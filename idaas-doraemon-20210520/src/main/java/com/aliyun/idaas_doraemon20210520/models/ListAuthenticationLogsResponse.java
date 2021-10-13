// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class ListAuthenticationLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListAuthenticationLogsResponse setBody(ListAuthenticationLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAuthenticationLogsResponseBody getBody() {
        return this.body;
    }

}
