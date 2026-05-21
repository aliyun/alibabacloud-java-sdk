// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class UpdateHoloWebLoginSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateHoloWebLoginSettingResponseBody body;

    public static UpdateHoloWebLoginSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHoloWebLoginSettingResponse self = new UpdateHoloWebLoginSettingResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHoloWebLoginSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHoloWebLoginSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateHoloWebLoginSettingResponse setBody(UpdateHoloWebLoginSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHoloWebLoginSettingResponseBody getBody() {
        return this.body;
    }

}
