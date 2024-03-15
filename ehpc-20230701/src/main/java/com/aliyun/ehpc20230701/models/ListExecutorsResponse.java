// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20230701.models;

import com.aliyun.tea.*;

public class ListExecutorsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListExecutorsResponseBody body;

    public static ListExecutorsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExecutorsResponse self = new ListExecutorsResponse();
        return TeaModel.build(map, self);
    }

    public ListExecutorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExecutorsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListExecutorsResponse setBody(ListExecutorsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExecutorsResponseBody getBody() {
        return this.body;
    }

}
