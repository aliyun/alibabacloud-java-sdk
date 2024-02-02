// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateSoundCodeScheduleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSoundCodeScheduleResponseBody body;

    public static UpdateSoundCodeScheduleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSoundCodeScheduleResponse self = new UpdateSoundCodeScheduleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSoundCodeScheduleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSoundCodeScheduleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSoundCodeScheduleResponse setBody(UpdateSoundCodeScheduleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSoundCodeScheduleResponseBody getBody() {
        return this.body;
    }

}
