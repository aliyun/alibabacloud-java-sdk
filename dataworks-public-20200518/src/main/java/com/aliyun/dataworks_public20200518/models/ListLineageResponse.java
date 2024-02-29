// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListLineageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLineageResponseBody body;

    public static ListLineageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLineageResponse self = new ListLineageResponse();
        return TeaModel.build(map, self);
    }

    public ListLineageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLineageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLineageResponse setBody(ListLineageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLineageResponseBody getBody() {
        return this.body;
    }

}
