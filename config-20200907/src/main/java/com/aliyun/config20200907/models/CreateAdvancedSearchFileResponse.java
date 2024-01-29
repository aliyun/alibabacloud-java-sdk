// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateAdvancedSearchFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAdvancedSearchFileResponseBody body;

    public static CreateAdvancedSearchFileResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAdvancedSearchFileResponse self = new CreateAdvancedSearchFileResponse();
        return TeaModel.build(map, self);
    }

    public CreateAdvancedSearchFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAdvancedSearchFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAdvancedSearchFileResponse setBody(CreateAdvancedSearchFileResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAdvancedSearchFileResponseBody getBody() {
        return this.body;
    }

}
