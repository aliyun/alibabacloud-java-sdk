// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VideoAsyncScanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static VideoAsyncScanResponse build(java.util.Map<String, ?> map) throws Exception {
        VideoAsyncScanResponse self = new VideoAsyncScanResponse();
        return TeaModel.build(map, self);
    }

    public VideoAsyncScanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
