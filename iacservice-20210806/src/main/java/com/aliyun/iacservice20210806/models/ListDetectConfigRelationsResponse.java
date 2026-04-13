// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListDetectConfigRelationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDetectConfigRelationsResponseBody body;

    public static ListDetectConfigRelationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDetectConfigRelationsResponse self = new ListDetectConfigRelationsResponse();
        return TeaModel.build(map, self);
    }

    public ListDetectConfigRelationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDetectConfigRelationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDetectConfigRelationsResponse setBody(ListDetectConfigRelationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDetectConfigRelationsResponseBody getBody() {
        return this.body;
    }

}
