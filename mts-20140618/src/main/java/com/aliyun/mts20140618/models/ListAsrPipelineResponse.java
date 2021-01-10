// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListAsrPipelineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAsrPipelineResponseBody body;

    public static ListAsrPipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAsrPipelineResponse self = new ListAsrPipelineResponse();
        return TeaModel.build(map, self);
    }

    public ListAsrPipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAsrPipelineResponse setBody(ListAsrPipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAsrPipelineResponseBody getBody() {
        return this.body;
    }

}
