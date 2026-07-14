// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ArchiveChatappTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ArchiveChatappTemplateResponseBody body;

    public static ArchiveChatappTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ArchiveChatappTemplateResponse self = new ArchiveChatappTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ArchiveChatappTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ArchiveChatappTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ArchiveChatappTemplateResponse setBody(ArchiveChatappTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ArchiveChatappTemplateResponseBody getBody() {
        return this.body;
    }

}
