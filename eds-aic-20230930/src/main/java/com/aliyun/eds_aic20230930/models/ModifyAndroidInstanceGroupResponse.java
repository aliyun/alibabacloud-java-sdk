// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ModifyAndroidInstanceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAndroidInstanceGroupResponseBody body;

    public static ModifyAndroidInstanceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAndroidInstanceGroupResponse self = new ModifyAndroidInstanceGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAndroidInstanceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAndroidInstanceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAndroidInstanceGroupResponse setBody(ModifyAndroidInstanceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAndroidInstanceGroupResponseBody getBody() {
        return this.body;
    }

}
