// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListQualityWatchTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListQualityWatchTasksResponseBody body;

    public static ListQualityWatchTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListQualityWatchTasksResponse self = new ListQualityWatchTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListQualityWatchTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListQualityWatchTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListQualityWatchTasksResponse setBody(ListQualityWatchTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListQualityWatchTasksResponseBody getBody() {
        return this.body;
    }

}
