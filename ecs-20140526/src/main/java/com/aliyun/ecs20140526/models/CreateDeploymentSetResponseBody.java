// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateDeploymentSetResponseBody extends TeaModel {
    @NameInMap("DeploymentSetId")
    public String deploymentSetId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateDeploymentSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDeploymentSetResponseBody self = new CreateDeploymentSetResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDeploymentSetResponseBody setDeploymentSetId(String deploymentSetId) {
        this.deploymentSetId = deploymentSetId;
        return this;
    }
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    public CreateDeploymentSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
