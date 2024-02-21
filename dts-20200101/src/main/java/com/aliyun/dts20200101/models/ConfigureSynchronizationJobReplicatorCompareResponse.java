// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ConfigureSynchronizationJobReplicatorCompareResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigureSynchronizationJobReplicatorCompareResponseBody body;

    public static ConfigureSynchronizationJobReplicatorCompareResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigureSynchronizationJobReplicatorCompareResponse self = new ConfigureSynchronizationJobReplicatorCompareResponse();
        return TeaModel.build(map, self);
    }

    public ConfigureSynchronizationJobReplicatorCompareResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigureSynchronizationJobReplicatorCompareResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigureSynchronizationJobReplicatorCompareResponse setBody(ConfigureSynchronizationJobReplicatorCompareResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigureSynchronizationJobReplicatorCompareResponseBody getBody() {
        return this.body;
    }

}
