// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListDataAgentAccuracyTestTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataAgentAccuracyTestTasksResponseBody body;

    public static ListDataAgentAccuracyTestTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataAgentAccuracyTestTasksResponse self = new ListDataAgentAccuracyTestTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListDataAgentAccuracyTestTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataAgentAccuracyTestTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataAgentAccuracyTestTasksResponse setBody(ListDataAgentAccuracyTestTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataAgentAccuracyTestTasksResponseBody getBody() {
        return this.body;
    }

}
