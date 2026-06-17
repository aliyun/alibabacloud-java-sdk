// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeCreatedNatFirewallResponseBody extends TeaModel {
    /**
     * <p>A list of the created NAT firewalls.</p>
     */
    @NameInMap("CreatedNatFirewalls")
    public java.util.List<DescribeCreatedNatFirewallResponseBodyCreatedNatFirewalls> createdNatFirewalls;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>072B5287-8A85-529E-BD47-F8AC2DB1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCreatedNatFirewallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCreatedNatFirewallResponseBody self = new DescribeCreatedNatFirewallResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCreatedNatFirewallResponseBody setCreatedNatFirewalls(java.util.List<DescribeCreatedNatFirewallResponseBodyCreatedNatFirewalls> createdNatFirewalls) {
        this.createdNatFirewalls = createdNatFirewalls;
        return this;
    }
    public java.util.List<DescribeCreatedNatFirewallResponseBodyCreatedNatFirewalls> getCreatedNatFirewalls() {
        return this.createdNatFirewalls;
    }

    public DescribeCreatedNatFirewallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCreatedNatFirewallResponseBodyCreatedNatFirewalls extends TeaModel {
        /**
         * <p>The ID of the NAT firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>cfw-adk2ad45sf4t8****</p>
         */
        @NameInMap("NatFirewallId")
        public String natFirewallId;

        /**
         * <p>The ID of the NAT Gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-uf6i0zkjtz4t2sttf****</p>
         */
        @NameInMap("NatGatewayId")
        public String natGatewayId;

        /**
         * <p>The name of the NAT Gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-text</p>
         */
        @NameInMap("NatGatewayName")
        public String natGatewayName;

        public static DescribeCreatedNatFirewallResponseBodyCreatedNatFirewalls build(java.util.Map<String, ?> map) throws Exception {
            DescribeCreatedNatFirewallResponseBodyCreatedNatFirewalls self = new DescribeCreatedNatFirewallResponseBodyCreatedNatFirewalls();
            return TeaModel.build(map, self);
        }

        public DescribeCreatedNatFirewallResponseBodyCreatedNatFirewalls setNatFirewallId(String natFirewallId) {
            this.natFirewallId = natFirewallId;
            return this;
        }
        public String getNatFirewallId() {
            return this.natFirewallId;
        }

        public DescribeCreatedNatFirewallResponseBodyCreatedNatFirewalls setNatGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        public DescribeCreatedNatFirewallResponseBodyCreatedNatFirewalls setNatGatewayName(String natGatewayName) {
            this.natGatewayName = natGatewayName;
            return this;
        }
        public String getNatGatewayName() {
            return this.natGatewayName;
        }

    }

}
