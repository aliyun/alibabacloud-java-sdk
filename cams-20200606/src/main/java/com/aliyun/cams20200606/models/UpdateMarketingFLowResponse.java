// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class UpdateMarketingFLowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMarketingFLowResponseBody body;

    public static UpdateMarketingFLowResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMarketingFLowResponse self = new UpdateMarketingFLowResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMarketingFLowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMarketingFLowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMarketingFLowResponse setBody(UpdateMarketingFLowResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMarketingFLowResponseBody getBody() {
        return this.body;
    }

}
