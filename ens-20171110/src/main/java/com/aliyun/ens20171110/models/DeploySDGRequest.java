// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeploySDGRequest extends TeaModel {
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
    public java.util.List<String> instanceIds;

    /**
     * <p>The SDG ID. This parameter is used to create a disk, which is attached to an instance.</p>
     * <br>
     * <p>This parameter is required.</p>
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
