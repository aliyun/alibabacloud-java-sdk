// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListDeviceBelongIdentifiersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDeviceBelongIdentifiersResponseBody body;

    public static ListDeviceBelongIdentifiersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceBelongIdentifiersResponse self = new ListDeviceBelongIdentifiersResponse();
        return TeaModel.build(map, self);
    }

    public ListDeviceBelongIdentifiersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeviceBelongIdentifiersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDeviceBelongIdentifiersResponse setBody(ListDeviceBelongIdentifiersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeviceBelongIdentifiersResponseBody getBody() {
        return this.body;
    }

}
