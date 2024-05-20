// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class GetIllustrationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IllustrationResult body;

    public static GetIllustrationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIllustrationResponse self = new GetIllustrationResponse();
        return TeaModel.build(map, self);
    }

    public GetIllustrationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIllustrationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIllustrationResponse setBody(IllustrationResult body) {
        this.body = body;
        return this;
    }
    public IllustrationResult getBody() {
        return this.body;
    }

}
