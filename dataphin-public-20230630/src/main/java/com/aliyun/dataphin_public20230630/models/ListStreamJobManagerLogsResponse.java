// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListStreamJobManagerLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListStreamJobManagerLogsResponseBody body;

    public static ListStreamJobManagerLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStreamJobManagerLogsResponse self = new ListStreamJobManagerLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListStreamJobManagerLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListStreamJobManagerLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListStreamJobManagerLogsResponse setBody(ListStreamJobManagerLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListStreamJobManagerLogsResponseBody getBody() {
        return this.body;
    }

}
