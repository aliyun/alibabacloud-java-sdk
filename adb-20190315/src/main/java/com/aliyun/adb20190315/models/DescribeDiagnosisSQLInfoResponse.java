// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisSQLInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDiagnosisSQLInfoResponseBody body;

    public static DescribeDiagnosisSQLInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosisSQLInfoResponse self = new DescribeDiagnosisSQLInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosisSQLInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDiagnosisSQLInfoResponse setBody(DescribeDiagnosisSQLInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDiagnosisSQLInfoResponseBody getBody() {
        return this.body;
    }

}
