// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListSparkLogAnalyzeTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSparkLogAnalyzeTasksResponseBody body;

    public static ListSparkLogAnalyzeTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSparkLogAnalyzeTasksResponse self = new ListSparkLogAnalyzeTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListSparkLogAnalyzeTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSparkLogAnalyzeTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSparkLogAnalyzeTasksResponse setBody(ListSparkLogAnalyzeTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSparkLogAnalyzeTasksResponseBody getBody() {
        return this.body;
    }

}
