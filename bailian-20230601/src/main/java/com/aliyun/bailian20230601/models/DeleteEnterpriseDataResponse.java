// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class DeleteEnterpriseDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteEnterpriseDataResponseBody body;

    public static DeleteEnterpriseDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnterpriseDataResponse self = new DeleteEnterpriseDataResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEnterpriseDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEnterpriseDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEnterpriseDataResponse setBody(DeleteEnterpriseDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEnterpriseDataResponseBody getBody() {
        return this.body;
    }

}
