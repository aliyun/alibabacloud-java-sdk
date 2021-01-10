// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class AddCensorPipelineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddCensorPipelineResponseBody body;

    public static AddCensorPipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCensorPipelineResponse self = new AddCensorPipelineResponse();
        return TeaModel.build(map, self);
    }

    public AddCensorPipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddCensorPipelineResponse setBody(AddCensorPipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public AddCensorPipelineResponseBody getBody() {
        return this.body;
    }

}
