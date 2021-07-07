// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class AddVirtualNumberRelationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddVirtualNumberRelationResponseBody body;

    public static AddVirtualNumberRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        AddVirtualNumberRelationResponse self = new AddVirtualNumberRelationResponse();
        return TeaModel.build(map, self);
    }

    public AddVirtualNumberRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddVirtualNumberRelationResponse setBody(AddVirtualNumberRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public AddVirtualNumberRelationResponseBody getBody() {
        return this.body;
    }

}
