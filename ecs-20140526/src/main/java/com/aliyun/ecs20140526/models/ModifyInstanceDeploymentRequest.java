// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceDeploymentRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    @NameInMap("DeploymentSetId")
    public String deploymentSetId;

    @NameInMap("DeploymentSetGroupNo")
    public Integer deploymentSetGroupNo;

    @NameInMap("Force")
    public Boolean force;

    @NameInMap("Affinity")
    public String affinity;

    @NameInMap("Tenancy")
    public String tenancy;

    @NameInMap("MigrationType")
    public String migrationType;

    @NameInMap("InstanceType")
    public String instanceType;

    public static ModifyInstanceDeploymentRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceDeploymentRequest self = new ModifyInstanceDeploymentRequest();
        return TeaModel.build(map, self);
    }

}
