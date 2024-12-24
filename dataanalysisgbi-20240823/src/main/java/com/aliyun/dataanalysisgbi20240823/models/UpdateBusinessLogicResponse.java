// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class UpdateBusinessLogicResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateBusinessLogicResponseBody body;

    public static UpdateBusinessLogicResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBusinessLogicResponse self = new UpdateBusinessLogicResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBusinessLogicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBusinessLogicResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateBusinessLogicResponse setBody(UpdateBusinessLogicResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBusinessLogicResponseBody getBody() {
        return this.body;
    }

}
