// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class DeleteGeneralConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteGeneralConfigResponseBody body;

    public static DeleteGeneralConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGeneralConfigResponse self = new DeleteGeneralConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGeneralConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGeneralConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGeneralConfigResponse setBody(DeleteGeneralConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGeneralConfigResponseBody getBody() {
        return this.body;
    }

}
