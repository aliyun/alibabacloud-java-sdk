// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateWorkbenchEventResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateWorkbenchEventResultResponseBody body;

    public static UpdateWorkbenchEventResultResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkbenchEventResultResponse self = new UpdateWorkbenchEventResultResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWorkbenchEventResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWorkbenchEventResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWorkbenchEventResultResponse setBody(UpdateWorkbenchEventResultResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWorkbenchEventResultResponseBody getBody() {
        return this.body;
    }

}
