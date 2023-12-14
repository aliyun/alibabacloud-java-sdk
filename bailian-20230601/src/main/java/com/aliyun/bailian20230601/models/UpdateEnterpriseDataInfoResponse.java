// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class UpdateEnterpriseDataInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateEnterpriseDataInfoResponseBody body;

    public static UpdateEnterpriseDataInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnterpriseDataInfoResponse self = new UpdateEnterpriseDataInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEnterpriseDataInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEnterpriseDataInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEnterpriseDataInfoResponse setBody(UpdateEnterpriseDataInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEnterpriseDataInfoResponseBody getBody() {
        return this.body;
    }

}
