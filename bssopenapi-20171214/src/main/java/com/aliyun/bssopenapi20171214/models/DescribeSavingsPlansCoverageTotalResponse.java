// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeSavingsPlansCoverageTotalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSavingsPlansCoverageTotalResponseBody body;

    public static DescribeSavingsPlansCoverageTotalResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSavingsPlansCoverageTotalResponse self = new DescribeSavingsPlansCoverageTotalResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSavingsPlansCoverageTotalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSavingsPlansCoverageTotalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSavingsPlansCoverageTotalResponse setBody(DescribeSavingsPlansCoverageTotalResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSavingsPlansCoverageTotalResponseBody getBody() {
        return this.body;
    }

}
