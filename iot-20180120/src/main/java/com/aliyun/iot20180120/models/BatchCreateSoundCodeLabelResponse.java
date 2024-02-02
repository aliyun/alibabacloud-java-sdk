// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchCreateSoundCodeLabelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public BatchCreateSoundCodeLabelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchCreateSoundCodeLabelResponse setBody(BatchCreateSoundCodeLabelResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchCreateSoundCodeLabelResponseBody getBody() {
        return this.body;
    }

}
