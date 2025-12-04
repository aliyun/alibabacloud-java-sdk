// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class UpdateGeneralConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateGeneralConfigResponseBody body;

    public static UpdateGeneralConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGeneralConfigResponse self = new UpdateGeneralConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGeneralConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGeneralConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGeneralConfigResponse setBody(UpdateGeneralConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGeneralConfigResponseBody getBody() {
        return this.body;
    }

}
