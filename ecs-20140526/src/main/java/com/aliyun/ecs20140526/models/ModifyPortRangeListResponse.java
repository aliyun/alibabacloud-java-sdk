// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyPortRangeListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyPortRangeListResponseBody body;

    public static ModifyPortRangeListResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPortRangeListResponse self = new ModifyPortRangeListResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPortRangeListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPortRangeListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyPortRangeListResponse setBody(ModifyPortRangeListResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPortRangeListResponseBody getBody() {
        return this.body;
    }

}
