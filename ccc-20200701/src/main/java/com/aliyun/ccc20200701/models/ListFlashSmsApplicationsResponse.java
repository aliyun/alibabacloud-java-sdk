// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListFlashSmsApplicationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFlashSmsApplicationsResponseBody body;

    public static ListFlashSmsApplicationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFlashSmsApplicationsResponse self = new ListFlashSmsApplicationsResponse();
        return TeaModel.build(map, self);
    }

    public ListFlashSmsApplicationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFlashSmsApplicationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFlashSmsApplicationsResponse setBody(ListFlashSmsApplicationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFlashSmsApplicationsResponseBody getBody() {
        return this.body;
    }

}
