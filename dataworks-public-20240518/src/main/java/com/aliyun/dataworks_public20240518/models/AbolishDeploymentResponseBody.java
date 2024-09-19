// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class AbolishDeploymentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>55D786C9-DD57-524D-884C-C5239278XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AbolishDeploymentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AbolishDeploymentResponseBody self = new AbolishDeploymentResponseBody();
        return TeaModel.build(map, self);
    }

    public AbolishDeploymentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AbolishDeploymentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
