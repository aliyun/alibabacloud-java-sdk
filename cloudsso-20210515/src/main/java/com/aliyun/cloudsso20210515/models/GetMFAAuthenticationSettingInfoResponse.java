// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetMFAAuthenticationSettingInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMFAAuthenticationSettingInfoResponseBody body;

    public static GetMFAAuthenticationSettingInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMFAAuthenticationSettingInfoResponse self = new GetMFAAuthenticationSettingInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetMFAAuthenticationSettingInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMFAAuthenticationSettingInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMFAAuthenticationSettingInfoResponse setBody(GetMFAAuthenticationSettingInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMFAAuthenticationSettingInfoResponseBody getBody() {
        return this.body;
    }

}
