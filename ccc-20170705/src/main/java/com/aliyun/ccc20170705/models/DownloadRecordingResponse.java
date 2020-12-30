// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class DownloadRecordingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DownloadRecordingResponseBody body;

    public static DownloadRecordingResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadRecordingResponse self = new DownloadRecordingResponse();
        return TeaModel.build(map, self);
    }

    public DownloadRecordingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadRecordingResponse setBody(DownloadRecordingResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadRecordingResponseBody getBody() {
        return this.body;
    }

}
