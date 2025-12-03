// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class GetPlatformUserInfoForPartnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPlatformUserInfoForPartnerResponseBody body;

    public static GetPlatformUserInfoForPartnerResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPlatformUserInfoForPartnerResponse self = new GetPlatformUserInfoForPartnerResponse();
        return TeaModel.build(map, self);
    }

    public GetPlatformUserInfoForPartnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPlatformUserInfoForPartnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPlatformUserInfoForPartnerResponse setBody(GetPlatformUserInfoForPartnerResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPlatformUserInfoForPartnerResponseBody getBody() {
        return this.body;
    }

}
