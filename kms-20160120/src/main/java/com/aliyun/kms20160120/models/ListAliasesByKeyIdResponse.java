// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListAliasesByKeyIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAliasesByKeyIdResponseBody body;

    public static ListAliasesByKeyIdResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAliasesByKeyIdResponse self = new ListAliasesByKeyIdResponse();
        return TeaModel.build(map, self);
    }

    public ListAliasesByKeyIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAliasesByKeyIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAliasesByKeyIdResponse setBody(ListAliasesByKeyIdResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAliasesByKeyIdResponseBody getBody() {
        return this.body;
    }

}
