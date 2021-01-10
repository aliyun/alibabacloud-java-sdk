// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class AddAsrPipelineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddAsrPipelineResponseBody body;

    public static AddAsrPipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAsrPipelineResponse self = new AddAsrPipelineResponse();
        return TeaModel.build(map, self);
    }

    public AddAsrPipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAsrPipelineResponse setBody(AddAsrPipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAsrPipelineResponseBody getBody() {
        return this.body;
    }

}
