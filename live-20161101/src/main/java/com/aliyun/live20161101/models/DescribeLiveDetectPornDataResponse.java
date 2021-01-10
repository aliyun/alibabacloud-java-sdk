// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDetectPornDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveDetectPornDataResponseBody body;

    public static DescribeLiveDetectPornDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDetectPornDataResponse self = new DescribeLiveDetectPornDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDetectPornDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveDetectPornDataResponse setBody(DescribeLiveDetectPornDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveDetectPornDataResponseBody getBody() {
        return this.body;
    }

}
