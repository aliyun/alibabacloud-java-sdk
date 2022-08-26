// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DisableCenVpcFlowStatisticResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DisableCenVpcFlowStatisticResponseBody body;

    public static DisableCenVpcFlowStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableCenVpcFlowStatisticResponse self = new DisableCenVpcFlowStatisticResponse();
        return TeaModel.build(map, self);
    }

    public DisableCenVpcFlowStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableCenVpcFlowStatisticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableCenVpcFlowStatisticResponse setBody(DisableCenVpcFlowStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableCenVpcFlowStatisticResponseBody getBody() {
        return this.body;
    }

}
