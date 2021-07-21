// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListEnvChangePackageConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListEnvChangePackageConfigResponseBody body;

    public static ListEnvChangePackageConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnvChangePackageConfigResponse self = new ListEnvChangePackageConfigResponse();
        return TeaModel.build(map, self);
    }

    public ListEnvChangePackageConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnvChangePackageConfigResponse setBody(ListEnvChangePackageConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEnvChangePackageConfigResponseBody getBody() {
        return this.body;
    }

}
