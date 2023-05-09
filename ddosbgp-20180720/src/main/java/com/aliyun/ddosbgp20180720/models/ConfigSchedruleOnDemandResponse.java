// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ConfigSchedruleOnDemandResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ConfigSchedruleOnDemandResponseBody body;

    public static ConfigSchedruleOnDemandResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigSchedruleOnDemandResponse self = new ConfigSchedruleOnDemandResponse();
        return TeaModel.build(map, self);
    }

    public ConfigSchedruleOnDemandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigSchedruleOnDemandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigSchedruleOnDemandResponse setBody(ConfigSchedruleOnDemandResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigSchedruleOnDemandResponseBody getBody() {
        return this.body;
    }

}
