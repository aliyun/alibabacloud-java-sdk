// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteAllTrafficSpecialControlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAllTrafficSpecialControlResponseBody body;

    public static DeleteAllTrafficSpecialControlResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAllTrafficSpecialControlResponse self = new DeleteAllTrafficSpecialControlResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAllTrafficSpecialControlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAllTrafficSpecialControlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAllTrafficSpecialControlResponse setBody(DeleteAllTrafficSpecialControlResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAllTrafficSpecialControlResponseBody getBody() {
        return this.body;
    }

}
