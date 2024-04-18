// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifyMultiZoneClusterNodeTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyMultiZoneClusterNodeTypeResponseBody body;

    public static ModifyMultiZoneClusterNodeTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyMultiZoneClusterNodeTypeResponse self = new ModifyMultiZoneClusterNodeTypeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyMultiZoneClusterNodeTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyMultiZoneClusterNodeTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyMultiZoneClusterNodeTypeResponse setBody(ModifyMultiZoneClusterNodeTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyMultiZoneClusterNodeTypeResponseBody getBody() {
        return this.body;
    }

}
