// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDomainGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddDomainGroupResponseBody body;

    public static AddDomainGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDomainGroupResponse self = new AddDomainGroupResponse();
        return TeaModel.build(map, self);
    }

    public AddDomainGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDomainGroupResponse setBody(AddDomainGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDomainGroupResponseBody getBody() {
        return this.body;
    }

}
