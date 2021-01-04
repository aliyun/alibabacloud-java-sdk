// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class ModifyElasticBandwidthResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyElasticBandwidthResponseBody body;

    public static ModifyElasticBandwidthResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyElasticBandwidthResponse self = new ModifyElasticBandwidthResponse();
        return TeaModel.build(map, self);
    }

    public ModifyElasticBandwidthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyElasticBandwidthResponse setBody(ModifyElasticBandwidthResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyElasticBandwidthResponseBody getBody() {
        return this.body;
    }

}
