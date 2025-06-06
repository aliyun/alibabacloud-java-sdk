// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListEnterpriseAccelerateTargetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEnterpriseAccelerateTargetsResponseBody body;

    public static ListEnterpriseAccelerateTargetsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnterpriseAccelerateTargetsResponse self = new ListEnterpriseAccelerateTargetsResponse();
        return TeaModel.build(map, self);
    }

    public ListEnterpriseAccelerateTargetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnterpriseAccelerateTargetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEnterpriseAccelerateTargetsResponse setBody(ListEnterpriseAccelerateTargetsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEnterpriseAccelerateTargetsResponseBody getBody() {
        return this.body;
    }

}
