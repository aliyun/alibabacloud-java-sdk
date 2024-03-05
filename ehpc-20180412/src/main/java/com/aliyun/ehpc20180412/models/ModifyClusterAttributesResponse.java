// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ModifyClusterAttributesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyClusterAttributesResponseBody body;

    public static ModifyClusterAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterAttributesResponse self = new ModifyClusterAttributesResponse();
        return TeaModel.build(map, self);
    }

    public ModifyClusterAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyClusterAttributesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyClusterAttributesResponse setBody(ModifyClusterAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyClusterAttributesResponseBody getBody() {
        return this.body;
    }

}
