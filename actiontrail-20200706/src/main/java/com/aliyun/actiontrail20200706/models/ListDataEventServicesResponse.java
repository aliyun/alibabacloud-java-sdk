// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class ListDataEventServicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataEventServicesResponseBody body;

    public static ListDataEventServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataEventServicesResponse self = new ListDataEventServicesResponse();
        return TeaModel.build(map, self);
    }

    public ListDataEventServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataEventServicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataEventServicesResponse setBody(ListDataEventServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataEventServicesResponseBody getBody() {
        return this.body;
    }

}
