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

}
