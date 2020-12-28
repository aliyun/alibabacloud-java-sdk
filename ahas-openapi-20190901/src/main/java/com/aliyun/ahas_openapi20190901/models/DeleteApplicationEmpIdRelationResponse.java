// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class DeleteApplicationEmpIdRelationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteApplicationEmpIdRelationResponseBody body;

    public static DeleteApplicationEmpIdRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationEmpIdRelationResponse self = new DeleteApplicationEmpIdRelationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationEmpIdRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteApplicationEmpIdRelationResponse setBody(DeleteApplicationEmpIdRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteApplicationEmpIdRelationResponseBody getBody() {
        return this.body;
    }

}
