// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ConvertInstanceResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConvertInstanceResourceGroupResponseBody body;

    public static ConvertInstanceResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ConvertInstanceResourceGroupResponse self = new ConvertInstanceResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public ConvertInstanceResourceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConvertInstanceResourceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConvertInstanceResourceGroupResponse setBody(ConvertInstanceResourceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ConvertInstanceResourceGroupResponseBody getBody() {
        return this.body;
    }

}
