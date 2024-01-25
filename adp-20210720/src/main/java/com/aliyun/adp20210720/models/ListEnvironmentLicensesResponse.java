// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListEnvironmentLicensesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEnvironmentLicensesResponseBody body;

    public static ListEnvironmentLicensesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentLicensesResponse self = new ListEnvironmentLicensesResponse();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentLicensesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnvironmentLicensesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEnvironmentLicensesResponse setBody(ListEnvironmentLicensesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEnvironmentLicensesResponseBody getBody() {
        return this.body;
    }

}
