// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricChannelMembersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFabricChannelMembersResponseBody body;

    public static DescribeFabricChannelMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricChannelMembersResponse self = new DescribeFabricChannelMembersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFabricChannelMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFabricChannelMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFabricChannelMembersResponse setBody(DescribeFabricChannelMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricChannelMembersResponseBody getBody() {
        return this.body;
    }

}
