// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UploadFlexRulesFileForParseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UploadFlexRulesFileForParseResponseBody body;

    public static UploadFlexRulesFileForParseResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadFlexRulesFileForParseResponse self = new UploadFlexRulesFileForParseResponse();
        return TeaModel.build(map, self);
    }

    public UploadFlexRulesFileForParseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadFlexRulesFileForParseResponse setBody(UploadFlexRulesFileForParseResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadFlexRulesFileForParseResponseBody getBody() {
        return this.body;
    }

}
