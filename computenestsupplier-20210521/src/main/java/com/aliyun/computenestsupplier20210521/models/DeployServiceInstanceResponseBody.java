// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class DeployServiceInstanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B8A6AEA6-0D8F-589A-A7FF-B44FD842456E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeployServiceInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeployServiceInstanceResponseBody self = new DeployServiceInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeployServiceInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
