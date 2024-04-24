// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class RemoveBackupsSetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveBackupsSetResponseBody body;

    public static RemoveBackupsSetResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveBackupsSetResponse self = new RemoveBackupsSetResponse();
        return TeaModel.build(map, self);
    }

    public RemoveBackupsSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveBackupsSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveBackupsSetResponse setBody(RemoveBackupsSetResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveBackupsSetResponseBody getBody() {
        return this.body;
    }

}
