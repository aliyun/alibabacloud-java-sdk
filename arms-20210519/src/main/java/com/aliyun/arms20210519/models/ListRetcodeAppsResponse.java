// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class ListRetcodeAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListRetcodeAppsResponseBody body;

    public static ListRetcodeAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRetcodeAppsResponse self = new ListRetcodeAppsResponse();
        return TeaModel.build(map, self);
    }

    public ListRetcodeAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRetcodeAppsResponse setBody(ListRetcodeAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRetcodeAppsResponseBody getBody() {
        return this.body;
    }

}
