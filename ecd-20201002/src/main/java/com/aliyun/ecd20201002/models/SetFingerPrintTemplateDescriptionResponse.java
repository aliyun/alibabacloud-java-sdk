// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class SetFingerPrintTemplateDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetFingerPrintTemplateDescriptionResponseBody body;

    public static SetFingerPrintTemplateDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        SetFingerPrintTemplateDescriptionResponse self = new SetFingerPrintTemplateDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public SetFingerPrintTemplateDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetFingerPrintTemplateDescriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetFingerPrintTemplateDescriptionResponse setBody(SetFingerPrintTemplateDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public SetFingerPrintTemplateDescriptionResponseBody getBody() {
        return this.body;
    }

}
