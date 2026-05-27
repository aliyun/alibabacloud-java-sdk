// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class AssignWuyingServerPrivateAddressesResponseBody extends TeaModel {
    @NameInMap("AssignedPrivateIpAddresses")
    public java.util.List<String> assignedPrivateIpAddresses;

    /**
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AssignWuyingServerPrivateAddressesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssignWuyingServerPrivateAddressesResponseBody self = new AssignWuyingServerPrivateAddressesResponseBody();
        return TeaModel.build(map, self);
    }

    public AssignWuyingServerPrivateAddressesResponseBody setAssignedPrivateIpAddresses(java.util.List<String> assignedPrivateIpAddresses) {
        this.assignedPrivateIpAddresses = assignedPrivateIpAddresses;
        return this;
    }
    public java.util.List<String> getAssignedPrivateIpAddresses() {
        return this.assignedPrivateIpAddresses;
    }

    public AssignWuyingServerPrivateAddressesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
