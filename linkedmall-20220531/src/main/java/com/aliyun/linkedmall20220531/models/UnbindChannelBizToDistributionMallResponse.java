// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class UnbindChannelBizToDistributionMallResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UnbindChannelBizToDistributionMallResponseBody body;

    public static UnbindChannelBizToDistributionMallResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindChannelBizToDistributionMallResponse self = new UnbindChannelBizToDistributionMallResponse();
        return TeaModel.build(map, self);
    }

    public UnbindChannelBizToDistributionMallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindChannelBizToDistributionMallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindChannelBizToDistributionMallResponse setBody(UnbindChannelBizToDistributionMallResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindChannelBizToDistributionMallResponseBody getBody() {
        return this.body;
    }

}
