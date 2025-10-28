// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateLocalitySettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLocalitySettingResponseBody body;

    public static UpdateLocalitySettingResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLocalitySettingResponse self = new UpdateLocalitySettingResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLocalitySettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLocalitySettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLocalitySettingResponse setBody(UpdateLocalitySettingResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLocalitySettingResponseBody getBody() {
        return this.body;
    }

}
