// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListSaasServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSaasServiceResponseBody body;

    public static ListSaasServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSaasServiceResponse self = new ListSaasServiceResponse();
        return TeaModel.build(map, self);
    }

    public ListSaasServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSaasServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSaasServiceResponse setBody(ListSaasServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSaasServiceResponseBody getBody() {
        return this.body;
    }

}
