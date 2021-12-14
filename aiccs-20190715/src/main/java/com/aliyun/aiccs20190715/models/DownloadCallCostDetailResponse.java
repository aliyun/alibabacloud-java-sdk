// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class DownloadCallCostDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DownloadCallCostDetailResponseBody body;

    public static DownloadCallCostDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadCallCostDetailResponse self = new DownloadCallCostDetailResponse();
        return TeaModel.build(map, self);
    }

    public DownloadCallCostDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadCallCostDetailResponse setBody(DownloadCallCostDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadCallCostDetailResponseBody getBody() {
        return this.body;
    }

}
