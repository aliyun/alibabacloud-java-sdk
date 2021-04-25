// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListGlobalAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListGlobalAppsResponseBody body;

    public static ListGlobalAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGlobalAppsResponse self = new ListGlobalAppsResponse();
        return TeaModel.build(map, self);
    }

    public ListGlobalAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGlobalAppsResponse setBody(ListGlobalAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGlobalAppsResponseBody getBody() {
        return this.body;
    }

}
