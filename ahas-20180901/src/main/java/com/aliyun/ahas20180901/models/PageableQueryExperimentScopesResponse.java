// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class PageableQueryExperimentScopesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PageableQueryExperimentScopesResponseBody body;

    public static PageableQueryExperimentScopesResponse build(java.util.Map<String, ?> map) throws Exception {
        PageableQueryExperimentScopesResponse self = new PageableQueryExperimentScopesResponse();
        return TeaModel.build(map, self);
    }

    public PageableQueryExperimentScopesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PageableQueryExperimentScopesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PageableQueryExperimentScopesResponse setBody(PageableQueryExperimentScopesResponseBody body) {
        this.body = body;
        return this;
    }
    public PageableQueryExperimentScopesResponseBody getBody() {
        return this.body;
    }

}
