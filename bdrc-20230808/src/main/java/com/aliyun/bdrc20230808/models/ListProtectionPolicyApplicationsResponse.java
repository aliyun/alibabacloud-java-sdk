// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class ListProtectionPolicyApplicationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProtectionPolicyApplicationsResponseBody body;

    public static ListProtectionPolicyApplicationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProtectionPolicyApplicationsResponse self = new ListProtectionPolicyApplicationsResponse();
        return TeaModel.build(map, self);
    }

    public ListProtectionPolicyApplicationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProtectionPolicyApplicationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProtectionPolicyApplicationsResponse setBody(ListProtectionPolicyApplicationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProtectionPolicyApplicationsResponseBody getBody() {
        return this.body;
    }

}
