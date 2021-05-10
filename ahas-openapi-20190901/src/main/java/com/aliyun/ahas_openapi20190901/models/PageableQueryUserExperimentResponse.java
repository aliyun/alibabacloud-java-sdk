// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class PageableQueryUserExperimentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PageableQueryUserExperimentResponseBody body;

    public static PageableQueryUserExperimentResponse build(java.util.Map<String, ?> map) throws Exception {
        PageableQueryUserExperimentResponse self = new PageableQueryUserExperimentResponse();
        return TeaModel.build(map, self);
    }

    public PageableQueryUserExperimentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PageableQueryUserExperimentResponse setBody(PageableQueryUserExperimentResponseBody body) {
        this.body = body;
        return this;
    }
    public PageableQueryUserExperimentResponseBody getBody() {
        return this.body;
    }

}
