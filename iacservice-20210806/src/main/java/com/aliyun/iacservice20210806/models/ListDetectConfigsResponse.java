// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListDetectConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDetectConfigsResponseBody body;

    public static ListDetectConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDetectConfigsResponse self = new ListDetectConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListDetectConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDetectConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDetectConfigsResponse setBody(ListDetectConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDetectConfigsResponseBody getBody() {
        return this.body;
    }

}
