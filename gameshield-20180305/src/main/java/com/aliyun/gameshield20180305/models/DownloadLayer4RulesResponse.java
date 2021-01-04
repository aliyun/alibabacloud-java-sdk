// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DownloadLayer4RulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DownloadLayer4RulesResponseBody body;

    public static DownloadLayer4RulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadLayer4RulesResponse self = new DownloadLayer4RulesResponse();
        return TeaModel.build(map, self);
    }

    public DownloadLayer4RulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadLayer4RulesResponse setBody(DownloadLayer4RulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadLayer4RulesResponseBody getBody() {
        return this.body;
    }

}
