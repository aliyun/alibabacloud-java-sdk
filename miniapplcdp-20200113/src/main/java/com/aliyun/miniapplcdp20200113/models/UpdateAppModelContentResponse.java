// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class UpdateAppModelContentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAppModelContentResponseBody body;

    public static UpdateAppModelContentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppModelContentResponse self = new UpdateAppModelContentResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAppModelContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAppModelContentResponse setBody(UpdateAppModelContentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAppModelContentResponseBody getBody() {
        return this.body;
    }

}
