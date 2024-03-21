// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class PublishDcdnStagingConfigToProductionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PublishDcdnStagingConfigToProductionResponseBody body;

    public static PublishDcdnStagingConfigToProductionResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishDcdnStagingConfigToProductionResponse self = new PublishDcdnStagingConfigToProductionResponse();
        return TeaModel.build(map, self);
    }

    public PublishDcdnStagingConfigToProductionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishDcdnStagingConfigToProductionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishDcdnStagingConfigToProductionResponse setBody(PublishDcdnStagingConfigToProductionResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishDcdnStagingConfigToProductionResponseBody getBody() {
        return this.body;
    }

}
