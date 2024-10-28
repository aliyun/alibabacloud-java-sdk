// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListTaskInstanceOperationLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTaskInstanceOperationLogsResponseBody body;

    public static ListTaskInstanceOperationLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTaskInstanceOperationLogsResponse self = new ListTaskInstanceOperationLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListTaskInstanceOperationLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTaskInstanceOperationLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTaskInstanceOperationLogsResponse setBody(ListTaskInstanceOperationLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTaskInstanceOperationLogsResponseBody getBody() {
        return this.body;
    }

}
