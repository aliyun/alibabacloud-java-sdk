// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ListPipelineTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public java.util.List<PipelineTemplate> body;

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

    public ListPipelineTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPipelineTemplatesResponse setBody(java.util.List<PipelineTemplate> body) {
        this.body = body;
        return this;
    }
    public java.util.List<PipelineTemplate> getBody() {
        return this.body;
    }

}
