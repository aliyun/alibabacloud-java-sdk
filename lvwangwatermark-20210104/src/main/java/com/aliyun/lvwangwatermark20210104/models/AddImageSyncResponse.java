// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class AddImageSyncResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddImageSyncResponseBody body;

    public static AddImageSyncResponse build(java.util.Map<String, ?> map) throws Exception {
        AddImageSyncResponse self = new AddImageSyncResponse();
        return TeaModel.build(map, self);
    }

    public AddImageSyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddImageSyncResponse setBody(AddImageSyncResponseBody body) {
        this.body = body;
        return this;
    }
    public AddImageSyncResponseBody getBody() {
        return this.body;
    }

}
