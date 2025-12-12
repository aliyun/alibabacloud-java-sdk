// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CancelAppointmentElectZookeeperLeaderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelAppointmentElectZookeeperLeaderResponseBody body;

    public static CancelAppointmentElectZookeeperLeaderResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelAppointmentElectZookeeperLeaderResponse self = new CancelAppointmentElectZookeeperLeaderResponse();
        return TeaModel.build(map, self);
    }

    public CancelAppointmentElectZookeeperLeaderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelAppointmentElectZookeeperLeaderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelAppointmentElectZookeeperLeaderResponse setBody(CancelAppointmentElectZookeeperLeaderResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelAppointmentElectZookeeperLeaderResponseBody getBody() {
        return this.body;
    }

}
