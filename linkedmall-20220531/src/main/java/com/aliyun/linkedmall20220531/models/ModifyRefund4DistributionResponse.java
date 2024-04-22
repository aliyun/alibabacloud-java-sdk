// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class ModifyRefund4DistributionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyRefund4DistributionResponseBody body;

    public static ModifyRefund4DistributionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRefund4DistributionResponse self = new ModifyRefund4DistributionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRefund4DistributionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRefund4DistributionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyRefund4DistributionResponse setBody(ModifyRefund4DistributionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRefund4DistributionResponseBody getBody() {
        return this.body;
    }

}
