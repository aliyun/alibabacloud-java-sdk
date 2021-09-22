// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class DeleteDeploymentVersionResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDeploymentVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeploymentVersionResponseBody self = new DeleteDeploymentVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDeploymentVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
