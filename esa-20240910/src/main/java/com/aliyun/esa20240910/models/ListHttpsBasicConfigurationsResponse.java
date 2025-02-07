// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListHttpsBasicConfigurationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHttpsBasicConfigurationsResponseBody body;

    public static ListHttpsBasicConfigurationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHttpsBasicConfigurationsResponse self = new ListHttpsBasicConfigurationsResponse();
        return TeaModel.build(map, self);
    }

    public ListHttpsBasicConfigurationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHttpsBasicConfigurationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHttpsBasicConfigurationsResponse setBody(ListHttpsBasicConfigurationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHttpsBasicConfigurationsResponseBody getBody() {
        return this.body;
    }

}
