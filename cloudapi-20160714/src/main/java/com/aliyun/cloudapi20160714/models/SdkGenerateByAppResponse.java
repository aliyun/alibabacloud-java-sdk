// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SdkGenerateByAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SdkGenerateByAppResponseBody body;

    public static SdkGenerateByAppResponse build(java.util.Map<String, ?> map) throws Exception {
        SdkGenerateByAppResponse self = new SdkGenerateByAppResponse();
        return TeaModel.build(map, self);
    }

    public SdkGenerateByAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SdkGenerateByAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SdkGenerateByAppResponse setBody(SdkGenerateByAppResponseBody body) {
        this.body = body;
        return this;
    }
    public SdkGenerateByAppResponseBody getBody() {
        return this.body;
    }

}
