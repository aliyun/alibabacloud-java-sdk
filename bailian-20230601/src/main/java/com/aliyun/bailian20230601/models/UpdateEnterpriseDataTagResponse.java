// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class UpdateEnterpriseDataTagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateEnterpriseDataTagResponseBody body;

    public static UpdateEnterpriseDataTagResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnterpriseDataTagResponse self = new UpdateEnterpriseDataTagResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEnterpriseDataTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEnterpriseDataTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEnterpriseDataTagResponse setBody(UpdateEnterpriseDataTagResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEnterpriseDataTagResponseBody getBody() {
        return this.body;
    }

}
