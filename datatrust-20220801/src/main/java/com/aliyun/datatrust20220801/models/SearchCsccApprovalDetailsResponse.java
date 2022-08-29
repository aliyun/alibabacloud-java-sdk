// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class SearchCsccApprovalDetailsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SearchCsccApprovalDetailsResponseBody body;

    public static SearchCsccApprovalDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchCsccApprovalDetailsResponse self = new SearchCsccApprovalDetailsResponse();
        return TeaModel.build(map, self);
    }

    public SearchCsccApprovalDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchCsccApprovalDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchCsccApprovalDetailsResponse setBody(SearchCsccApprovalDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchCsccApprovalDetailsResponseBody getBody() {
        return this.body;
    }

}
