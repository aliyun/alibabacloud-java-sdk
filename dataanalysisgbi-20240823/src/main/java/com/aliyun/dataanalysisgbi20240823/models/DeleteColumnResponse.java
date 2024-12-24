// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class DeleteColumnResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteColumnResponseBody body;

    public static DeleteColumnResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteColumnResponse self = new DeleteColumnResponse();
        return TeaModel.build(map, self);
    }

    public DeleteColumnResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteColumnResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteColumnResponse setBody(DeleteColumnResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteColumnResponseBody getBody() {
        return this.body;
    }

}
