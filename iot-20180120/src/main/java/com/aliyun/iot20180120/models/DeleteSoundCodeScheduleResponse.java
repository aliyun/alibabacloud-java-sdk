// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteSoundCodeScheduleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSoundCodeScheduleResponseBody body;

    public static DeleteSoundCodeScheduleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSoundCodeScheduleResponse self = new DeleteSoundCodeScheduleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSoundCodeScheduleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSoundCodeScheduleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSoundCodeScheduleResponse setBody(DeleteSoundCodeScheduleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSoundCodeScheduleResponseBody getBody() {
        return this.body;
    }

}
