// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class AddMarketingFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddMarketingFlowResponseBody body;

    public static AddMarketingFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMarketingFlowResponse self = new AddMarketingFlowResponse();
        return TeaModel.build(map, self);
    }

    public AddMarketingFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMarketingFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddMarketingFlowResponse setBody(AddMarketingFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMarketingFlowResponseBody getBody() {
        return this.body;
    }

}
