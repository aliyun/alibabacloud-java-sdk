// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetTableDBTopologyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTableDBTopologyResponseBody body;

    public static GetTableDBTopologyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTableDBTopologyResponse self = new GetTableDBTopologyResponse();
        return TeaModel.build(map, self);
    }

    public GetTableDBTopologyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTableDBTopologyResponse setBody(GetTableDBTopologyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTableDBTopologyResponseBody getBody() {
        return this.body;
    }

}
