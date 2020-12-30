// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class PublishStagingConfigToProductionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PublishStagingConfigToProductionResponseBody body;

    public static PublishStagingConfigToProductionResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishStagingConfigToProductionResponse self = new PublishStagingConfigToProductionResponse();
        return TeaModel.build(map, self);
    }

    public PublishStagingConfigToProductionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishStagingConfigToProductionResponse setBody(PublishStagingConfigToProductionResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishStagingConfigToProductionResponseBody getBody() {
        return this.body;
    }

}
