// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateDeploymentSetResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DeploymentSetId")
    @Validation(required = true)
    public String deploymentSetId;

    public static CreateDeploymentSetResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDeploymentSetResponse self = new CreateDeploymentSetResponse();
        return TeaModel.build(map, self);
    }

}
