// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class DeleteMarketingFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMarketingFlowResponseBody body;

    public static DeleteMarketingFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMarketingFlowResponse self = new DeleteMarketingFlowResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMarketingFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMarketingFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMarketingFlowResponse setBody(DeleteMarketingFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMarketingFlowResponseBody getBody() {
        return this.body;
    }

}
