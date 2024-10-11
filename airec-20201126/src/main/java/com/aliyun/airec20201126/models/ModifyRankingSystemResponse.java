// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ModifyRankingSystemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyRankingSystemResponseBody body;

    public static ModifyRankingSystemResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRankingSystemResponse self = new ModifyRankingSystemResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRankingSystemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRankingSystemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyRankingSystemResponse setBody(ModifyRankingSystemResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRankingSystemResponseBody getBody() {
        return this.body;
    }

}
