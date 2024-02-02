// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateSoundCodeLabelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSoundCodeLabelResponseBody body;

    public static UpdateSoundCodeLabelResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSoundCodeLabelResponse self = new UpdateSoundCodeLabelResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSoundCodeLabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSoundCodeLabelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSoundCodeLabelResponse setBody(UpdateSoundCodeLabelResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSoundCodeLabelResponseBody getBody() {
        return this.body;
    }

}
