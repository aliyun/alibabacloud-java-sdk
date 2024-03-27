// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDBTopologyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDBTopologyResponseBody body;

    public static GetDBTopologyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDBTopologyResponse self = new GetDBTopologyResponse();
        return TeaModel.build(map, self);
    }

    public GetDBTopologyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDBTopologyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDBTopologyResponse setBody(GetDBTopologyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDBTopologyResponseBody getBody() {
        return this.body;
    }

}
