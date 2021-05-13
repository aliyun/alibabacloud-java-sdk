// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateEipInstanceResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // EIP的ID。
    @NameInMap("AllocationId")
    public String allocationId;

    public static CreateEipInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEipInstanceResponseBody self = new CreateEipInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEipInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateEipInstanceResponseBody setAllocationId(String allocationId) {
        this.allocationId = allocationId;
        return this;
    }
    public String getAllocationId() {
        return this.allocationId;
    }

}
