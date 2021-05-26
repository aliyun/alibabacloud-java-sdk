// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class GetAgentBusinessUnitByBuIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAgentBusinessUnitByBuIdResponseBody body;

    public static GetAgentBusinessUnitByBuIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentBusinessUnitByBuIdResponse self = new GetAgentBusinessUnitByBuIdResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentBusinessUnitByBuIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentBusinessUnitByBuIdResponse setBody(GetAgentBusinessUnitByBuIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentBusinessUnitByBuIdResponseBody getBody() {
        return this.body;
    }

}
