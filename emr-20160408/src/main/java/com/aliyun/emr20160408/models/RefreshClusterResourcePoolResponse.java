// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class RefreshClusterResourcePoolResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RefreshClusterResourcePoolResponseBody body;

    public static RefreshClusterResourcePoolResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshClusterResourcePoolResponse self = new RefreshClusterResourcePoolResponse();
        return TeaModel.build(map, self);
    }

    public RefreshClusterResourcePoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshClusterResourcePoolResponse setBody(RefreshClusterResourcePoolResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshClusterResourcePoolResponseBody getBody() {
        return this.body;
    }

}
