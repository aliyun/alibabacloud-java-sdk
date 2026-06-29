// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DeleteAgenticSpaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAgenticSpaceResponseBody body;

    public static DeleteAgenticSpaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgenticSpaceResponse self = new DeleteAgenticSpaceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAgenticSpaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAgenticSpaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAgenticSpaceResponse setBody(DeleteAgenticSpaceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAgenticSpaceResponseBody getBody() {
        return this.body;
    }

}
