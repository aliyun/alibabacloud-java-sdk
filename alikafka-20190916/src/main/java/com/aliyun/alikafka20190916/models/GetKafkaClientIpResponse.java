// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetKafkaClientIpResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetKafkaClientIpResponseBody body;

    public static GetKafkaClientIpResponse build(java.util.Map<String, ?> map) throws Exception {
        GetKafkaClientIpResponse self = new GetKafkaClientIpResponse();
        return TeaModel.build(map, self);
    }

    public GetKafkaClientIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetKafkaClientIpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetKafkaClientIpResponse setBody(GetKafkaClientIpResponseBody body) {
        this.body = body;
        return this;
    }
    public GetKafkaClientIpResponseBody getBody() {
        return this.body;
    }

}
