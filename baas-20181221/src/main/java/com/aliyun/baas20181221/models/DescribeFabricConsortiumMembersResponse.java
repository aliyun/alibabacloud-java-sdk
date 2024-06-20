// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricConsortiumMembersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFabricConsortiumMembersResponseBody body;

    public static DescribeFabricConsortiumMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricConsortiumMembersResponse self = new DescribeFabricConsortiumMembersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFabricConsortiumMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFabricConsortiumMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFabricConsortiumMembersResponse setBody(DescribeFabricConsortiumMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricConsortiumMembersResponseBody getBody() {
        return this.body;
    }

}
