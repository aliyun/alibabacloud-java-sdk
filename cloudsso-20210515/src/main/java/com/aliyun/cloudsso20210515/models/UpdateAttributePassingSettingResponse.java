// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateAttributePassingSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAttributePassingSettingResponseBody body;

    public static UpdateAttributePassingSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAttributePassingSettingResponse self = new UpdateAttributePassingSettingResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAttributePassingSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAttributePassingSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAttributePassingSettingResponse setBody(UpdateAttributePassingSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAttributePassingSettingResponseBody getBody() {
        return this.body;
    }

}
