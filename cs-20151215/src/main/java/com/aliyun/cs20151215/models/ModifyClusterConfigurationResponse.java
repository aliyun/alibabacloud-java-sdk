// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ModifyClusterConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    public static ModifyClusterConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterConfigurationResponse self = new ModifyClusterConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public ModifyClusterConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyClusterConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

}
