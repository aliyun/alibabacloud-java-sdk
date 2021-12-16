// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class SetDcdnUserConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetDcdnUserConfigResponseBody body;

    public static SetDcdnUserConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDcdnUserConfigResponse self = new SetDcdnUserConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetDcdnUserConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDcdnUserConfigResponse setBody(SetDcdnUserConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDcdnUserConfigResponseBody getBody() {
        return this.body;
    }

}
