// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListPornPipelineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListPornPipelineResponseBody body;

    public static ListPornPipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPornPipelineResponse self = new ListPornPipelineResponse();
        return TeaModel.build(map, self);
    }

    public ListPornPipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPornPipelineResponse setBody(ListPornPipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPornPipelineResponseBody getBody() {
        return this.body;
    }

}
