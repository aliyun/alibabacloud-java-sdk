// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UploadL4RulesFileForParseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UploadL4RulesFileForParseResponseBody body;

    public static UploadL4RulesFileForParseResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadL4RulesFileForParseResponse self = new UploadL4RulesFileForParseResponse();
        return TeaModel.build(map, self);
    }

    public UploadL4RulesFileForParseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadL4RulesFileForParseResponse setBody(UploadL4RulesFileForParseResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadL4RulesFileForParseResponseBody getBody() {
        return this.body;
    }

}
