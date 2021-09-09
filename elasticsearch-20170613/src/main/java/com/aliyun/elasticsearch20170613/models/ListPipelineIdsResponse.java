// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListPipelineIdsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListPipelineIdsResponseBody body;

    public static ListPipelineIdsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineIdsResponse self = new ListPipelineIdsResponse();
        return TeaModel.build(map, self);
    }

    public ListPipelineIdsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPipelineIdsResponse setBody(ListPipelineIdsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPipelineIdsResponseBody getBody() {
        return this.body;
    }

}
