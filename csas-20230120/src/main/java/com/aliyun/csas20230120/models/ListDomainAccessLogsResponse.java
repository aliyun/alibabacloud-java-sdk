// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListDomainAccessLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDomainAccessLogsResponseBody body;

    public static ListDomainAccessLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDomainAccessLogsResponse self = new ListDomainAccessLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListDomainAccessLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDomainAccessLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDomainAccessLogsResponse setBody(ListDomainAccessLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDomainAccessLogsResponseBody getBody() {
        return this.body;
    }

}
