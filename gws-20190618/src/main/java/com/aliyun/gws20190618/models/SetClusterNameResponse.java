// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class SetClusterNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetClusterNameResponseBody body;

    public static SetClusterNameResponse build(java.util.Map<String, ?> map) throws Exception {
        SetClusterNameResponse self = new SetClusterNameResponse();
        return TeaModel.build(map, self);
    }

    public SetClusterNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetClusterNameResponse setBody(SetClusterNameResponseBody body) {
        this.body = body;
        return this;
    }
    public SetClusterNameResponseBody getBody() {
        return this.body;
    }

}
