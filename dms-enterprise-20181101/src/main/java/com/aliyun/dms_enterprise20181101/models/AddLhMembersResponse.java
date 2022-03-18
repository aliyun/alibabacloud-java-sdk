// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class AddLhMembersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLhMembersResponseBody body;

    public static AddLhMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLhMembersResponse self = new AddLhMembersResponse();
        return TeaModel.build(map, self);
    }

    public AddLhMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLhMembersResponse setBody(AddLhMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLhMembersResponseBody getBody() {
        return this.body;
    }

}
