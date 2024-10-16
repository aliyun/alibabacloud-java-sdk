// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class CommonQueryBySceneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryResult body;

    public static CommonQueryBySceneResponse build(java.util.Map<String, ?> map) throws Exception {
        CommonQueryBySceneResponse self = new CommonQueryBySceneResponse();
        return TeaModel.build(map, self);
    }

    public CommonQueryBySceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CommonQueryBySceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CommonQueryBySceneResponse setBody(QueryResult body) {
        this.body = body;
        return this;
    }
    public QueryResult getBody() {
        return this.body;
    }

}
