// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMappCenterAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMappCenterAppsResponseBody body;

    public static ListMappCenterAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMappCenterAppsResponse self = new ListMappCenterAppsResponse();
        return TeaModel.build(map, self);
    }

    public ListMappCenterAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMappCenterAppsResponse setBody(ListMappCenterAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMappCenterAppsResponseBody getBody() {
        return this.body;
    }

}
