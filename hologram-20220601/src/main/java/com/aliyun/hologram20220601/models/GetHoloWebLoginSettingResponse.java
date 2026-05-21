// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class GetHoloWebLoginSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHoloWebLoginSettingResponseBody body;

    public static GetHoloWebLoginSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHoloWebLoginSettingResponse self = new GetHoloWebLoginSettingResponse();
        return TeaModel.build(map, self);
    }

    public GetHoloWebLoginSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHoloWebLoginSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHoloWebLoginSettingResponse setBody(GetHoloWebLoginSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHoloWebLoginSettingResponseBody getBody() {
        return this.body;
    }

}
