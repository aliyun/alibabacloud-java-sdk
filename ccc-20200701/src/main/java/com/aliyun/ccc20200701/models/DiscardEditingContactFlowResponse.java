// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class DiscardEditingContactFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DiscardEditingContactFlowResponseBody body;

    public static DiscardEditingContactFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        DiscardEditingContactFlowResponse self = new DiscardEditingContactFlowResponse();
        return TeaModel.build(map, self);
    }

    public DiscardEditingContactFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DiscardEditingContactFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DiscardEditingContactFlowResponse setBody(DiscardEditingContactFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public DiscardEditingContactFlowResponseBody getBody() {
        return this.body;
    }

}
