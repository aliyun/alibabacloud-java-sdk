// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeploySDGShrinkRequest extends TeaModel {
    /**
     * <p>The SDG deployment type. Valid values:</p>
     * <br>
     * <p>*   common (default): read/write deployment. Data updates are written to disks.</p>
     * <p>*   overlay: read/write splitting deployment. Content in SDGs is read-only. Data updates are written to the local storage of the instance.</p>
     */
    @NameInMap("DeploymentType")
    public String deploymentType;

    /**
     * <p>The IDs of instances on which you want to deploy SDGs. You can deploy SDGs on a maximum of 100 instances at a time.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIdsShrink;

    /**
     * <p>The SDG ID. This parameter is used to create a disk, which is attached to an instance.</p>
     * <br>
     * <p>This parameter is required.</p>
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
