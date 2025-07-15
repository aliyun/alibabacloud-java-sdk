// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyLiveMessageGroupBandResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyLiveMessageGroupBandResponseBody body;

    public static ModifyLiveMessageGroupBandResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyLiveMessageGroupBandResponse self = new ModifyLiveMessageGroupBandResponse();
        return TeaModel.build(map, self);
    }

    public ModifyLiveMessageGroupBandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyLiveMessageGroupBandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyLiveMessageGroupBandResponse setBody(ModifyLiveMessageGroupBandResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyLiveMessageGroupBandResponseBody getBody() {
        return this.body;
    }

}
