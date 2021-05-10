// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class PageableQueryExperimentTaskByExperimentIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PageableQueryExperimentTaskByExperimentIdResponseBody body;

    public static PageableQueryExperimentTaskByExperimentIdResponse build(java.util.Map<String, ?> map) throws Exception {
        PageableQueryExperimentTaskByExperimentIdResponse self = new PageableQueryExperimentTaskByExperimentIdResponse();
        return TeaModel.build(map, self);
    }

    public PageableQueryExperimentTaskByExperimentIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PageableQueryExperimentTaskByExperimentIdResponse setBody(PageableQueryExperimentTaskByExperimentIdResponseBody body) {
        this.body = body;
        return this;
    }
    public PageableQueryExperimentTaskByExperimentIdResponseBody getBody() {
        return this.body;
    }

}
