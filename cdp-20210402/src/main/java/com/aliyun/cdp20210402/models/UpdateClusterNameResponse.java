// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class UpdateClusterNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateClusterNameResponseBody body;

    public static UpdateClusterNameResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterNameResponse self = new UpdateClusterNameResponse();
        return TeaModel.build(map, self);
    }

    public UpdateClusterNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateClusterNameResponse setBody(UpdateClusterNameResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateClusterNameResponseBody getBody() {
        return this.body;
    }

}
