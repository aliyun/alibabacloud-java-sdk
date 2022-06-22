// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class UpdateApplicationEmpIdRelationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateApplicationEmpIdRelationResponseBody body;

    public static UpdateApplicationEmpIdRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationEmpIdRelationResponse self = new UpdateApplicationEmpIdRelationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationEmpIdRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateApplicationEmpIdRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateApplicationEmpIdRelationResponse setBody(UpdateApplicationEmpIdRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateApplicationEmpIdRelationResponseBody getBody() {
        return this.body;
    }

}
