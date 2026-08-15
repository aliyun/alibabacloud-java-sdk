// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ModifyInstanceGroupSpecResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyInstanceGroupSpecResponseBody body;

    public static ModifyInstanceGroupSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceGroupSpecResponse self = new ModifyInstanceGroupSpecResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceGroupSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceGroupSpecResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstanceGroupSpecResponse setBody(ModifyInstanceGroupSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceGroupSpecResponseBody getBody() {
        return this.body;
    }

}
