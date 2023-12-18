// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeploySDGShrinkRequest extends TeaModel {
    @NameInMap("DeploymentType")
    public String deploymentType;

    @NameInMap("InstanceIds")
    public String instanceIdsShrink;

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
