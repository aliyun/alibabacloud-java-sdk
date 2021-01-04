// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UploadCcRouteFileForParseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UploadCcRouteFileForParseResponseBody body;

    public static UploadCcRouteFileForParseResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadCcRouteFileForParseResponse self = new UploadCcRouteFileForParseResponse();
        return TeaModel.build(map, self);
    }

    public UploadCcRouteFileForParseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadCcRouteFileForParseResponse setBody(UploadCcRouteFileForParseResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadCcRouteFileForParseResponseBody getBody() {
        return this.body;
    }

}
