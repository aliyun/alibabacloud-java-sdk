// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DeleteSpecificStagingConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSpecificStagingConfigResponseBody body;

    public static DeleteSpecificStagingConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSpecificStagingConfigResponse self = new DeleteSpecificStagingConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSpecificStagingConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSpecificStagingConfigResponse setBody(DeleteSpecificStagingConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSpecificStagingConfigResponseBody getBody() {
        return this.body;
    }

}
