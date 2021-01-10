// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ListOpenPlatformConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListOpenPlatformConfigResponseBody body;

    public static ListOpenPlatformConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOpenPlatformConfigResponse self = new ListOpenPlatformConfigResponse();
        return TeaModel.build(map, self);
    }

    public ListOpenPlatformConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOpenPlatformConfigResponse setBody(ListOpenPlatformConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOpenPlatformConfigResponseBody getBody() {
        return this.body;
    }

}
