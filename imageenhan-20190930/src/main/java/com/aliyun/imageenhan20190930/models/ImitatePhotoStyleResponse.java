// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ImitatePhotoStyleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ImitatePhotoStyleResponseBody body;

    public static ImitatePhotoStyleResponse build(java.util.Map<String, ?> map) throws Exception {
        ImitatePhotoStyleResponse self = new ImitatePhotoStyleResponse();
        return TeaModel.build(map, self);
    }

    public ImitatePhotoStyleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImitatePhotoStyleResponse setBody(ImitatePhotoStyleResponseBody body) {
        this.body = body;
        return this;
    }
    public ImitatePhotoStyleResponseBody getBody() {
        return this.body;
    }

}
