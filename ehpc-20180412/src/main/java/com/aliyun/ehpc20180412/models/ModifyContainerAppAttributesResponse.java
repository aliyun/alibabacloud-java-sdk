// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ModifyContainerAppAttributesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyContainerAppAttributesResponseBody body;

    public static ModifyContainerAppAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyContainerAppAttributesResponse self = new ModifyContainerAppAttributesResponse();
        return TeaModel.build(map, self);
    }

    public ModifyContainerAppAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyContainerAppAttributesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyContainerAppAttributesResponse setBody(ModifyContainerAppAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyContainerAppAttributesResponseBody getBody() {
        return this.body;
    }

}
