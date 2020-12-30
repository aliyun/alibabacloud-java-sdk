// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class DownloadCabRecordingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DownloadCabRecordingResponseBody body;

    public static DownloadCabRecordingResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadCabRecordingResponse self = new DownloadCabRecordingResponse();
        return TeaModel.build(map, self);
    }

    public DownloadCabRecordingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadCabRecordingResponse setBody(DownloadCabRecordingResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadCabRecordingResponseBody getBody() {
        return this.body;
    }

}
