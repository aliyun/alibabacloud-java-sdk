// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ModifyAppInstanceGroupChargeTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAppInstanceGroupChargeTypeResponseBody body;

    public static ModifyAppInstanceGroupChargeTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppInstanceGroupChargeTypeResponse self = new ModifyAppInstanceGroupChargeTypeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAppInstanceGroupChargeTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAppInstanceGroupChargeTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAppInstanceGroupChargeTypeResponse setBody(ModifyAppInstanceGroupChargeTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAppInstanceGroupChargeTypeResponseBody getBody() {
        return this.body;
    }

}
