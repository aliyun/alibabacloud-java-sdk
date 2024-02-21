// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class SetInstanceModeOnDemandResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetInstanceModeOnDemandResponseBody body;

    public static SetInstanceModeOnDemandResponse build(java.util.Map<String, ?> map) throws Exception {
        SetInstanceModeOnDemandResponse self = new SetInstanceModeOnDemandResponse();
        return TeaModel.build(map, self);
    }

    public SetInstanceModeOnDemandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetInstanceModeOnDemandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetInstanceModeOnDemandResponse setBody(SetInstanceModeOnDemandResponseBody body) {
        this.body = body;
        return this;
    }
    public SetInstanceModeOnDemandResponseBody getBody() {
        return this.body;
    }

}
