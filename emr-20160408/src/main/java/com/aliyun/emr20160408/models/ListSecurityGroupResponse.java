// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListSecurityGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListSecurityGroupResponse setBody(ListSecurityGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSecurityGroupResponseBody getBody() {
        return this.body;
    }

}
