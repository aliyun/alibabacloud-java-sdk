// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class SetInstanceModeOnDemandResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetInstanceModeOnDemandResponseBody body;

    public static SetInstanceModeOnDemandResponse build(java.util.Map<String, ?> map) throws Exception {
        SetInstanceModeOnDemandResponse self = new SetInstanceModeOnDemandResponse();
        return TeaModel.build(map, self);
    }

    public SetInstanceModeOnDemandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetInstanceModeOnDemandResponse setBody(SetInstanceModeOnDemandResponseBody body) {
        this.body = body;
        return this;
    }
    public SetInstanceModeOnDemandResponseBody getBody() {
        return this.body;
    }

}
