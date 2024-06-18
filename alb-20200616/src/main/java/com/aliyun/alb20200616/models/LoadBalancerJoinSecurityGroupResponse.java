// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class LoadBalancerJoinSecurityGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LoadBalancerJoinSecurityGroupResponseBody body;

    public static LoadBalancerJoinSecurityGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        LoadBalancerJoinSecurityGroupResponse self = new LoadBalancerJoinSecurityGroupResponse();
        return TeaModel.build(map, self);
    }

    public LoadBalancerJoinSecurityGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LoadBalancerJoinSecurityGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LoadBalancerJoinSecurityGroupResponse setBody(LoadBalancerJoinSecurityGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public LoadBalancerJoinSecurityGroupResponseBody getBody() {
        return this.body;
    }

}
