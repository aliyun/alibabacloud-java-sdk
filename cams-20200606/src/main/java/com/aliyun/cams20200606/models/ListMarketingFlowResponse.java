// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListMarketingFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMarketingFlowResponseBody body;

    public static ListMarketingFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMarketingFlowResponse self = new ListMarketingFlowResponse();
        return TeaModel.build(map, self);
    }

    public ListMarketingFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMarketingFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMarketingFlowResponse setBody(ListMarketingFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMarketingFlowResponseBody getBody() {
        return this.body;
    }

}
