// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CheckFileDeploymentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CheckFileDeploymentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckFileDeploymentResponseBody self = new CheckFileDeploymentResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckFileDeploymentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
