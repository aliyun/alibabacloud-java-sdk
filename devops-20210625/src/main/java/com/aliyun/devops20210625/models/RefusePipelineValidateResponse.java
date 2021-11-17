// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class RefusePipelineValidateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RefusePipelineValidateResponseBody body;

    public static RefusePipelineValidateResponse build(java.util.Map<String, ?> map) throws Exception {
        RefusePipelineValidateResponse self = new RefusePipelineValidateResponse();
        return TeaModel.build(map, self);
    }

    public RefusePipelineValidateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefusePipelineValidateResponse setBody(RefusePipelineValidateResponseBody body) {
        this.body = body;
        return this;
    }
    public RefusePipelineValidateResponseBody getBody() {
        return this.body;
    }

}
