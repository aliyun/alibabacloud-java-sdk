// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class UpdateEnterpriseTagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateEnterpriseTagResponseBody body;

    public static UpdateEnterpriseTagResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnterpriseTagResponse self = new UpdateEnterpriseTagResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEnterpriseTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEnterpriseTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEnterpriseTagResponse setBody(UpdateEnterpriseTagResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEnterpriseTagResponseBody getBody() {
        return this.body;
    }

}
