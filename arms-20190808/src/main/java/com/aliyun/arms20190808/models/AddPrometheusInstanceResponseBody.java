// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AddPrometheusInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned struct. { &quot;RequestId&quot;: the request ID, &quot;Data&quot;: &quot;{ &quot;clusterType&quot;: the cluster type, &quot;remoteWriteUrl&quot;: the public URL for remote write, &quot;internetGrafanaUrl&quot;: the internal URL for Grafana, &quot;authToken&quot;: indicates whether authentication is enabled, &quot;internetPushGatewayUrl&quot;: the internal URL for Pushgateway, &quot;clusterId&quot;: the cluster ID, &quot;internetRemoteReadUrl&quot;: the internal URL for remote read, &quot;remoteReadUrl&quot;: the public URL for remote read, &quot;grafanaUrl&quot;: the public URL for Grafana, &quot;pushGatewayUrl&quot;: the public URL for Pushgateway, &quot;internetRemoteWriteUrl&quot;: the internal URL for remote write}&quot; }</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;RequestId&quot;: &quot;1293091C-54AD-50FE-B787-E314B94B35AB&quot;,
     *   &quot;Data&quot;: &quot;{
     *   &quot;clusterType&quot;:&quot;remote-write-prometheus&quot;,
     *   &quot;remoteWriteUrl&quot;:&quot;<a href="http://cn-hu/api/v3/write">http://cn-hu/api/v3/write</a>&quot;,
     *   &quot;internetGrafanaUrl&quot;:&quot;<a href="https://cn-hanga/cn-hangzhou">https://cn-hanga/cn-hangzhou</a>&quot;,
     *   &quot;authToken&quot;:false,
     *   &quot;internetPushGatewayUrl&quot;:&quot;<a href="https://cangzhou/api/v2">https://cangzhou/api/v2</a>&quot;,
     *   &quot;clusterId&quot;:&quot;vrju1lj3sa|123456&quot;,
     *   &quot;internetRemoteReadUrl&quot;:&quot;<a href="https://cn-hangzh67cn-hangzhou/api/v1/read">https://cn-hangzh67cn-hangzhou/api/v1/read</a>&quot;,
     *   &quot;remoteReadUrl&quot;:&quot;<a href="http://cn-hanou/api/v1/read">http://cn-hanou/api/v1/read</a>&quot;,
     *   &quot;grafanaUrl&quot;:&quot;<a href="http://cn-angzhou">http://cn-angzhou</a>&quot;,
     *   &quot;pushGatewayUrl&quot;:&quot;htt1lj3sa/cn-hangzhou/api/v2&quot;,
     *   &quot;internetRemoteWriteUrl&quot;:&quot;httpsngzhou/api/v3/write&quot;}&quot;
     * }</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9319A57D-2D9E-472A-B69B-CF3CD16D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
