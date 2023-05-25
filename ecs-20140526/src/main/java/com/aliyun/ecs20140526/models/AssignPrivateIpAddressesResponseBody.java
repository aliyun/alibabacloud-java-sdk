// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AssignPrivateIpAddressesResponseBody extends TeaModel {
    /**
     * <p>Details about the ENI.</p>
     */
    @NameInMap("AssignedPrivateIpAddressesSet")
    public AssignPrivateIpAddressesResponseBodyAssignedPrivateIpAddressesSet assignedPrivateIpAddressesSet;

    /**
     * <p>The ID of the request.</p>
     */
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

    public static class AssignPrivateIpAddressesResponseBodyAssignedPrivateIpAddressesSetIpv4PrefixSet extends TeaModel {
        @NameInMap("Ipv4Prefixes")
        public java.util.List<String> ipv4Prefixes;

        public static AssignPrivateIpAddressesResponseBodyAssignedPrivateIpAddressesSetIpv4PrefixSet build(java.util.Map<String, ?> map) throws Exception {
            AssignPrivateIpAddressesResponseBodyAssignedPrivateIpAddressesSetIpv4PrefixSet self = new AssignPrivateIpAddressesResponseBodyAssignedPrivateIpAddressesSetIpv4PrefixSet();
            return TeaModel.build(map, self);
        }

        public AssignPrivateIpAddressesResponseBodyAssignedPrivateIpAddressesSetIpv4PrefixSet setIpv4Prefixes(java.util.List<String> ipv4Prefixes) {
            this.ipv4Prefixes = ipv4Prefixes;
            return this;
        }
        public java.util.List<String> getIpv4Prefixes() {
            return this.ipv4Prefixes;
        }

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
        /**
         * <p>> This parameter is in invitational preview and is unavailable for general users.</p>
         */
        @NameInMap("Ipv4PrefixSet")
        public AssignPrivateIpAddressesResponseBodyAssignedPrivateIpAddressesSetIpv4PrefixSet ipv4PrefixSet;

        /**
         * <p>The ENI ID.</p>
         */
        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        /**
         * <p>The private IP addresses assigned to the ENI.</p>
         */
        @NameInMap("PrivateIpSet")
        public AssignPrivateIpAddressesResponseBodyAssignedPrivateIpAddressesSetPrivateIpSet privateIpSet;

        public static AssignPrivateIpAddressesResponseBodyAssignedPrivateIpAddressesSet build(java.util.Map<String, ?> map) throws Exception {
            AssignPrivateIpAddressesResponseBodyAssignedPrivateIpAddressesSet self = new AssignPrivateIpAddressesResponseBodyAssignedPrivateIpAddressesSet();
            return TeaModel.build(map, self);
        }

        public AssignPrivateIpAddressesResponseBodyAssignedPrivateIpAddressesSet setIpv4PrefixSet(AssignPrivateIpAddressesResponseBodyAssignedPrivateIpAddressesSetIpv4PrefixSet ipv4PrefixSet) {
            this.ipv4PrefixSet = ipv4PrefixSet;
            return this;
        }
        public AssignPrivateIpAddressesResponseBodyAssignedPrivateIpAddressesSetIpv4PrefixSet getIpv4PrefixSet() {
            return this.ipv4PrefixSet;
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
