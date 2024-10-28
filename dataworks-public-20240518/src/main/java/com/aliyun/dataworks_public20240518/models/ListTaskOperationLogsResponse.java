// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListTaskOperationLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTaskOperationLogsResponseBody body;

    public static ListTaskOperationLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTaskOperationLogsResponse self = new ListTaskOperationLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListTaskOperationLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTaskOperationLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTaskOperationLogsResponse setBody(ListTaskOperationLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTaskOperationLogsResponseBody getBody() {
        return this.body;
    }

}
