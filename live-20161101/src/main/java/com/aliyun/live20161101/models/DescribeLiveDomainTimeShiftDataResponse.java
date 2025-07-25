// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainTimeShiftDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveDomainTimeShiftDataResponseBody body;

    public static DescribeLiveDomainTimeShiftDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainTimeShiftDataResponse self = new DescribeLiveDomainTimeShiftDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainTimeShiftDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveDomainTimeShiftDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveDomainTimeShiftDataResponse setBody(DescribeLiveDomainTimeShiftDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveDomainTimeShiftDataResponseBody getBody() {
        return this.body;
    }

}
