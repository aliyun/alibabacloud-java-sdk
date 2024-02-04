// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyDBClusterConfigInXMLResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBClusterConfigInXMLResponseBody body;

    public static ModifyDBClusterConfigInXMLResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterConfigInXMLResponse self = new ModifyDBClusterConfigInXMLResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterConfigInXMLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBClusterConfigInXMLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBClusterConfigInXMLResponse setBody(ModifyDBClusterConfigInXMLResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBClusterConfigInXMLResponseBody getBody() {
        return this.body;
    }

}
