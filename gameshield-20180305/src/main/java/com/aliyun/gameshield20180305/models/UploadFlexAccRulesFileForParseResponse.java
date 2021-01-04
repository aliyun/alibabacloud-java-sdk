// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UploadFlexAccRulesFileForParseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UploadFlexAccRulesFileForParseResponseBody body;

    public static UploadFlexAccRulesFileForParseResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadFlexAccRulesFileForParseResponse self = new UploadFlexAccRulesFileForParseResponse();
        return TeaModel.build(map, self);
    }

    public UploadFlexAccRulesFileForParseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadFlexAccRulesFileForParseResponse setBody(UploadFlexAccRulesFileForParseResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadFlexAccRulesFileForParseResponseBody getBody() {
        return this.body;
    }

}
