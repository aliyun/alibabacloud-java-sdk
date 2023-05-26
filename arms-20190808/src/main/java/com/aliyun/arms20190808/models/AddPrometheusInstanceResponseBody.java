// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AddPrometheusInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned struct. { "RequestId": the request ID, "Data": "{ "clusterType": the cluster type, "remoteWriteUrl": the public URL for remote write, "internetGrafanaUrl": the internal URL for Grafana, "authToken": indicates whether authentication is enabled, "internetPushGatewayUrl": the internal URL for Pushgateway, "clusterId": the cluster ID, "internetRemoteReadUrl": the internal URL for remote read, "remoteReadUrl": the public URL for remote read, "grafanaUrl": the public URL for Grafana, "pushGatewayUrl": the public URL for Pushgateway, "internetRemoteWriteUrl": the internal URL for remote write}" }</p>
     */
    @NameInMap("Data")
    public String data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static AddPrometheusInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddPrometheusInstanceResponseBody self = new AddPrometheusInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public AddPrometheusInstanceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public AddPrometheusInstanceResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public AddPrometheusInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddPrometheusInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddPrometheusInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
