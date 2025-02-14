// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDataLakeFunctionNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataLakeFunctionNameResponseBody body;

    public static ListDataLakeFunctionNameResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataLakeFunctionNameResponse self = new ListDataLakeFunctionNameResponse();
        return TeaModel.build(map, self);
    }

    public ListDataLakeFunctionNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataLakeFunctionNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataLakeFunctionNameResponse setBody(ListDataLakeFunctionNameResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataLakeFunctionNameResponseBody getBody() {
        return this.body;
    }

}
