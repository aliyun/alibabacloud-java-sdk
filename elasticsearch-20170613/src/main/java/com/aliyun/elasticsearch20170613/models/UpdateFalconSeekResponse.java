// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateFalconSeekResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateFalconSeekResponseBody body;

    public static UpdateFalconSeekResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFalconSeekResponse self = new UpdateFalconSeekResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFalconSeekResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFalconSeekResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFalconSeekResponse setBody(UpdateFalconSeekResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFalconSeekResponseBody getBody() {
        return this.body;
    }

}
