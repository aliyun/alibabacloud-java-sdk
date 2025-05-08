// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetDetectLanguageVpcResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDetectLanguageVpcResponseBody body;

    public static GetDetectLanguageVpcResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDetectLanguageVpcResponse self = new GetDetectLanguageVpcResponse();
        return TeaModel.build(map, self);
    }

    public GetDetectLanguageVpcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDetectLanguageVpcResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDetectLanguageVpcResponse setBody(GetDetectLanguageVpcResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDetectLanguageVpcResponseBody getBody() {
        return this.body;
    }

}
