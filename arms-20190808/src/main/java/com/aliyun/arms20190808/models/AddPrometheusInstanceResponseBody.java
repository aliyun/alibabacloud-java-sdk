// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AddPrometheusInstanceResponseBody extends TeaModel {
    /**
     * <p>The struct returned. { "RequestId": the ID of the request. "Data": "{ "clusterType": the type of the cluster. "remoteWriteUrl": the public URL for remote write. "internetGrafanaUrl": the internal URL for Grafana. "authToken": specifies whether to enable the token. "internetPushGatewayUrl": the internal URL for Pushgateway. "ClusterId": the ID of the cluster. "internetRemoteReadUrl": the internal URL for remote read. "remoteReadUrl": the internal URL for remote read. "grafanaUrl": the public URL for Grafana. "pushGatewayUrl": the public URL for Pushgateway. "internetRemoteWriteUrl": the internal network for remote write." }</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddPrometheusInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddPrometheusInstanceResponseBody self = new AddPrometheusInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public AddPrometheusInstanceResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public AddPrometheusInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
