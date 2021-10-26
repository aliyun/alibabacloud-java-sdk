// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class RemoveVpcAccessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveVpcAccessResponseBody body;

    public static RemoveVpcAccessResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveVpcAccessResponse self = new RemoveVpcAccessResponse();
        return TeaModel.build(map, self);
    }

    public RemoveVpcAccessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveVpcAccessResponse setBody(RemoveVpcAccessResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveVpcAccessResponseBody getBody() {
        return this.body;
    }

}
