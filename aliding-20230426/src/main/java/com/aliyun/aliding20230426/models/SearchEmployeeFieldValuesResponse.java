// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SearchEmployeeFieldValuesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SearchEmployeeFieldValuesResponseBody body;

    public static SearchEmployeeFieldValuesResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchEmployeeFieldValuesResponse self = new SearchEmployeeFieldValuesResponse();
        return TeaModel.build(map, self);
    }

    public SearchEmployeeFieldValuesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchEmployeeFieldValuesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchEmployeeFieldValuesResponse setBody(SearchEmployeeFieldValuesResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchEmployeeFieldValuesResponseBody getBody() {
        return this.body;
    }

}
