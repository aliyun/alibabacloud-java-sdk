// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListSecurityGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSecurityGroupResponseBody body;

    public static ListSecurityGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSecurityGroupResponse self = new ListSecurityGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListSecurityGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSecurityGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSecurityGroupResponse setBody(ListSecurityGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSecurityGroupResponseBody getBody() {
        return this.body;
    }

}
