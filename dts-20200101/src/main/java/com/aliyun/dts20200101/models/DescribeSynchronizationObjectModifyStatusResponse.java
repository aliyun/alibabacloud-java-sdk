// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeSynchronizationObjectModifyStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSynchronizationObjectModifyStatusResponseBody body;

    public static DescribeSynchronizationObjectModifyStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSynchronizationObjectModifyStatusResponse self = new DescribeSynchronizationObjectModifyStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSynchronizationObjectModifyStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSynchronizationObjectModifyStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSynchronizationObjectModifyStatusResponse setBody(DescribeSynchronizationObjectModifyStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSynchronizationObjectModifyStatusResponseBody getBody() {
        return this.body;
    }

}
