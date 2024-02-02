// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ModifyAudioFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAudioFileResponseBody body;

    public static ModifyAudioFileResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAudioFileResponse self = new ModifyAudioFileResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAudioFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAudioFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAudioFileResponse setBody(ModifyAudioFileResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAudioFileResponseBody getBody() {
        return this.body;
    }

}
