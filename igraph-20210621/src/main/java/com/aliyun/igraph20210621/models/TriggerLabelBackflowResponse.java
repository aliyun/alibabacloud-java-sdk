// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.igraph20210621.models;

import com.aliyun.tea.*;

public class TriggerLabelBackflowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TriggerLabelBackflowResponseBody body;

    public static TriggerLabelBackflowResponse build(java.util.Map<String, ?> map) throws Exception {
        TriggerLabelBackflowResponse self = new TriggerLabelBackflowResponse();
        return TeaModel.build(map, self);
    }

    public TriggerLabelBackflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TriggerLabelBackflowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TriggerLabelBackflowResponse setBody(TriggerLabelBackflowResponseBody body) {
        this.body = body;
        return this;
    }
    public TriggerLabelBackflowResponseBody getBody() {
        return this.body;
    }

}
