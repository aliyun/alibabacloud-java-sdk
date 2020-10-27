// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteDeploymentSetRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DeploymentSetId")
    @Validation(required = true)
    public String deploymentSetId;

    public static DeleteDeploymentSetRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeploymentSetRequest self = new DeleteDeploymentSetRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDeploymentSetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteDeploymentSetRequest setDeploymentSetId(String deploymentSetId) {
        this.deploymentSetId = deploymentSetId;
        return this;
    }
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

}
