// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class PageableQueryExperimentTaskByClusterIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PageableQueryExperimentTaskByClusterIdResponseBody body;

    public static PageableQueryExperimentTaskByClusterIdResponse build(java.util.Map<String, ?> map) throws Exception {
        PageableQueryExperimentTaskByClusterIdResponse self = new PageableQueryExperimentTaskByClusterIdResponse();
        return TeaModel.build(map, self);
    }

    public PageableQueryExperimentTaskByClusterIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PageableQueryExperimentTaskByClusterIdResponse setBody(PageableQueryExperimentTaskByClusterIdResponseBody body) {
        this.body = body;
        return this;
    }
    public PageableQueryExperimentTaskByClusterIdResponseBody getBody() {
        return this.body;
    }

}
