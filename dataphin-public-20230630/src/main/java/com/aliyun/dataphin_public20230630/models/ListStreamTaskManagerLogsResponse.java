// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListStreamTaskManagerLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListStreamTaskManagerLogsResponseBody body;

    public static ListStreamTaskManagerLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStreamTaskManagerLogsResponse self = new ListStreamTaskManagerLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListStreamTaskManagerLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListStreamTaskManagerLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListStreamTaskManagerLogsResponse setBody(ListStreamTaskManagerLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListStreamTaskManagerLogsResponseBody getBody() {
        return this.body;
    }

}
