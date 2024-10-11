// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DeployRankingSystemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeployRankingSystemResponseBody body;

    public static DeployRankingSystemResponse build(java.util.Map<String, ?> map) throws Exception {
        DeployRankingSystemResponse self = new DeployRankingSystemResponse();
        return TeaModel.build(map, self);
    }

    public DeployRankingSystemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeployRankingSystemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeployRankingSystemResponse setBody(DeployRankingSystemResponseBody body) {
        this.body = body;
        return this;
    }
    public DeployRankingSystemResponseBody getBody() {
        return this.body;
    }

}
