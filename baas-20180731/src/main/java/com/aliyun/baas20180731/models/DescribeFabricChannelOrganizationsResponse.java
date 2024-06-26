// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeFabricChannelOrganizationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFabricChannelOrganizationsResponseBody body;

    public static DescribeFabricChannelOrganizationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricChannelOrganizationsResponse self = new DescribeFabricChannelOrganizationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFabricChannelOrganizationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFabricChannelOrganizationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFabricChannelOrganizationsResponse setBody(DescribeFabricChannelOrganizationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricChannelOrganizationsResponseBody getBody() {
        return this.body;
    }

}
