// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListInterveneImportTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInterveneImportTasksResponseBody body;

    public static ListInterveneImportTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInterveneImportTasksResponse self = new ListInterveneImportTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListInterveneImportTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInterveneImportTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInterveneImportTasksResponse setBody(ListInterveneImportTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInterveneImportTasksResponseBody getBody() {
        return this.body;
    }

}
