// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivpd20190625.models;

import com.aliyun.tea.*;

public class EraseLogoInVideoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EraseLogoInVideoResponseBody body;

    public static EraseLogoInVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        EraseLogoInVideoResponse self = new EraseLogoInVideoResponse();
        return TeaModel.build(map, self);
    }

    public EraseLogoInVideoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EraseLogoInVideoResponse setBody(EraseLogoInVideoResponseBody body) {
        this.body = body;
        return this;
    }
    public EraseLogoInVideoResponseBody getBody() {
        return this.body;
    }

}
