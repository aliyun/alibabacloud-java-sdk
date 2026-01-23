// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteStandardSetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteStandardSetResponseBody body;

    public static DeleteStandardSetResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteStandardSetResponse self = new DeleteStandardSetResponse();
        return TeaModel.build(map, self);
    }

    public DeleteStandardSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteStandardSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteStandardSetResponse setBody(DeleteStandardSetResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteStandardSetResponseBody getBody() {
        return this.body;
    }

}
