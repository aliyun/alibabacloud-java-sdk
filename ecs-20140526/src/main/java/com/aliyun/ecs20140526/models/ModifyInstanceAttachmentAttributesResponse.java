// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceAttachmentAttributesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyInstanceAttachmentAttributesResponseBody body;

    public static ModifyInstanceAttachmentAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAttachmentAttributesResponse self = new ModifyInstanceAttachmentAttributesResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceAttachmentAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceAttachmentAttributesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstanceAttachmentAttributesResponse setBody(ModifyInstanceAttachmentAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceAttachmentAttributesResponseBody getBody() {
        return this.body;
    }

}
