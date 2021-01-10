// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainRecordDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveDomainRecordDataResponseBody body;

    public static DescribeLiveDomainRecordDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainRecordDataResponse self = new DescribeLiveDomainRecordDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainRecordDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveDomainRecordDataResponse setBody(DescribeLiveDomainRecordDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveDomainRecordDataResponseBody getBody() {
        return this.body;
    }

}
