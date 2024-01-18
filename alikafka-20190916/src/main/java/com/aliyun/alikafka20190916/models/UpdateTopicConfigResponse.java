// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class UpdateTopicConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateTopicConfigResponseBody body;

    public static UpdateTopicConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTopicConfigResponse self = new UpdateTopicConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTopicConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTopicConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTopicConfigResponse setBody(UpdateTopicConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTopicConfigResponseBody getBody() {
        return this.body;
    }

}
