// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetEdgeInstanceDeploymentRequest extends TeaModel {
    /**
     * <p>The ID of the deployment task. You can call the <a href="https://help.aliyun.com/document_detail/135275.html">QueryEdgeInstanceHistoricDeployment</a> operation to query the ID of a deployment task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9261e308a9504fde9b4cf8462b0b****</p>
     */
    @NameInMap("DeploymentId")
    public String deploymentId;

    /**
     * <p>The ID of the edge instance. To obtain the instance ID, perform the following steps: Log on to the <a href="https://iot.console.aliyun.com/le/instance/list">Link IoT Edge console</a>. On the <strong>Edge Instances</strong> page, move the pointer over the name of the edge instance for which you want to query detailed information about a deployment task and obtain the instance ID.</p>
     * <p>You can also call the <a href="https://help.aliyun.com/document_detail/135214.html">QueryEdgeInstance</a> operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PgEfYupSn6Pvhfkx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the Internet of Things (IoT) service instance. This parameter is not required for the public instance but required for Enterprise Edition instances.</p>
     * 
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static GetEdgeInstanceDeploymentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeInstanceDeploymentRequest self = new GetEdgeInstanceDeploymentRequest();
        return TeaModel.build(map, self);
    }

    public GetEdgeInstanceDeploymentRequest setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }
    public String getDeploymentId() {
        return this.deploymentId;
    }

    public GetEdgeInstanceDeploymentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetEdgeInstanceDeploymentRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
