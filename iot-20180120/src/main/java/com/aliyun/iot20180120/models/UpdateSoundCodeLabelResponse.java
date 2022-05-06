// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateSoundCodeLabelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdateSoundCodeLabelResponse setBody(UpdateSoundCodeLabelResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSoundCodeLabelResponseBody getBody() {
        return this.body;
    }

}
