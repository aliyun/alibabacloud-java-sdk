// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListServiceInstanceFaultInjectionInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListServiceInstanceFaultInjectionInfoResponseBody body;

    public static ListServiceInstanceFaultInjectionInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServiceInstanceFaultInjectionInfoResponse self = new ListServiceInstanceFaultInjectionInfoResponse();
        return TeaModel.build(map, self);
    }

    public ListServiceInstanceFaultInjectionInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServiceInstanceFaultInjectionInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListServiceInstanceFaultInjectionInfoResponse setBody(ListServiceInstanceFaultInjectionInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServiceInstanceFaultInjectionInfoResponseBody getBody() {
        return this.body;
    }

}
