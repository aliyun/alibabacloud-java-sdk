// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class GenerateHumanAnimeStyleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GenerateHumanAnimeStyleResponse setBody(GenerateHumanAnimeStyleResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateHumanAnimeStyleResponseBody getBody() {
        return this.body;
    }

}
