// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeSynchronizationJobReplicatorCompareResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSynchronizationJobReplicatorCompareResponseBody body;

    public static DescribeSynchronizationJobReplicatorCompareResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSynchronizationJobReplicatorCompareResponse self = new DescribeSynchronizationJobReplicatorCompareResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSynchronizationJobReplicatorCompareResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSynchronizationJobReplicatorCompareResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSynchronizationJobReplicatorCompareResponse setBody(DescribeSynchronizationJobReplicatorCompareResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSynchronizationJobReplicatorCompareResponseBody getBody() {
        return this.body;
    }

}
