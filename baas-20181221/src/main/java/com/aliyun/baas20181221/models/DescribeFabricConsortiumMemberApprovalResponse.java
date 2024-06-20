// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricConsortiumMemberApprovalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFabricConsortiumMemberApprovalResponseBody body;

    public static DescribeFabricConsortiumMemberApprovalResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricConsortiumMemberApprovalResponse self = new DescribeFabricConsortiumMemberApprovalResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFabricConsortiumMemberApprovalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFabricConsortiumMemberApprovalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFabricConsortiumMemberApprovalResponse setBody(DescribeFabricConsortiumMemberApprovalResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricConsortiumMemberApprovalResponseBody getBody() {
        return this.body;
    }

}
