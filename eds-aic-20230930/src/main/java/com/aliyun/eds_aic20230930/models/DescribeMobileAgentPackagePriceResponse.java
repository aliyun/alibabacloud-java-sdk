// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeMobileAgentPackagePriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMobileAgentPackagePriceResponseBody body;

    public static DescribeMobileAgentPackagePriceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMobileAgentPackagePriceResponse self = new DescribeMobileAgentPackagePriceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMobileAgentPackagePriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMobileAgentPackagePriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMobileAgentPackagePriceResponse setBody(DescribeMobileAgentPackagePriceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMobileAgentPackagePriceResponseBody getBody() {
        return this.body;
    }

}
