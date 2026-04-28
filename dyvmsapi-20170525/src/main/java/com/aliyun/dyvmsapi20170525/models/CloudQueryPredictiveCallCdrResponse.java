// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudQueryPredictiveCallCdrResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudQueryPredictiveCallCdrResponseBody body;

    public static CloudQueryPredictiveCallCdrResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudQueryPredictiveCallCdrResponse self = new CloudQueryPredictiveCallCdrResponse();
        return TeaModel.build(map, self);
    }

    public CloudQueryPredictiveCallCdrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudQueryPredictiveCallCdrResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudQueryPredictiveCallCdrResponse setBody(CloudQueryPredictiveCallCdrResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudQueryPredictiveCallCdrResponseBody getBody() {
        return this.body;
    }

}
