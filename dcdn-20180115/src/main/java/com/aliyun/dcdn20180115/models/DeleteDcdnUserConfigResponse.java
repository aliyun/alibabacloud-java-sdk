// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteDcdnUserConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDcdnUserConfigResponseBody body;

    public static DeleteDcdnUserConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDcdnUserConfigResponse self = new DeleteDcdnUserConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDcdnUserConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDcdnUserConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDcdnUserConfigResponse setBody(DeleteDcdnUserConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDcdnUserConfigResponseBody getBody() {
        return this.body;
    }

}
