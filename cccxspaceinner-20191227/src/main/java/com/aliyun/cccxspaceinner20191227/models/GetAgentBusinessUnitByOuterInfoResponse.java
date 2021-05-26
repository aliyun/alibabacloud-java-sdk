// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class GetAgentBusinessUnitByOuterInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAgentBusinessUnitByOuterInfoResponseBody body;

    public static GetAgentBusinessUnitByOuterInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentBusinessUnitByOuterInfoResponse self = new GetAgentBusinessUnitByOuterInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentBusinessUnitByOuterInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentBusinessUnitByOuterInfoResponse setBody(GetAgentBusinessUnitByOuterInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentBusinessUnitByOuterInfoResponseBody getBody() {
        return this.body;
    }

}
