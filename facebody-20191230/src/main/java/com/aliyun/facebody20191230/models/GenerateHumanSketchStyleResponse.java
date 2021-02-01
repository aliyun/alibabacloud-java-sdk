// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class GenerateHumanSketchStyleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateHumanSketchStyleResponseBody body;

    public static GenerateHumanSketchStyleResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateHumanSketchStyleResponse self = new GenerateHumanSketchStyleResponse();
        return TeaModel.build(map, self);
    }

    public GenerateHumanSketchStyleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateHumanSketchStyleResponse setBody(GenerateHumanSketchStyleResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateHumanSketchStyleResponseBody getBody() {
        return this.body;
    }

}
