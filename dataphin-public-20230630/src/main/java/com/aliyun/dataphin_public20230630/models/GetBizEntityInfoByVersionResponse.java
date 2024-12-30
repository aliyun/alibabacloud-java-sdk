// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetBizEntityInfoByVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBizEntityInfoByVersionResponseBody body;

    public static GetBizEntityInfoByVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBizEntityInfoByVersionResponse self = new GetBizEntityInfoByVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetBizEntityInfoByVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBizEntityInfoByVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBizEntityInfoByVersionResponse setBody(GetBizEntityInfoByVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBizEntityInfoByVersionResponseBody getBody() {
        return this.body;
    }

}
