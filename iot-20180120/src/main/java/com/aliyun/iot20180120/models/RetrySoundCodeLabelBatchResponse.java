// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class RetrySoundCodeLabelBatchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RetrySoundCodeLabelBatchResponseBody body;

    public static RetrySoundCodeLabelBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        RetrySoundCodeLabelBatchResponse self = new RetrySoundCodeLabelBatchResponse();
        return TeaModel.build(map, self);
    }

    public RetrySoundCodeLabelBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetrySoundCodeLabelBatchResponse setBody(RetrySoundCodeLabelBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public RetrySoundCodeLabelBatchResponseBody getBody() {
        return this.body;
    }

}
