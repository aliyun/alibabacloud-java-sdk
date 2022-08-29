// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class SearchCsccApprovalsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SearchCsccApprovalsResponseBody body;

    public static SearchCsccApprovalsResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchCsccApprovalsResponse self = new SearchCsccApprovalsResponse();
        return TeaModel.build(map, self);
    }

    public SearchCsccApprovalsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchCsccApprovalsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchCsccApprovalsResponse setBody(SearchCsccApprovalsResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchCsccApprovalsResponseBody getBody() {
        return this.body;
    }

}
