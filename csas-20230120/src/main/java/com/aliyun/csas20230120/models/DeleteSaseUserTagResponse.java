// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteSaseUserTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSaseUserTagResponseBody body;

    public static DeleteSaseUserTagResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSaseUserTagResponse self = new DeleteSaseUserTagResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSaseUserTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSaseUserTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSaseUserTagResponse setBody(DeleteSaseUserTagResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSaseUserTagResponseBody getBody() {
        return this.body;
    }

}
