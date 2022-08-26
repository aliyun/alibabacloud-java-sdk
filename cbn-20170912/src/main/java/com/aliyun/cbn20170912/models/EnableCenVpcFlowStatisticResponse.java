// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class EnableCenVpcFlowStatisticResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EnableCenVpcFlowStatisticResponseBody body;

    public static EnableCenVpcFlowStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableCenVpcFlowStatisticResponse self = new EnableCenVpcFlowStatisticResponse();
        return TeaModel.build(map, self);
    }

    public EnableCenVpcFlowStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableCenVpcFlowStatisticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableCenVpcFlowStatisticResponse setBody(EnableCenVpcFlowStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableCenVpcFlowStatisticResponseBody getBody() {
        return this.body;
    }

}
