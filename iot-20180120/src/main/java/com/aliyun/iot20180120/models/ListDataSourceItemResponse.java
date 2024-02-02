// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListDataSourceItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataSourceItemResponseBody body;

    public static ListDataSourceItemResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourceItemResponse self = new ListDataSourceItemResponse();
        return TeaModel.build(map, self);
    }

    public ListDataSourceItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataSourceItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataSourceItemResponse setBody(ListDataSourceItemResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataSourceItemResponseBody getBody() {
        return this.body;
    }

}
