// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AssignIpv6AddressesResponseBody extends TeaModel {
    /**
     * <p>The IPv6 prefixes of the ENI.</p>
     */
    @NameInMap("Ipv6PrefixSets")
    public AssignIpv6AddressesResponseBodyIpv6PrefixSets ipv6PrefixSets;

    /**
     * <p>The IPv6 addresses assigned to the ENI.</p>
     */
    @NameInMap("Ipv6Sets")
    public AssignIpv6AddressesResponseBodyIpv6Sets ipv6Sets;

    /**
     * <p>The ENI ID.</p>
     */
    @NameInMap("NetworkInterfaceId")
    public String networkInterfaceId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AssignIpv6AddressesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssignIpv6AddressesResponseBody self = new AssignIpv6AddressesResponseBody();
        return TeaModel.build(map, self);
    }

    public AssignIpv6AddressesResponseBody setIpv6PrefixSets(AssignIpv6AddressesResponseBodyIpv6PrefixSets ipv6PrefixSets) {
        this.ipv6PrefixSets = ipv6PrefixSets;
        return this;
    }
    public AssignIpv6AddressesResponseBodyIpv6PrefixSets getIpv6PrefixSets() {
        return this.ipv6PrefixSets;
    }

    public AssignIpv6AddressesResponseBody setIpv6Sets(AssignIpv6AddressesResponseBodyIpv6Sets ipv6Sets) {
        this.ipv6Sets = ipv6Sets;
        return this;
    }
    public AssignIpv6AddressesResponseBodyIpv6Sets getIpv6Sets() {
        return this.ipv6Sets;
    }

    public AssignIpv6AddressesResponseBody setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public AssignIpv6AddressesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AssignIpv6AddressesResponseBodyIpv6PrefixSets extends TeaModel {
        @NameInMap("Ipv6Prefix")
        public java.util.List<String> ipv6Prefix;

        public static AssignIpv6AddressesResponseBodyIpv6PrefixSets build(java.util.Map<String, ?> map) throws Exception {
            AssignIpv6AddressesResponseBodyIpv6PrefixSets self = new AssignIpv6AddressesResponseBodyIpv6PrefixSets();
            return TeaModel.build(map, self);
        }

        public AssignIpv6AddressesResponseBodyIpv6PrefixSets setIpv6Prefix(java.util.List<String> ipv6Prefix) {
            this.ipv6Prefix = ipv6Prefix;
            return this;
        }
        public java.util.List<String> getIpv6Prefix() {
            return this.ipv6Prefix;
        }

    }

    public static class AssignIpv6AddressesResponseBodyIpv6Sets extends TeaModel {
        @NameInMap("Ipv6Address")
        public java.util.List<String> ipv6Address;

        public static AssignIpv6AddressesResponseBodyIpv6Sets build(java.util.Map<String, ?> map) throws Exception {
            AssignIpv6AddressesResponseBodyIpv6Sets self = new AssignIpv6AddressesResponseBodyIpv6Sets();
            return TeaModel.build(map, self);
        }

        public AssignIpv6AddressesResponseBodyIpv6Sets setIpv6Address(java.util.List<String> ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }
        public java.util.List<String> getIpv6Address() {
            return this.ipv6Address;
        }

    }

}
