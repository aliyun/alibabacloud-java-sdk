// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeployInstanceSDGShrinkRequest extends TeaModel {
    /**
     * <p>The deployment type of the SDG. shared: shared read/write splitting deployment. The content of the SDG is read-only, and data updates are written to the local storage of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>shared</p>
     */
    @NameInMap("DeploymentType")
    public String deploymentType;

    /**
     * <p>The IDs of the instances. The value is a JSON array that consists of up to 100 IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIdsShrink;

    /**
     * <p>The ID of the SDG.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sdg-xxxx</p>
     */
    @NameInMap("SDGId")
    public String SDGId;

    public static DeployInstanceSDGShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployInstanceSDGShrinkRequest self = new DeployInstanceSDGShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeployInstanceSDGShrinkRequest setDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
        return this;
    }
    public String getDeploymentType() {
        return this.deploymentType;
    }

    public DeployInstanceSDGShrinkRequest setInstanceIdsShrink(String instanceIdsShrink) {
        this.instanceIdsShrink = instanceIdsShrink;
        return this;
    }
    public String getInstanceIdsShrink() {
        return this.instanceIdsShrink;
    }

    public DeployInstanceSDGShrinkRequest setSDGId(String SDGId) {
        this.SDGId = SDGId;
        return this;
    }
    public String getSDGId() {
        return this.SDGId;
    }

}
