// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmInstanceSystemCnameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDnsGtmInstanceSystemCnameResponseBody body;

    public static DescribeDnsGtmInstanceSystemCnameResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmInstanceSystemCnameResponse self = new DescribeDnsGtmInstanceSystemCnameResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmInstanceSystemCnameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDnsGtmInstanceSystemCnameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDnsGtmInstanceSystemCnameResponse setBody(DescribeDnsGtmInstanceSystemCnameResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDnsGtmInstanceSystemCnameResponseBody getBody() {
        return this.body;
    }

}
