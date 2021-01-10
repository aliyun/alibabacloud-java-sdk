// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListTerrorismPipelineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListTerrorismPipelineResponseBody body;

    public static ListTerrorismPipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTerrorismPipelineResponse self = new ListTerrorismPipelineResponse();
        return TeaModel.build(map, self);
    }

    public ListTerrorismPipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTerrorismPipelineResponse setBody(ListTerrorismPipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTerrorismPipelineResponseBody getBody() {
        return this.body;
    }

}
