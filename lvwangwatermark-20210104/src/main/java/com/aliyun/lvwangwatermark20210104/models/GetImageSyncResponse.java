// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class GetImageSyncResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetImageSyncResponseBody body;

    public static GetImageSyncResponse build(java.util.Map<String, ?> map) throws Exception {
        GetImageSyncResponse self = new GetImageSyncResponse();
        return TeaModel.build(map, self);
    }

    public GetImageSyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetImageSyncResponse setBody(GetImageSyncResponseBody body) {
        this.body = body;
        return this;
    }
    public GetImageSyncResponseBody getBody() {
        return this.body;
    }

}
