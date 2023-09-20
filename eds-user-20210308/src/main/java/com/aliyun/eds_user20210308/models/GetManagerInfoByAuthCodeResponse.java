// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class GetManagerInfoByAuthCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetManagerInfoByAuthCodeResponseBody body;

    public static GetManagerInfoByAuthCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetManagerInfoByAuthCodeResponse self = new GetManagerInfoByAuthCodeResponse();
        return TeaModel.build(map, self);
    }

    public GetManagerInfoByAuthCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetManagerInfoByAuthCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetManagerInfoByAuthCodeResponse setBody(GetManagerInfoByAuthCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetManagerInfoByAuthCodeResponseBody getBody() {
        return this.body;
    }

}
