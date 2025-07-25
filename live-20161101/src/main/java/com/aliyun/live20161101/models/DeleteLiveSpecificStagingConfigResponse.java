// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveSpecificStagingConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLiveSpecificStagingConfigResponseBody body;

    public static DeleteLiveSpecificStagingConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveSpecificStagingConfigResponse self = new DeleteLiveSpecificStagingConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveSpecificStagingConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLiveSpecificStagingConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLiveSpecificStagingConfigResponse setBody(DeleteLiveSpecificStagingConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLiveSpecificStagingConfigResponseBody getBody() {
        return this.body;
    }

}
