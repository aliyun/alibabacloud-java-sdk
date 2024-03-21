// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchSetDcdnWafDomainConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchSetDcdnWafDomainConfigsResponseBody body;

    public static BatchSetDcdnWafDomainConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchSetDcdnWafDomainConfigsResponse self = new BatchSetDcdnWafDomainConfigsResponse();
        return TeaModel.build(map, self);
    }

    public BatchSetDcdnWafDomainConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchSetDcdnWafDomainConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchSetDcdnWafDomainConfigsResponse setBody(BatchSetDcdnWafDomainConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchSetDcdnWafDomainConfigsResponseBody getBody() {
        return this.body;
    }

}
