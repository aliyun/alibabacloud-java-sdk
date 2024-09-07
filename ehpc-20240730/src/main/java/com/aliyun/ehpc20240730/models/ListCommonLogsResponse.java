// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class ListCommonLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCommonLogsResponseBody body;

    public static ListCommonLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCommonLogsResponse self = new ListCommonLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListCommonLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCommonLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCommonLogsResponse setBody(ListCommonLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCommonLogsResponseBody getBody() {
        return this.body;
    }

}
