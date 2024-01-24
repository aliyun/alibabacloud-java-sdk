// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class StopDataFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StopDataFlowResponseBody body;

    public static StopDataFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        StopDataFlowResponse self = new StopDataFlowResponse();
        return TeaModel.build(map, self);
    }

    public StopDataFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopDataFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopDataFlowResponse setBody(StopDataFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public StopDataFlowResponseBody getBody() {
        return this.body;
    }

}
