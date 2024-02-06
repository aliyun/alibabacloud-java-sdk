// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class JoinVSwitchesToEpnInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public JoinVSwitchesToEpnInstanceResponseBody body;

    public static JoinVSwitchesToEpnInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        JoinVSwitchesToEpnInstanceResponse self = new JoinVSwitchesToEpnInstanceResponse();
        return TeaModel.build(map, self);
    }

    public JoinVSwitchesToEpnInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public JoinVSwitchesToEpnInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public JoinVSwitchesToEpnInstanceResponse setBody(JoinVSwitchesToEpnInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public JoinVSwitchesToEpnInstanceResponseBody getBody() {
        return this.body;
    }

}
