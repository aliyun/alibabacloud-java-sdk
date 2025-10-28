// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetAppDeploymentResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The information about the Deployment of the application. The value is a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;metadata&quot;:{&quot;name&quot;:&quot;oambuild-group*&quot;,&quot;namespace&quot;:&quot;default&quot;,&quot;selfLink&quot;:&quot;/apis/apps/v1/namespaces/default/deployments/oambuil*&quot;,&quot;uid&quot;:&quot;<em>-afc0-436e-9949-fb01994a9b63&quot;,&quot;resourceVersion&quot;:&quot;969614832&quot;,&quot;generation&quot;:2,&quot;creationTimestamp&quot;:&quot;2021-04-06T11:38:46Z&quot;,&quot;labels&quot;:{&quot;edas-domain&quot;:&quot;edas-admin&quot;,&quot;edas.aliyun.oam.com/rollout-name&quot;:&quot;oambuild-group-1&quot;,&quot;edas.aliyun.oam.com/rollout-namespace&quot;:&quot;default&quot;,&quot;edas.aliyun.oam.com/rollout-revision&quot;:&quot;3&quot;,&quot;edas.appid&quot;:&quot;fc5e0f54-</em>-4cab-91a0-b7becb1f6174&quot;,&quot;edas.controlplane&quot;:&quot;edas-oam&quot;,&quot;edas.oam.acname&quot;:&quot;oambuild&quot;...</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The message that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>03FD1520-0FD6-436A-<strong><strong>-265318D7</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAppDeploymentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppDeploymentResponseBody self = new GetAppDeploymentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppDeploymentResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetAppDeploymentResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetAppDeploymentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAppDeploymentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
