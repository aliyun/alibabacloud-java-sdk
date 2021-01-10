// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ListDingtalkOpenPlatformConfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDingtalkOpenPlatformConfigsResponseBody body;

    public static ListDingtalkOpenPlatformConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDingtalkOpenPlatformConfigsResponse self = new ListDingtalkOpenPlatformConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListDingtalkOpenPlatformConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDingtalkOpenPlatformConfigsResponse setBody(ListDingtalkOpenPlatformConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDingtalkOpenPlatformConfigsResponseBody getBody() {
        return this.body;
    }

}
