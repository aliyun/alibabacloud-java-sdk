// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class SaveWebRTCStatsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveWebRTCStatsResponseBody body;

    public static SaveWebRTCStatsResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveWebRTCStatsResponse self = new SaveWebRTCStatsResponse();
        return TeaModel.build(map, self);
    }

    public SaveWebRTCStatsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveWebRTCStatsResponse setBody(SaveWebRTCStatsResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveWebRTCStatsResponseBody getBody() {
        return this.body;
    }

}
