// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetGroupMiscAggTimeSerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetGroupMiscAggTimeSerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGroupMiscAggTimeSerResponse setBody(GetGroupMiscAggTimeSerResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGroupMiscAggTimeSerResponseBody getBody() {
        return this.body;
    }

}
