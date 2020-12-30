// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifyMultiZoneClusterNodeTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyMultiZoneClusterNodeTypeResponse setBody(ModifyMultiZoneClusterNodeTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyMultiZoneClusterNodeTypeResponseBody getBody() {
        return this.body;
    }

}
