// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchCreateSoundCodeLabelWithLabelsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchCreateSoundCodeLabelWithLabelsResponseBody body;

    public static BatchCreateSoundCodeLabelWithLabelsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateSoundCodeLabelWithLabelsResponse self = new BatchCreateSoundCodeLabelWithLabelsResponse();
        return TeaModel.build(map, self);
    }

    public BatchCreateSoundCodeLabelWithLabelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchCreateSoundCodeLabelWithLabelsResponse setBody(BatchCreateSoundCodeLabelWithLabelsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchCreateSoundCodeLabelWithLabelsResponseBody getBody() {
        return this.body;
    }

}
