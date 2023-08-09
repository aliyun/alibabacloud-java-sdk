// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListIntegratedServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListIntegratedServiceResponseBody body;

    public static ListIntegratedServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIntegratedServiceResponse self = new ListIntegratedServiceResponse();
        return TeaModel.build(map, self);
    }

    public ListIntegratedServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIntegratedServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIntegratedServiceResponse setBody(ListIntegratedServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIntegratedServiceResponseBody getBody() {
        return this.body;
    }

}
