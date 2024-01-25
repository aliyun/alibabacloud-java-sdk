// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListDeliveryPackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDeliveryPackageResponseBody body;

    public static ListDeliveryPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeliveryPackageResponse self = new ListDeliveryPackageResponse();
        return TeaModel.build(map, self);
    }

    public ListDeliveryPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeliveryPackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDeliveryPackageResponse setBody(ListDeliveryPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeliveryPackageResponseBody getBody() {
        return this.body;
    }

}
