// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ModifyBrowserInstanceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyBrowserInstanceGroupResponseBody body;

    public static ModifyBrowserInstanceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBrowserInstanceGroupResponse self = new ModifyBrowserInstanceGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyBrowserInstanceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyBrowserInstanceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyBrowserInstanceGroupResponse setBody(ModifyBrowserInstanceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyBrowserInstanceGroupResponseBody getBody() {
        return this.body;
    }

}
