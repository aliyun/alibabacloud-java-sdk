// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListAIServicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAIServicesResponseBody body;

    public static ListAIServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAIServicesResponse self = new ListAIServicesResponse();
        return TeaModel.build(map, self);
    }

    public ListAIServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAIServicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAIServicesResponse setBody(ListAIServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAIServicesResponseBody getBody() {
        return this.body;
    }

}
