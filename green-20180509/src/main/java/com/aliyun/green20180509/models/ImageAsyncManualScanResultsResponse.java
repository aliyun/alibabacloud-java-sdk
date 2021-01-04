// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class ImageAsyncManualScanResultsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static ImageAsyncManualScanResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        ImageAsyncManualScanResultsResponse self = new ImageAsyncManualScanResultsResponse();
        return TeaModel.build(map, self);
    }

    public ImageAsyncManualScanResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
