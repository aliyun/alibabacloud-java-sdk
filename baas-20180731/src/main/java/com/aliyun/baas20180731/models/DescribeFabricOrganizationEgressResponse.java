// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeFabricOrganizationEgressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFabricOrganizationEgressResponseBody body;

    public static DescribeFabricOrganizationEgressResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricOrganizationEgressResponse self = new DescribeFabricOrganizationEgressResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFabricOrganizationEgressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFabricOrganizationEgressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFabricOrganizationEgressResponse setBody(DescribeFabricOrganizationEgressResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricOrganizationEgressResponseBody getBody() {
        return this.body;
    }

}
