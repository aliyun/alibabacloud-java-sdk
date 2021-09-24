// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CheckFileDeploymentResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CheckFileDeploymentResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckFileDeploymentResponse self = new CheckFileDeploymentResponse();
        return TeaModel.build(map, self);
    }

    public CheckFileDeploymentResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
