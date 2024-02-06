// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisSQLInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeDiagnosisSQLInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDiagnosisSQLInfoResponse setBody(DescribeDiagnosisSQLInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDiagnosisSQLInfoResponseBody getBody() {
        return this.body;
    }

}
