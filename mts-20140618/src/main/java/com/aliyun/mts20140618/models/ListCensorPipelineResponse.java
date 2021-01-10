// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListCensorPipelineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListCensorPipelineResponseBody body;

    public static ListCensorPipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCensorPipelineResponse self = new ListCensorPipelineResponse();
        return TeaModel.build(map, self);
    }

    public ListCensorPipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCensorPipelineResponse setBody(ListCensorPipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCensorPipelineResponseBody getBody() {
        return this.body;
    }

}
