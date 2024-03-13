// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class UpdateDeploymentJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDeploymentJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeploymentJobResponseBody self = new UpdateDeploymentJobResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDeploymentJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
