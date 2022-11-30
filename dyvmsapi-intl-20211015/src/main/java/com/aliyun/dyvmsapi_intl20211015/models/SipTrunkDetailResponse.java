// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class SipTrunkDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SipTrunkDetailResponseBody body;

    public static SipTrunkDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        SipTrunkDetailResponse self = new SipTrunkDetailResponse();
        return TeaModel.build(map, self);
    }

    public SipTrunkDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SipTrunkDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SipTrunkDetailResponse setBody(SipTrunkDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public SipTrunkDetailResponseBody getBody() {
        return this.body;
    }

}
