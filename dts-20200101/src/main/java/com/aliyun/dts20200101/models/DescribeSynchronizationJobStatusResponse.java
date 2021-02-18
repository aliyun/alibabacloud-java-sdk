// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeSynchronizationJobStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSynchronizationJobStatusResponseBody body;

    public static DescribeSynchronizationJobStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSynchronizationJobStatusResponse self = new DescribeSynchronizationJobStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSynchronizationJobStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSynchronizationJobStatusResponse setBody(DescribeSynchronizationJobStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSynchronizationJobStatusResponseBody getBody() {
        return this.body;
    }

}
