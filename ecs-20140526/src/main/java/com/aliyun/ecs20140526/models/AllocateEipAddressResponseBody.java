// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AllocateEipAddressResponseBody extends TeaModel {
    /**
     * <p>The unique ID of the allocation.</p>
     */
    @NameInMap("AllocationId")
    public String allocationId;

    /**
     * <p>The allocated elastic IP address.</p>
     */
    @NameInMap("EipAddress")
    public String eipAddress;

    /**
     * <p>The unique ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AllocateEipAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllocateEipAddressResponseBody self = new AllocateEipAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public AllocateEipAddressResponseBody setAllocationId(String allocationId) {
        this.allocationId = allocationId;
        return this;
    }
    public String getAllocationId() {
        return this.allocationId;
    }

    public AllocateEipAddressResponseBody setEipAddress(String eipAddress) {
        this.eipAddress = eipAddress;
        return this;
    }
    public String getEipAddress() {
        return this.eipAddress;
    }

    public AllocateEipAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
