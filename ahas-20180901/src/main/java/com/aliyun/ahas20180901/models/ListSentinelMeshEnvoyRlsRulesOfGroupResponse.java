// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListSentinelMeshEnvoyRlsRulesOfGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListSentinelMeshEnvoyRlsRulesOfGroupResponseBody body;

    public static ListSentinelMeshEnvoyRlsRulesOfGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSentinelMeshEnvoyRlsRulesOfGroupResponse self = new ListSentinelMeshEnvoyRlsRulesOfGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListSentinelMeshEnvoyRlsRulesOfGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSentinelMeshEnvoyRlsRulesOfGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSentinelMeshEnvoyRlsRulesOfGroupResponse setBody(ListSentinelMeshEnvoyRlsRulesOfGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSentinelMeshEnvoyRlsRulesOfGroupResponseBody getBody() {
        return this.body;
    }

}
