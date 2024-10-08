// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DeleteDeploymentJobResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDeploymentJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeploymentJobResponseBody self = new DeleteDeploymentJobResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDeploymentJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
