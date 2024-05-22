// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class UpdateEslDeviceLightResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEslDeviceLightResponseBody body;

    public static UpdateEslDeviceLightResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEslDeviceLightResponse self = new UpdateEslDeviceLightResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEslDeviceLightResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEslDeviceLightResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEslDeviceLightResponse setBody(UpdateEslDeviceLightResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEslDeviceLightResponseBody getBody() {
        return this.body;
    }

}
