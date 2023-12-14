// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class DelEnterpriseTagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DelEnterpriseTagResponseBody body;

    public static DelEnterpriseTagResponse build(java.util.Map<String, ?> map) throws Exception {
        DelEnterpriseTagResponse self = new DelEnterpriseTagResponse();
        return TeaModel.build(map, self);
    }

    public DelEnterpriseTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DelEnterpriseTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DelEnterpriseTagResponse setBody(DelEnterpriseTagResponseBody body) {
        this.body = body;
        return this;
    }
    public DelEnterpriseTagResponseBody getBody() {
        return this.body;
    }

}
