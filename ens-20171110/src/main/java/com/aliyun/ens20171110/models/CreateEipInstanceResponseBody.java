// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateEipInstanceResponseBody extends TeaModel {
    /**
     * <p>The ID of the EIP.</p>
     * 
     * <strong>example:</strong>
     * <p>eip-25877c70gddh****</p>
     */
    @NameInMap("AllocationId")
    public String allocationId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9DB6123F-470D-510A-A9EB-EBA799340452</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateEipInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEipInstanceResponseBody self = new CreateEipInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEipInstanceResponseBody setAllocationId(String allocationId) {
        this.allocationId = allocationId;
        return this;
    }
    public String getAllocationId() {
        return this.allocationId;
    }

    public CreateEipInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
