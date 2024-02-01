// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListServiceInstanceLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListServiceInstanceLogsResponseBody body;

    public static ListServiceInstanceLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServiceInstanceLogsResponse self = new ListServiceInstanceLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListServiceInstanceLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServiceInstanceLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListServiceInstanceLogsResponse setBody(ListServiceInstanceLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServiceInstanceLogsResponseBody getBody() {
        return this.body;
    }

}
