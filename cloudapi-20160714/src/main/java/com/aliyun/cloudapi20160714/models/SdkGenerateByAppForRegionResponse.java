// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SdkGenerateByAppForRegionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SdkGenerateByAppForRegionResponseBody body;

    public static SdkGenerateByAppForRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        SdkGenerateByAppForRegionResponse self = new SdkGenerateByAppForRegionResponse();
        return TeaModel.build(map, self);
    }

    public SdkGenerateByAppForRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SdkGenerateByAppForRegionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SdkGenerateByAppForRegionResponse setBody(SdkGenerateByAppForRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public SdkGenerateByAppForRegionResponseBody getBody() {
        return this.body;
    }

}
