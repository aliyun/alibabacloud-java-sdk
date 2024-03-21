// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class ListDcdnRealTimeDeliveryProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDcdnRealTimeDeliveryProjectResponseBody body;

    public static ListDcdnRealTimeDeliveryProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDcdnRealTimeDeliveryProjectResponse self = new ListDcdnRealTimeDeliveryProjectResponse();
        return TeaModel.build(map, self);
    }

    public ListDcdnRealTimeDeliveryProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDcdnRealTimeDeliveryProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDcdnRealTimeDeliveryProjectResponse setBody(ListDcdnRealTimeDeliveryProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDcdnRealTimeDeliveryProjectResponseBody getBody() {
        return this.body;
    }

}
