// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateAlertActionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAlertActionResponseBody body;

    public static UpdateAlertActionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlertActionResponse self = new UpdateAlertActionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAlertActionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAlertActionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAlertActionResponse setBody(UpdateAlertActionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAlertActionResponseBody getBody() {
        return this.body;
    }

}
