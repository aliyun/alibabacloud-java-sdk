// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateSoundCodeScheduleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSoundCodeScheduleResponseBody body;

    public static CreateSoundCodeScheduleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSoundCodeScheduleResponse self = new CreateSoundCodeScheduleResponse();
        return TeaModel.build(map, self);
    }

    public CreateSoundCodeScheduleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSoundCodeScheduleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSoundCodeScheduleResponse setBody(CreateSoundCodeScheduleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSoundCodeScheduleResponseBody getBody() {
        return this.body;
    }

}
