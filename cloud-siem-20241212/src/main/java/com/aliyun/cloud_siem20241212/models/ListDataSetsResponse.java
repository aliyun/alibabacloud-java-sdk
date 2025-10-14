// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListDataSetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataSetsResponseBody body;

    public static ListDataSetsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataSetsResponse self = new ListDataSetsResponse();
        return TeaModel.build(map, self);
    }

    public ListDataSetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataSetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataSetsResponse setBody(ListDataSetsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataSetsResponseBody getBody() {
        return this.body;
    }

}
