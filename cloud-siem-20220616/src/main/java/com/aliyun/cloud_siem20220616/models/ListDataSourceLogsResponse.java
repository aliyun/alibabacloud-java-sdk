// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListDataSourceLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataSourceLogsResponseBody body;

    public static ListDataSourceLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourceLogsResponse self = new ListDataSourceLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListDataSourceLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataSourceLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataSourceLogsResponse setBody(ListDataSourceLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataSourceLogsResponseBody getBody() {
        return this.body;
    }

}
