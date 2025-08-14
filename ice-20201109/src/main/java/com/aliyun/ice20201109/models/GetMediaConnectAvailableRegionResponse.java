// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaConnectAvailableRegionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMediaConnectAvailableRegionResponseBody body;

    public static GetMediaConnectAvailableRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMediaConnectAvailableRegionResponse self = new GetMediaConnectAvailableRegionResponse();
        return TeaModel.build(map, self);
    }

    public GetMediaConnectAvailableRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMediaConnectAvailableRegionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMediaConnectAvailableRegionResponse setBody(GetMediaConnectAvailableRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMediaConnectAvailableRegionResponseBody getBody() {
        return this.body;
    }

}
