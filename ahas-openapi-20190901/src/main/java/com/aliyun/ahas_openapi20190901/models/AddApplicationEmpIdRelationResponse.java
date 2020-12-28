// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class AddApplicationEmpIdRelationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddApplicationEmpIdRelationResponseBody body;

    public static AddApplicationEmpIdRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        AddApplicationEmpIdRelationResponse self = new AddApplicationEmpIdRelationResponse();
        return TeaModel.build(map, self);
    }

    public AddApplicationEmpIdRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddApplicationEmpIdRelationResponse setBody(AddApplicationEmpIdRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public AddApplicationEmpIdRelationResponseBody getBody() {
        return this.body;
    }

}
