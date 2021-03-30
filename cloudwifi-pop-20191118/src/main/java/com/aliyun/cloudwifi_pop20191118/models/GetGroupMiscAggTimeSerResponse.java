// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetGroupMiscAggTimeSerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetGroupMiscAggTimeSerResponseBody body;

    public static GetGroupMiscAggTimeSerResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGroupMiscAggTimeSerResponse self = new GetGroupMiscAggTimeSerResponse();
        return TeaModel.build(map, self);
    }

    public GetGroupMiscAggTimeSerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGroupMiscAggTimeSerResponse setBody(GetGroupMiscAggTimeSerResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGroupMiscAggTimeSerResponseBody getBody() {
        return this.body;
    }

}
