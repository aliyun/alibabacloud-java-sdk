// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainMultiStreamConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveDomainMultiStreamConfigResponseBody body;

    public static DescribeLiveDomainMultiStreamConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainMultiStreamConfigResponse self = new DescribeLiveDomainMultiStreamConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainMultiStreamConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveDomainMultiStreamConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveDomainMultiStreamConfigResponse setBody(DescribeLiveDomainMultiStreamConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveDomainMultiStreamConfigResponseBody getBody() {
        return this.body;
    }

}
