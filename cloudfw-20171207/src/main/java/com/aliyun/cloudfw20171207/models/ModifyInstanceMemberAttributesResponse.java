// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyInstanceMemberAttributesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyInstanceMemberAttributesResponseBody body;

    public static ModifyInstanceMemberAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceMemberAttributesResponse self = new ModifyInstanceMemberAttributesResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceMemberAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceMemberAttributesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstanceMemberAttributesResponse setBody(ModifyInstanceMemberAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceMemberAttributesResponseBody getBody() {
        return this.body;
    }

}
