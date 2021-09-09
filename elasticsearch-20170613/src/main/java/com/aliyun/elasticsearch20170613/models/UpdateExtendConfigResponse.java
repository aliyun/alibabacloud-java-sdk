// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateExtendConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateExtendConfigResponseBody body;

    public static UpdateExtendConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateExtendConfigResponse self = new UpdateExtendConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateExtendConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateExtendConfigResponse setBody(UpdateExtendConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateExtendConfigResponseBody getBody() {
        return this.body;
    }

}
