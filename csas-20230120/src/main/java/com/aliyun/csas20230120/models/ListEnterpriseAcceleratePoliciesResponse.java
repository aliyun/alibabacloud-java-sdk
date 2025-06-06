// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListEnterpriseAcceleratePoliciesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEnterpriseAcceleratePoliciesResponseBody body;

    public static ListEnterpriseAcceleratePoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnterpriseAcceleratePoliciesResponse self = new ListEnterpriseAcceleratePoliciesResponse();
        return TeaModel.build(map, self);
    }

    public ListEnterpriseAcceleratePoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnterpriseAcceleratePoliciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEnterpriseAcceleratePoliciesResponse setBody(ListEnterpriseAcceleratePoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEnterpriseAcceleratePoliciesResponseBody getBody() {
        return this.body;
    }

}
