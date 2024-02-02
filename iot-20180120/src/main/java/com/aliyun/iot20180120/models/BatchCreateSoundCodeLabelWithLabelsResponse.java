// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchCreateSoundCodeLabelWithLabelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public BatchCreateSoundCodeLabelWithLabelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchCreateSoundCodeLabelWithLabelsResponse setBody(BatchCreateSoundCodeLabelWithLabelsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchCreateSoundCodeLabelWithLabelsResponseBody getBody() {
        return this.body;
    }

}
