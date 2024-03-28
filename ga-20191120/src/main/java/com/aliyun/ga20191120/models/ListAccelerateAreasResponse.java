// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListAccelerateAreasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAccelerateAreasResponseBody body;

    public static ListAccelerateAreasResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAccelerateAreasResponse self = new ListAccelerateAreasResponse();
        return TeaModel.build(map, self);
    }

    public ListAccelerateAreasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAccelerateAreasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAccelerateAreasResponse setBody(ListAccelerateAreasResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAccelerateAreasResponseBody getBody() {
        return this.body;
    }

}
