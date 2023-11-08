// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListTableDataByFormInstanceIdTableIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListTableDataByFormInstanceIdTableIdResponseBody body;

    public static ListTableDataByFormInstanceIdTableIdResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTableDataByFormInstanceIdTableIdResponse self = new ListTableDataByFormInstanceIdTableIdResponse();
        return TeaModel.build(map, self);
    }

    public ListTableDataByFormInstanceIdTableIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTableDataByFormInstanceIdTableIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTableDataByFormInstanceIdTableIdResponse setBody(ListTableDataByFormInstanceIdTableIdResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTableDataByFormInstanceIdTableIdResponseBody getBody() {
        return this.body;
    }

}
