// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class ModifyDcdnWafGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDcdnWafGroupResponseBody body;

    public static ModifyDcdnWafGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDcdnWafGroupResponse self = new ModifyDcdnWafGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDcdnWafGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDcdnWafGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDcdnWafGroupResponse setBody(ModifyDcdnWafGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDcdnWafGroupResponseBody getBody() {
        return this.body;
    }

}
