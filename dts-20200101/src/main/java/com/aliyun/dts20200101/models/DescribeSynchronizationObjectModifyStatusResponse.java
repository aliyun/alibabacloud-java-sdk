// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeSynchronizationObjectModifyStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeSynchronizationObjectModifyStatusResponse setBody(DescribeSynchronizationObjectModifyStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSynchronizationObjectModifyStatusResponseBody getBody() {
        return this.body;
    }

}
