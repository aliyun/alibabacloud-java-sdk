// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class AddTerrorismPipelineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddTerrorismPipelineResponseBody body;

    public static AddTerrorismPipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        AddTerrorismPipelineResponse self = new AddTerrorismPipelineResponse();
        return TeaModel.build(map, self);
    }

    public AddTerrorismPipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddTerrorismPipelineResponse setBody(AddTerrorismPipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public AddTerrorismPipelineResponseBody getBody() {
        return this.body;
    }

}
