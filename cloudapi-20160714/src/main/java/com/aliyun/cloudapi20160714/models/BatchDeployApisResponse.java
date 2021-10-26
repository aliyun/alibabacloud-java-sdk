// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class BatchDeployApisResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchDeployApisResponseBody body;

    public static BatchDeployApisResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDeployApisResponse self = new BatchDeployApisResponse();
        return TeaModel.build(map, self);
    }

    public BatchDeployApisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDeployApisResponse setBody(BatchDeployApisResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeployApisResponseBody getBody() {
        return this.body;
    }

}
