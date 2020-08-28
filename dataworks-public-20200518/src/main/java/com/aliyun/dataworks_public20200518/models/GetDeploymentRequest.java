// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDeploymentRequest extends TeaModel {
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    @NameInMap("DeploymentId")
    @Validation(required = true)
    public Long deploymentId;

    public static GetDeploymentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeploymentRequest self = new GetDeploymentRequest();
        return TeaModel.build(map, self);
    }

}
