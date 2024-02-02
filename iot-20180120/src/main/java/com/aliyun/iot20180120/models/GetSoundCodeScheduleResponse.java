// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetSoundCodeScheduleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSoundCodeScheduleResponseBody body;

    public static GetSoundCodeScheduleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSoundCodeScheduleResponse self = new GetSoundCodeScheduleResponse();
        return TeaModel.build(map, self);
    }

    public GetSoundCodeScheduleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSoundCodeScheduleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSoundCodeScheduleResponse setBody(GetSoundCodeScheduleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSoundCodeScheduleResponseBody getBody() {
        return this.body;
    }

}
