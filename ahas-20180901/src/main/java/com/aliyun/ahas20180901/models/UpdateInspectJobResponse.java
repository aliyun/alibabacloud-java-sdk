// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class UpdateInspectJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateInspectJobResponseBody body;

    public static UpdateInspectJobResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInspectJobResponse self = new UpdateInspectJobResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInspectJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInspectJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateInspectJobResponse setBody(UpdateInspectJobResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInspectJobResponseBody getBody() {
        return this.body;
    }

}
