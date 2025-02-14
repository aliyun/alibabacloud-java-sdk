// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDataLakeFunctionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataLakeFunctionResponseBody body;

    public static ListDataLakeFunctionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataLakeFunctionResponse self = new ListDataLakeFunctionResponse();
        return TeaModel.build(map, self);
    }

    public ListDataLakeFunctionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataLakeFunctionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataLakeFunctionResponse setBody(ListDataLakeFunctionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataLakeFunctionResponseBody getBody() {
        return this.body;
    }

}
