// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeReservationDemandCommittedAmountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeReservationDemandCommittedAmountResponseBody body;

    public static DescribeReservationDemandCommittedAmountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeReservationDemandCommittedAmountResponse self = new DescribeReservationDemandCommittedAmountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeReservationDemandCommittedAmountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeReservationDemandCommittedAmountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeReservationDemandCommittedAmountResponse setBody(DescribeReservationDemandCommittedAmountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeReservationDemandCommittedAmountResponseBody getBody() {
        return this.body;
    }

}
