// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class AddSecurityGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddSecurityGroupResponseBody body;

    public static AddSecurityGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSecurityGroupResponse self = new AddSecurityGroupResponse();
        return TeaModel.build(map, self);
    }

    public AddSecurityGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddSecurityGroupResponse setBody(AddSecurityGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AddSecurityGroupResponseBody getBody() {
        return this.body;
    }

}
