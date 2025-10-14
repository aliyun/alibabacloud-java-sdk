// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateDataSetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDataSetResponseBody body;

    public static UpdateDataSetResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataSetResponse self = new UpdateDataSetResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDataSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDataSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDataSetResponse setBody(UpdateDataSetResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDataSetResponseBody getBody() {
        return this.body;
    }

}
