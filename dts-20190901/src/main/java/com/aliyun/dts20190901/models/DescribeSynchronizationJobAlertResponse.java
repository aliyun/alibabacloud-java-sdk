// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20190901.models;

import com.aliyun.tea.*;

public class DescribeSynchronizationJobAlertResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSynchronizationJobAlertResponseBody body;

    public static DescribeSynchronizationJobAlertResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSynchronizationJobAlertResponse self = new DescribeSynchronizationJobAlertResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSynchronizationJobAlertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSynchronizationJobAlertResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSynchronizationJobAlertResponse setBody(DescribeSynchronizationJobAlertResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSynchronizationJobAlertResponseBody getBody() {
        return this.body;
    }

}
