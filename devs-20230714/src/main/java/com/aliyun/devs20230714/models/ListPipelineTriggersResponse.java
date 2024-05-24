// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ListPipelineTriggersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPipelineTriggersResponseBody body;

    public static ListPipelineTriggersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineTriggersResponse self = new ListPipelineTriggersResponse();
        return TeaModel.build(map, self);
    }

    public ListPipelineTriggersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPipelineTriggersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPipelineTriggersResponse setBody(ListPipelineTriggersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPipelineTriggersResponseBody getBody() {
        return this.body;
    }

}
