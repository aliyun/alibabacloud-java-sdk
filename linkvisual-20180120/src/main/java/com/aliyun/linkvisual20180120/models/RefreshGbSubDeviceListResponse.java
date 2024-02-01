// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class RefreshGbSubDeviceListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RefreshGbSubDeviceListResponseBody body;

    public static RefreshGbSubDeviceListResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshGbSubDeviceListResponse self = new RefreshGbSubDeviceListResponse();
        return TeaModel.build(map, self);
    }

    public RefreshGbSubDeviceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshGbSubDeviceListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefreshGbSubDeviceListResponse setBody(RefreshGbSubDeviceListResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshGbSubDeviceListResponseBody getBody() {
        return this.body;
    }

}
