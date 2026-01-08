// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class PauseMarketingFLowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PauseMarketingFLowResponseBody body;

    public static PauseMarketingFLowResponse build(java.util.Map<String, ?> map) throws Exception {
        PauseMarketingFLowResponse self = new PauseMarketingFLowResponse();
        return TeaModel.build(map, self);
    }

    public PauseMarketingFLowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PauseMarketingFLowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PauseMarketingFLowResponse setBody(PauseMarketingFLowResponseBody body) {
        this.body = body;
        return this;
    }
    public PauseMarketingFLowResponseBody getBody() {
        return this.body;
    }

}
