// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricOrganizationChannelsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeFabricOrganizationChannelsResponse setBody(DescribeFabricOrganizationChannelsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricOrganizationChannelsResponseBody getBody() {
        return this.body;
    }

}
