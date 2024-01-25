// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteTrafficSpecialControlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTrafficSpecialControlResponseBody body;

    public static DeleteTrafficSpecialControlResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTrafficSpecialControlResponse self = new DeleteTrafficSpecialControlResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTrafficSpecialControlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTrafficSpecialControlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTrafficSpecialControlResponse setBody(DeleteTrafficSpecialControlResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTrafficSpecialControlResponseBody getBody() {
        return this.body;
    }

}
