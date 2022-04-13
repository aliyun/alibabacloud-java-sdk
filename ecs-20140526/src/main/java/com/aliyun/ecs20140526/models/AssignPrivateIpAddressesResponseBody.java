// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AssignPrivateIpAddressesResponseBody extends TeaModel {
    @NameInMap("AssignedPrivateIpAddressesSet")
    public AssignPrivateIpAddressesResponseBodyAssignedPrivateIpAddressesSet assignedPrivateIpAddressesSet;

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

    public static class AssignPrivateIpAddressesResponseBodyAssignedPrivateIpAddressesSetPrivateIpSet extends TeaModel {
        @NameInMap("PrivateIpAddress")
        public java.util.List<String> privateIpAddress;

        public static AssignPrivateIpAddressesResponseBodyAssignedPrivateIpAddressesSetPrivateIpSet build(java.util.Map<String, ?> map) throws Exception {
            AssignPrivateIpAddressesResponseBodyAssignedPrivateIpAddressesSetPrivateIpSet self = new AssignPrivateIpAddressesResponseBodyAssignedPrivateIpAddressesSetPrivateIpSet();
            return TeaModel.build(map, self);
        }

        public AssignPrivateIpAddressesResponseBodyAssignedPrivateIpAddressesSetPrivateIpSet setPrivateIpAddress(java.util.List<String> privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public java.util.List<String> getPrivateIpAddress() {
            return this.privateIpAddress;
        }

    }

    public static class AssignPrivateIpAddressesResponseBodyAssignedPrivateIpAddressesSet extends TeaModel {
        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        @NameInMap("PrivateIpSet")
        public AssignPrivateIpAddressesResponseBodyAssignedPrivateIpAddressesSetPrivateIpSet privateIpSet;

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

        public AssignPrivateIpAddressesResponseBodyAssignedPrivateIpAddressesSet setPrivateIpSet(AssignPrivateIpAddressesResponseBodyAssignedPrivateIpAddressesSetPrivateIpSet privateIpSet) {
            this.privateIpSet = privateIpSet;
            return this;
        }
        public AssignPrivateIpAddressesResponseBodyAssignedPrivateIpAddressesSetPrivateIpSet getPrivateIpSet() {
            return this.privateIpSet;
        }

    }

}
