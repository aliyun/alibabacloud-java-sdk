// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class StopUpgradeTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopUpgradeTaskResponseBody body;

    public static StopUpgradeTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StopUpgradeTaskResponse self = new StopUpgradeTaskResponse();
        return TeaModel.build(map, self);
    }

    public StopUpgradeTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopUpgradeTaskResponse setBody(StopUpgradeTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StopUpgradeTaskResponseBody getBody() {
        return this.body;
    }

}
