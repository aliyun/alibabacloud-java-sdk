// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteDeploymentSetResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteDeploymentSetResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeploymentSetResponse self = new DeleteDeploymentSetResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDeploymentSetResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
