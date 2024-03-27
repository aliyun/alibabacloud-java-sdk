// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListEffectiveOrdersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEffectiveOrdersResponseBody body;

    public static ListEffectiveOrdersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEffectiveOrdersResponse self = new ListEffectiveOrdersResponse();
        return TeaModel.build(map, self);
    }

    public ListEffectiveOrdersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEffectiveOrdersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEffectiveOrdersResponse setBody(ListEffectiveOrdersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEffectiveOrdersResponseBody getBody() {
        return this.body;
    }

}
