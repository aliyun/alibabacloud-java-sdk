// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class ClearAgentGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ClearAgentGroupsResponseBody body;

    public static ClearAgentGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ClearAgentGroupsResponse self = new ClearAgentGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ClearAgentGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClearAgentGroupsResponse setBody(ClearAgentGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ClearAgentGroupsResponseBody getBody() {
        return this.body;
    }

}
