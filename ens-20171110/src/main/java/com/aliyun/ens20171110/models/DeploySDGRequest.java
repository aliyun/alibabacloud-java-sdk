// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeploySDGRequest extends TeaModel {
    /**
     * <p>The SDG deployment type. Valid values:</p>
     * <ul>
     * <li>common: (default) read/write deployment. Data updates are written to the cloud disk.</li>
     * <li>overlay: read/write splitting deployment. The SDG content is read-only, and data updates are written to the local storage of the instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>common</p>
     */
    @NameInMap("DeploymentType")
    public String deploymentType;

    /**
     * <p>The list of device resource IDs to which the SDG is deployed. Batch deployment is supported, with a maximum of 100 instances per request.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The SDG ID. A cloud disk is created based on this SDG ID and mounted to the specified instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sdg-xxxxx</p>
     */
    @NameInMap("SDGId")
    public String SDGId;

    public static DeploySDGRequest build(java.util.Map<String, ?> map) throws Exception {
        DeploySDGRequest self = new DeploySDGRequest();
        return TeaModel.build(map, self);
    }

    public DeploySDGRequest setDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
        return this;
    }
    public String getDeploymentType() {
        return this.deploymentType;
    }

    public DeploySDGRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public DeploySDGRequest setSDGId(String SDGId) {
        this.SDGId = SDGId;
        return this;
    }
    public String getSDGId() {
        return this.SDGId;
    }

}
