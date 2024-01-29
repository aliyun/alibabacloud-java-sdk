// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainRecordInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainRecordInfoResponseBody body;

    public static DescribeDomainRecordInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRecordInfoResponse self = new DescribeDomainRecordInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainRecordInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainRecordInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainRecordInfoResponse setBody(DescribeDomainRecordInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainRecordInfoResponseBody getBody() {
        return this.body;
    }

}
