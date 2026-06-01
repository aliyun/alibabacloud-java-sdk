// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeMobileAgentPackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMobileAgentPackageResponseBody body;

    public static DescribeMobileAgentPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMobileAgentPackageResponse self = new DescribeMobileAgentPackageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMobileAgentPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMobileAgentPackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMobileAgentPackageResponse setBody(DescribeMobileAgentPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMobileAgentPackageResponseBody getBody() {
        return this.body;
    }

}
