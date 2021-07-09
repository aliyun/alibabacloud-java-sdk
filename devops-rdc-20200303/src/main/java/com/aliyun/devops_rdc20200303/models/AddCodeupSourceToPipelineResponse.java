// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class AddCodeupSourceToPipelineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddCodeupSourceToPipelineResponseBody body;

    public static AddCodeupSourceToPipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCodeupSourceToPipelineResponse self = new AddCodeupSourceToPipelineResponse();
        return TeaModel.build(map, self);
    }

    public AddCodeupSourceToPipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddCodeupSourceToPipelineResponse setBody(AddCodeupSourceToPipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public AddCodeupSourceToPipelineResponseBody getBody() {
        return this.body;
    }

}
