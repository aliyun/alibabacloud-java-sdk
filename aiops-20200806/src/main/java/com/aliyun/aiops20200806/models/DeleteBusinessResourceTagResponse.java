// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DeleteBusinessResourceTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteBusinessResourceTagResponseBody body;

    public static DeleteBusinessResourceTagResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBusinessResourceTagResponse self = new DeleteBusinessResourceTagResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBusinessResourceTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBusinessResourceTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBusinessResourceTagResponse setBody(DeleteBusinessResourceTagResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBusinessResourceTagResponseBody getBody() {
        return this.body;
    }

}
