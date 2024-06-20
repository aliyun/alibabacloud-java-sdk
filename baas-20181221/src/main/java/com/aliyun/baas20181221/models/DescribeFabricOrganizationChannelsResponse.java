// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricOrganizationChannelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFabricOrganizationChannelsResponseBody body;

    public static DescribeFabricOrganizationChannelsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricOrganizationChannelsResponse self = new DescribeFabricOrganizationChannelsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFabricOrganizationChannelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFabricOrganizationChannelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFabricOrganizationChannelsResponse setBody(DescribeFabricOrganizationChannelsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricOrganizationChannelsResponseBody getBody() {
        return this.body;
    }

}
