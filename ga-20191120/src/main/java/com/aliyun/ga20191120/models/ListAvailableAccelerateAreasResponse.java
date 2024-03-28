// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListAvailableAccelerateAreasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAvailableAccelerateAreasResponseBody body;

    public static ListAvailableAccelerateAreasResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableAccelerateAreasResponse self = new ListAvailableAccelerateAreasResponse();
        return TeaModel.build(map, self);
    }

    public ListAvailableAccelerateAreasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAvailableAccelerateAreasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAvailableAccelerateAreasResponse setBody(ListAvailableAccelerateAreasResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAvailableAccelerateAreasResponseBody getBody() {
        return this.body;
    }

}
