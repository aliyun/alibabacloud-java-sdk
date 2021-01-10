// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class AddPornPipelineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddPornPipelineResponseBody body;

    public static AddPornPipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        AddPornPipelineResponse self = new AddPornPipelineResponse();
        return TeaModel.build(map, self);
    }

    public AddPornPipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddPornPipelineResponse setBody(AddPornPipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public AddPornPipelineResponseBody getBody() {
        return this.body;
    }

}
