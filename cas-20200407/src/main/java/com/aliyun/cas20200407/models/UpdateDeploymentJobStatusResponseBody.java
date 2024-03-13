// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class UpdateDeploymentJobStatusResponseBody extends TeaModel {
    @NameInMap("Data")
    public Object data;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDeploymentJobStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeploymentJobStatusResponseBody self = new UpdateDeploymentJobStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDeploymentJobStatusResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public UpdateDeploymentJobStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
