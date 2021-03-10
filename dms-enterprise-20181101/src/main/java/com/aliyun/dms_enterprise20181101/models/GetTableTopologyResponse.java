// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetTableTopologyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTableTopologyResponseBody body;

    public static GetTableTopologyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTableTopologyResponse self = new GetTableTopologyResponse();
        return TeaModel.build(map, self);
    }

    public GetTableTopologyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTableTopologyResponse setBody(GetTableTopologyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTableTopologyResponseBody getBody() {
        return this.body;
    }

}
