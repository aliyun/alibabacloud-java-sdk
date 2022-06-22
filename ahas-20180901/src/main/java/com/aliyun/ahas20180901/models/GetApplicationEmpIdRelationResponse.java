// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetApplicationEmpIdRelationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetApplicationEmpIdRelationResponseBody body;

    public static GetApplicationEmpIdRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationEmpIdRelationResponse self = new GetApplicationEmpIdRelationResponse();
        return TeaModel.build(map, self);
    }

    public GetApplicationEmpIdRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApplicationEmpIdRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetApplicationEmpIdRelationResponse setBody(GetApplicationEmpIdRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApplicationEmpIdRelationResponseBody getBody() {
        return this.body;
    }

}
