// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAdvancedSearchFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAdvancedSearchFileResponseBody body;

    public static GetAdvancedSearchFileResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAdvancedSearchFileResponse self = new GetAdvancedSearchFileResponse();
        return TeaModel.build(map, self);
    }

    public GetAdvancedSearchFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAdvancedSearchFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAdvancedSearchFileResponse setBody(GetAdvancedSearchFileResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAdvancedSearchFileResponseBody getBody() {
        return this.body;
    }

}
