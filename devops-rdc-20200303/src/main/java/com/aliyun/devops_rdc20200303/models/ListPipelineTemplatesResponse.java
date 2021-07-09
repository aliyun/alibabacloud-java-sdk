// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class ListPipelineTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListPipelineTemplatesResponseBody body;

    public static ListPipelineTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineTemplatesResponse self = new ListPipelineTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListPipelineTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPipelineTemplatesResponse setBody(ListPipelineTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPipelineTemplatesResponseBody getBody() {
        return this.body;
    }

}
