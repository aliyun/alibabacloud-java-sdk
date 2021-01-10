// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainTimeShiftDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeLiveDomainTimeShiftDataResponse setBody(DescribeLiveDomainTimeShiftDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveDomainTimeShiftDataResponseBody getBody() {
        return this.body;
    }

}
