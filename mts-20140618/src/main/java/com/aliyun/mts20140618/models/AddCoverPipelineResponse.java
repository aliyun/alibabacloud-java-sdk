// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class AddCoverPipelineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddCoverPipelineResponseBody body;

    public static AddCoverPipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCoverPipelineResponse self = new AddCoverPipelineResponse();
        return TeaModel.build(map, self);
    }

    public AddCoverPipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddCoverPipelineResponse setBody(AddCoverPipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public AddCoverPipelineResponseBody getBody() {
        return this.body;
    }

}
