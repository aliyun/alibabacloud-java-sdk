// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisDimensionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDiagnosisDimensionsResponseBody body;

    public static DescribeDiagnosisDimensionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosisDimensionsResponse self = new DescribeDiagnosisDimensionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosisDimensionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDiagnosisDimensionsResponse setBody(DescribeDiagnosisDimensionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDiagnosisDimensionsResponseBody getBody() {
        return this.body;
    }

}
