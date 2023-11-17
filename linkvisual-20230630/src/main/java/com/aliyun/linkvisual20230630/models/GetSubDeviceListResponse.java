// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class GetSubDeviceListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetSubDeviceListResponseBody body;

    public static GetSubDeviceListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSubDeviceListResponse self = new GetSubDeviceListResponse();
        return TeaModel.build(map, self);
    }

    public GetSubDeviceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSubDeviceListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSubDeviceListResponse setBody(GetSubDeviceListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSubDeviceListResponseBody getBody() {
        return this.body;
    }

}
