// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class PackageSoundCodeLabelBatchAudioResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PackageSoundCodeLabelBatchAudioResponseBody body;

    public static PackageSoundCodeLabelBatchAudioResponse build(java.util.Map<String, ?> map) throws Exception {
        PackageSoundCodeLabelBatchAudioResponse self = new PackageSoundCodeLabelBatchAudioResponse();
        return TeaModel.build(map, self);
    }

    public PackageSoundCodeLabelBatchAudioResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PackageSoundCodeLabelBatchAudioResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PackageSoundCodeLabelBatchAudioResponse setBody(PackageSoundCodeLabelBatchAudioResponseBody body) {
        this.body = body;
        return this;
    }
    public PackageSoundCodeLabelBatchAudioResponseBody getBody() {
        return this.body;
    }

}
