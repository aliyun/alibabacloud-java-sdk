// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class PublishLiveStagingConfigToProductionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PublishLiveStagingConfigToProductionResponseBody body;

    public static PublishLiveStagingConfigToProductionResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishLiveStagingConfigToProductionResponse self = new PublishLiveStagingConfigToProductionResponse();
        return TeaModel.build(map, self);
    }

    public PublishLiveStagingConfigToProductionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishLiveStagingConfigToProductionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishLiveStagingConfigToProductionResponse setBody(PublishLiveStagingConfigToProductionResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishLiveStagingConfigToProductionResponseBody getBody() {
        return this.body;
    }

}
