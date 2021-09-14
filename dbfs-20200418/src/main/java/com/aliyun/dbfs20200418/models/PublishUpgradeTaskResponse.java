// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class PublishUpgradeTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PublishUpgradeTaskResponseBody body;

    public static PublishUpgradeTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishUpgradeTaskResponse self = new PublishUpgradeTaskResponse();
        return TeaModel.build(map, self);
    }

    public PublishUpgradeTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishUpgradeTaskResponse setBody(PublishUpgradeTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishUpgradeTaskResponseBody getBody() {
        return this.body;
    }

}
