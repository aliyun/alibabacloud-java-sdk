// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTableColumnsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTableColumnsResponseBody body;

    public static ListTableColumnsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTableColumnsResponse self = new ListTableColumnsResponse();
        return TeaModel.build(map, self);
    }

    public ListTableColumnsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTableColumnsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTableColumnsResponse setBody(ListTableColumnsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTableColumnsResponseBody getBody() {
        return this.body;
    }

}
