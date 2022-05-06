// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchCreateSoundCodeLabelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchCreateSoundCodeLabelResponseBody body;

    public static BatchCreateSoundCodeLabelResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateSoundCodeLabelResponse self = new BatchCreateSoundCodeLabelResponse();
        return TeaModel.build(map, self);
    }

    public BatchCreateSoundCodeLabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchCreateSoundCodeLabelResponse setBody(BatchCreateSoundCodeLabelResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchCreateSoundCodeLabelResponseBody getBody() {
        return this.body;
    }

}
