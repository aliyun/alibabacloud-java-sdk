// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DownloadFlexAccRulesFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DownloadFlexAccRulesFileResponseBody body;

    public static DownloadFlexAccRulesFileResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadFlexAccRulesFileResponse self = new DownloadFlexAccRulesFileResponse();
        return TeaModel.build(map, self);
    }

    public DownloadFlexAccRulesFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadFlexAccRulesFileResponse setBody(DownloadFlexAccRulesFileResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadFlexAccRulesFileResponseBody getBody() {
        return this.body;
    }

}
