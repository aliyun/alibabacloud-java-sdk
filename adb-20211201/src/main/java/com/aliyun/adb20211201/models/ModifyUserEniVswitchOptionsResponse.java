// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyUserEniVswitchOptionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyUserEniVswitchOptionsResponseBody body;

    public static ModifyUserEniVswitchOptionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserEniVswitchOptionsResponse self = new ModifyUserEniVswitchOptionsResponse();
        return TeaModel.build(map, self);
    }

    public ModifyUserEniVswitchOptionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyUserEniVswitchOptionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyUserEniVswitchOptionsResponse setBody(ModifyUserEniVswitchOptionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyUserEniVswitchOptionsResponseBody getBody() {
        return this.body;
    }

}
