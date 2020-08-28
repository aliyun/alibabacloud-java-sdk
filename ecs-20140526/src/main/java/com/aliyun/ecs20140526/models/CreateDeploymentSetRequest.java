// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateDeploymentSetRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("OnUnableToRedeployFailedInstance")
    public String onUnableToRedeployFailedInstance;

    @NameInMap("Description")
    public String description;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DeploymentSetName")
    public String deploymentSetName;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("Granularity")
    public String granularity;

    @NameInMap("Strategy")
    public String strategy;

    @NameInMap("GroupCount")
    public Long groupCount;

    public static CreateDeploymentSetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeploymentSetRequest self = new CreateDeploymentSetRequest();
        return TeaModel.build(map, self);
    }

}
