// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteMetaEntityDefResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMetaEntityDefResponseBody body;

    public static DeleteMetaEntityDefResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetaEntityDefResponse self = new DeleteMetaEntityDefResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMetaEntityDefResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMetaEntityDefResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMetaEntityDefResponse setBody(DeleteMetaEntityDefResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMetaEntityDefResponseBody getBody() {
        return this.body;
    }

}
