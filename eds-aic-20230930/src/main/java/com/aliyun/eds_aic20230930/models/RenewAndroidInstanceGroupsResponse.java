// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RenewAndroidInstanceGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenewAndroidInstanceGroupsResponseBody body;

    public static RenewAndroidInstanceGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewAndroidInstanceGroupsResponse self = new RenewAndroidInstanceGroupsResponse();
        return TeaModel.build(map, self);
    }

    public RenewAndroidInstanceGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenewAndroidInstanceGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenewAndroidInstanceGroupsResponse setBody(RenewAndroidInstanceGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewAndroidInstanceGroupsResponseBody getBody() {
        return this.body;
    }

}
