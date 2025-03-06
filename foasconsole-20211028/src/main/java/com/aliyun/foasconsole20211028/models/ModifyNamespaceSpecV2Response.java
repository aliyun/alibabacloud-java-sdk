// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class ModifyNamespaceSpecV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyNamespaceSpecV2ResponseBody body;

    public static ModifyNamespaceSpecV2Response build(java.util.Map<String, ?> map) throws Exception {
        ModifyNamespaceSpecV2Response self = new ModifyNamespaceSpecV2Response();
        return TeaModel.build(map, self);
    }

    public ModifyNamespaceSpecV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyNamespaceSpecV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyNamespaceSpecV2Response setBody(ModifyNamespaceSpecV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyNamespaceSpecV2ResponseBody getBody() {
        return this.body;
    }

}
