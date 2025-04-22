// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class GetQualificationOssInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetQualificationOssInfoResponseBody body;

    public static GetQualificationOssInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQualificationOssInfoResponse self = new GetQualificationOssInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetQualificationOssInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQualificationOssInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQualificationOssInfoResponse setBody(GetQualificationOssInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQualificationOssInfoResponseBody getBody() {
        return this.body;
    }

}
