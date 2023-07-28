// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DryRunClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DryRunClusterResponseBody body;

    public static DryRunClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        DryRunClusterResponse self = new DryRunClusterResponse();
        return TeaModel.build(map, self);
    }

    public DryRunClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DryRunClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DryRunClusterResponse setBody(DryRunClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public DryRunClusterResponseBody getBody() {
        return this.body;
    }

}
