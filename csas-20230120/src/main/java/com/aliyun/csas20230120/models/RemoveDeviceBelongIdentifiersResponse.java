// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class RemoveDeviceBelongIdentifiersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveDeviceBelongIdentifiersResponseBody body;

    public static RemoveDeviceBelongIdentifiersResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveDeviceBelongIdentifiersResponse self = new RemoveDeviceBelongIdentifiersResponse();
        return TeaModel.build(map, self);
    }

    public RemoveDeviceBelongIdentifiersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveDeviceBelongIdentifiersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveDeviceBelongIdentifiersResponse setBody(RemoveDeviceBelongIdentifiersResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveDeviceBelongIdentifiersResponseBody getBody() {
        return this.body;
    }

}
