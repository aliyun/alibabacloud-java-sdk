// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainRecordUsageDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveDomainRecordUsageDataResponseBody body;

    public static DescribeLiveDomainRecordUsageDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainRecordUsageDataResponse self = new DescribeLiveDomainRecordUsageDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainRecordUsageDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveDomainRecordUsageDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveDomainRecordUsageDataResponse setBody(DescribeLiveDomainRecordUsageDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveDomainRecordUsageDataResponseBody getBody() {
        return this.body;
    }

}
