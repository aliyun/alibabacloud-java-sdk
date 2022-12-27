// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AssignPrivateIpAddressesResponseBody extends TeaModel {
    @NameInMap("AssignedPrivateIpAddressesSet")
    public AssignPrivateIpAddressesResponseBodyAssignedPrivateIpAddressesSet assignedPrivateIpAddressesSet;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static AssignPrivateIpAddressesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssignPrivateIpAddressesResponseBody self = new AssignPrivateIpAddressesResponseBody();
        return TeaModel.build(map, self);
    }

    public AssignPrivateIpAddressesResponseBody setAssignedPrivateIpAddressesSet(AssignPrivateIpAddressesResponseBodyAssignedPrivateIpAddressesSet assignedPrivateIpAddressesSet) {
        this.assignedPrivateIpAddressesSet = assignedPrivateIpAddressesSet;
        return this;
    }
    public AssignPrivateIpAddressesResponseBodyAssignedPrivateIpAddressesSet getAssignedPrivateIpAddressesSet() {
        return this.assignedPrivateIpAddressesSet;
    }

    public AssignPrivateIpAddressesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AssignPrivateIpAddressesResponseBodyAssignedPrivateIpAddressesSet extends TeaModel {
        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        @NameInMap("PrivateIpSet")
        public java.util.List<String> privateIpSet;

        public static AssignPrivateIpAddressesResponseBodyAssignedPrivateIpAddressesSet build(java.util.Map<String, ?> map) throws Exception {
            AssignPrivateIpAddressesResponseBodyAssignedPrivateIpAddressesSet self = new AssignPrivateIpAddressesResponseBodyAssignedPrivateIpAddressesSet();
            return TeaModel.build(map, self);
        }

        public AssignPrivateIpAddressesResponseBodyAssignedPrivateIpAddressesSet setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public AssignPrivateIpAddressesResponseBodyAssignedPrivateIpAddressesSet setPrivateIpSet(java.util.List<String> privateIpSet) {
            this.privateIpSet = privateIpSet;
            return this;
        }
        public java.util.List<String> getPrivateIpSet() {
            return this.privateIpSet;
        }

    }

}
