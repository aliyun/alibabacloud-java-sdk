// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SetAutoScaleConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetAutoScaleConfigResponseBody body;

    public static SetAutoScaleConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetAutoScaleConfigResponse self = new SetAutoScaleConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetAutoScaleConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetAutoScaleConfigResponse setBody(SetAutoScaleConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetAutoScaleConfigResponseBody getBody() {
        return this.body;
    }

}
