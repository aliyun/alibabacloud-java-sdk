// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class ListLicensesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLicensesResponseBody body;

    public static ListLicensesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLicensesResponse self = new ListLicensesResponse();
        return TeaModel.build(map, self);
    }

    public ListLicensesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLicensesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLicensesResponse setBody(ListLicensesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLicensesResponseBody getBody() {
        return this.body;
    }

}
