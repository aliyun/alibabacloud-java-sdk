// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DeleteAutomateResponseConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAutomateResponseConfigResponseBody body;

    public static DeleteAutomateResponseConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAutomateResponseConfigResponse self = new DeleteAutomateResponseConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAutomateResponseConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAutomateResponseConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAutomateResponseConfigResponse setBody(DeleteAutomateResponseConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAutomateResponseConfigResponseBody getBody() {
        return this.body;
    }

}
