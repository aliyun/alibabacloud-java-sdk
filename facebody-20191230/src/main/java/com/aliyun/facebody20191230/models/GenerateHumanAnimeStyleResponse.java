// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class GenerateHumanAnimeStyleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateHumanAnimeStyleResponseBody body;

    public static GenerateHumanAnimeStyleResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateHumanAnimeStyleResponse self = new GenerateHumanAnimeStyleResponse();
        return TeaModel.build(map, self);
    }

    public GenerateHumanAnimeStyleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateHumanAnimeStyleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateHumanAnimeStyleResponse setBody(GenerateHumanAnimeStyleResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateHumanAnimeStyleResponseBody getBody() {
        return this.body;
    }

}
