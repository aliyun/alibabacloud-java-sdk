// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ModifyDrdsIpWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDrdsIpWhiteListResponseBody body;

    public static ModifyDrdsIpWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDrdsIpWhiteListResponse self = new ModifyDrdsIpWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDrdsIpWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDrdsIpWhiteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDrdsIpWhiteListResponse setBody(ModifyDrdsIpWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDrdsIpWhiteListResponseBody getBody() {
        return this.body;
    }

}
