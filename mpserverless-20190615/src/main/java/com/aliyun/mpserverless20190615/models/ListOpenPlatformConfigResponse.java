// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ListOpenPlatformConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOpenPlatformConfigResponseBody body;

    public static ListOpenPlatformConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOpenPlatformConfigResponse self = new ListOpenPlatformConfigResponse();
        return TeaModel.build(map, self);
    }

    public ListOpenPlatformConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOpenPlatformConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOpenPlatformConfigResponse setBody(ListOpenPlatformConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOpenPlatformConfigResponseBody getBody() {
        return this.body;
    }

}
