// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class UpdateDeploymentJobStatusResponseBody extends TeaModel {
    /**
     * <p>The response parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("Data")
    public Object data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EA69E364-5CBB-50E8-BF09-E8CAA396A4F8</p>
     */
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
