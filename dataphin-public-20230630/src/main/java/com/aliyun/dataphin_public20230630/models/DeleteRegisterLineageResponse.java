// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteRegisterLineageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRegisterLineageResponseBody body;

    public static DeleteRegisterLineageResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRegisterLineageResponse self = new DeleteRegisterLineageResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRegisterLineageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRegisterLineageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRegisterLineageResponse setBody(DeleteRegisterLineageResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRegisterLineageResponseBody getBody() {
        return this.body;
    }

}
