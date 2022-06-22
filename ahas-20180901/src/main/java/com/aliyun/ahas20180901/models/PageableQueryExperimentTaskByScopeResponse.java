// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class PageableQueryExperimentTaskByScopeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PageableQueryExperimentTaskByScopeResponseBody body;

    public static PageableQueryExperimentTaskByScopeResponse build(java.util.Map<String, ?> map) throws Exception {
        PageableQueryExperimentTaskByScopeResponse self = new PageableQueryExperimentTaskByScopeResponse();
        return TeaModel.build(map, self);
    }

    public PageableQueryExperimentTaskByScopeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PageableQueryExperimentTaskByScopeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PageableQueryExperimentTaskByScopeResponse setBody(PageableQueryExperimentTaskByScopeResponseBody body) {
        this.body = body;
        return this;
    }
    public PageableQueryExperimentTaskByScopeResponseBody getBody() {
        return this.body;
    }

}
