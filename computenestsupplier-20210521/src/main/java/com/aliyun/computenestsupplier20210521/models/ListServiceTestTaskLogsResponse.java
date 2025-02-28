// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListServiceTestTaskLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListServiceTestTaskLogsResponseBody body;

    public static ListServiceTestTaskLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServiceTestTaskLogsResponse self = new ListServiceTestTaskLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListServiceTestTaskLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServiceTestTaskLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListServiceTestTaskLogsResponse setBody(ListServiceTestTaskLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServiceTestTaskLogsResponseBody getBody() {
        return this.body;
    }

}
