// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class SetClusterDnatResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetClusterDnatResponseBody body;

    public static SetClusterDnatResponse build(java.util.Map<String, ?> map) throws Exception {
        SetClusterDnatResponse self = new SetClusterDnatResponse();
        return TeaModel.build(map, self);
    }

    public SetClusterDnatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetClusterDnatResponse setBody(SetClusterDnatResponseBody body) {
        this.body = body;
        return this;
    }
    public SetClusterDnatResponseBody getBody() {
        return this.body;
    }

}
