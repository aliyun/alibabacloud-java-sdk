// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class ConfirmDisburse4DistributionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfirmDisburse4DistributionResponseBody body;

    public static ConfirmDisburse4DistributionResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmDisburse4DistributionResponse self = new ConfirmDisburse4DistributionResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmDisburse4DistributionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmDisburse4DistributionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfirmDisburse4DistributionResponse setBody(ConfirmDisburse4DistributionResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmDisburse4DistributionResponseBody getBody() {
        return this.body;
    }

}
