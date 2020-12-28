// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class ListExperimentMetasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListExperimentMetasResponseBody body;

    public static ListExperimentMetasResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExperimentMetasResponse self = new ListExperimentMetasResponse();
        return TeaModel.build(map, self);
    }

    public ListExperimentMetasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExperimentMetasResponse setBody(ListExperimentMetasResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExperimentMetasResponseBody getBody() {
        return this.body;
    }

}
