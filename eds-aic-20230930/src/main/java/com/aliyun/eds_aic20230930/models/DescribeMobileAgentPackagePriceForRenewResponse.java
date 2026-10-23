// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeMobileAgentPackagePriceForRenewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMobileAgentPackagePriceForRenewResponseBody body;

    public static DescribeMobileAgentPackagePriceForRenewResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMobileAgentPackagePriceForRenewResponse self = new DescribeMobileAgentPackagePriceForRenewResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMobileAgentPackagePriceForRenewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMobileAgentPackagePriceForRenewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMobileAgentPackagePriceForRenewResponse setBody(DescribeMobileAgentPackagePriceForRenewResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMobileAgentPackagePriceForRenewResponseBody getBody() {
        return this.body;
    }

}
