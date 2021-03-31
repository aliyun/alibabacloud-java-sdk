// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteDeploymentSetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDeploymentSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeploymentSetResponseBody self = new DeleteDeploymentSetResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDeploymentSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
