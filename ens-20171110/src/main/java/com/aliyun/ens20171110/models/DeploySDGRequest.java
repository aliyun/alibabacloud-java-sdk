// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeploySDGRequest extends TeaModel {
    @NameInMap("DeploymentType")
    public String deploymentType;

    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

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
