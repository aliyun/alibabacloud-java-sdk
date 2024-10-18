// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDeploymentResponseBody extends TeaModel {
    /**
     * <p>The ID of the process.</p>
     * 
     * <strong>example:</strong>
     * <p>a7ef0634-20ec-4a7c-a214-54020f91XXXX</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7C352CB7-CD88-50CF-9D0D-E81BDF02XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDeploymentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDeploymentResponseBody self = new CreateDeploymentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDeploymentResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateDeploymentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
