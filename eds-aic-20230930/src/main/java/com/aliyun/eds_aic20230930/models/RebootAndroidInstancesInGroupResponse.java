// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RebootAndroidInstancesInGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RebootAndroidInstancesInGroupResponseBody body;

    public static RebootAndroidInstancesInGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        RebootAndroidInstancesInGroupResponse self = new RebootAndroidInstancesInGroupResponse();
        return TeaModel.build(map, self);
    }

    public RebootAndroidInstancesInGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RebootAndroidInstancesInGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RebootAndroidInstancesInGroupResponse setBody(RebootAndroidInstancesInGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public RebootAndroidInstancesInGroupResponseBody getBody() {
        return this.body;
    }

}
