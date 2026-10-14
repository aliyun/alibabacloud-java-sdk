// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeploySDGShrinkRequest extends TeaModel {
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
    public String instanceIdsShrink;

    /**
     * <p>The SDG ID. A cloud disk is created based on this SDG ID and mounted to the specified instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sdg-xxxxx</p>
     */
    @NameInMap("SDGId")
    public String SDGId;

    public static DeploySDGShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeploySDGShrinkRequest self = new DeploySDGShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeploySDGShrinkRequest setDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
        return this;
    }
    public String getDeploymentType() {
        return this.deploymentType;
    }

    public DeploySDGShrinkRequest setInstanceIdsShrink(String instanceIdsShrink) {
        this.instanceIdsShrink = instanceIdsShrink;
        return this;
    }
    public String getInstanceIdsShrink() {
        return this.instanceIdsShrink;
    }

    public DeploySDGShrinkRequest setSDGId(String SDGId) {
        this.SDGId = SDGId;
        return this;
    }
    public String getSDGId() {
        return this.SDGId;
    }

}
