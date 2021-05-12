// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListEnvironmentPackagesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListEnvironmentPackagesResponseBody body;

    public static ListEnvironmentPackagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentPackagesResponse self = new ListEnvironmentPackagesResponse();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentPackagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnvironmentPackagesResponse setBody(ListEnvironmentPackagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEnvironmentPackagesResponseBody getBody() {
        return this.body;
    }

}
