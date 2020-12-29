// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricConsortiumMemberApprovalResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeFabricConsortiumMemberApprovalResponse setBody(DescribeFabricConsortiumMemberApprovalResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricConsortiumMemberApprovalResponseBody getBody() {
        return this.body;
    }

}
