// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimStandardStatusByIdsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetBimStandardStatusByIdsResponseBody body;

    public static GetBimStandardStatusByIdsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBimStandardStatusByIdsResponse self = new GetBimStandardStatusByIdsResponse();
        return TeaModel.build(map, self);
    }

    public GetBimStandardStatusByIdsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBimStandardStatusByIdsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBimStandardStatusByIdsResponse setBody(GetBimStandardStatusByIdsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBimStandardStatusByIdsResponseBody getBody() {
        return this.body;
    }

}
