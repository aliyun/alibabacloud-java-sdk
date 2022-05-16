// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class ListDeployableInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDeployableInstancesResponseBody body;

    public static ListDeployableInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeployableInstancesResponse self = new ListDeployableInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListDeployableInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeployableInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDeployableInstancesResponse setBody(ListDeployableInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeployableInstancesResponseBody getBody() {
        return this.body;
    }

}
