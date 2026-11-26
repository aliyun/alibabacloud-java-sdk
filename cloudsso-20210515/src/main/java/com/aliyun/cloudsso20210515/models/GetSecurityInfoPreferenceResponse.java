// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetSecurityInfoPreferenceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSecurityInfoPreferenceResponseBody body;

    public static GetSecurityInfoPreferenceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSecurityInfoPreferenceResponse self = new GetSecurityInfoPreferenceResponse();
        return TeaModel.build(map, self);
    }

    public GetSecurityInfoPreferenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSecurityInfoPreferenceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSecurityInfoPreferenceResponse setBody(GetSecurityInfoPreferenceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSecurityInfoPreferenceResponseBody getBody() {
        return this.body;
    }

}
