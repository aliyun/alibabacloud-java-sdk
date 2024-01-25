// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DeleteTagInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTagInfoResponseBody body;

    public static DeleteTagInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTagInfoResponse self = new DeleteTagInfoResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTagInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTagInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTagInfoResponse setBody(DeleteTagInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTagInfoResponseBody getBody() {
        return this.body;
    }

}
