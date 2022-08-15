// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class BindChannelBizToDistributionMallResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BindChannelBizToDistributionMallResponseBody body;

    public static BindChannelBizToDistributionMallResponse build(java.util.Map<String, ?> map) throws Exception {
        BindChannelBizToDistributionMallResponse self = new BindChannelBizToDistributionMallResponse();
        return TeaModel.build(map, self);
    }

    public BindChannelBizToDistributionMallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindChannelBizToDistributionMallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindChannelBizToDistributionMallResponse setBody(BindChannelBizToDistributionMallResponseBody body) {
        this.body = body;
        return this;
    }
    public BindChannelBizToDistributionMallResponseBody getBody() {
        return this.body;
    }

}
