// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DeleteSpecificStagingConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteSpecificStagingConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSpecificStagingConfigResponse setBody(DeleteSpecificStagingConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSpecificStagingConfigResponseBody getBody() {
        return this.body;
    }

}
