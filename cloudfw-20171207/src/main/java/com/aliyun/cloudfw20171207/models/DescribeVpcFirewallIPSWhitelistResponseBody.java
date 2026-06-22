// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallIPSWhitelistResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B5EE02F9<strong><strong>AA49</strong></strong>F9F8D69483C1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the VPC border firewall IPS whitelist.</p>
     */
    @NameInMap("Whitelists")
    public java.util.List<DescribeVpcFirewallIPSWhitelistResponseBodyWhitelists> whitelists;

    public static DescribeVpcFirewallIPSWhitelistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallIPSWhitelistResponseBody self = new DescribeVpcFirewallIPSWhitelistResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallIPSWhitelistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpcFirewallIPSWhitelistResponseBody setWhitelists(java.util.List<DescribeVpcFirewallIPSWhitelistResponseBodyWhitelists> whitelists) {
        this.whitelists = whitelists;
        return this;
    }
    public java.util.List<DescribeVpcFirewallIPSWhitelistResponseBodyWhitelists> getWhitelists() {
        return this.whitelists;
    }

    public static class DescribeVpcFirewallIPSWhitelistResponseBodyWhitelists extends TeaModel {
        /**
         * <p>The list type. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: user-defined type</li>
         * <li><strong>2</strong>: address book type.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ListType")
        public Long listType;

        /**
         * <p>The value of the corresponding list type.</p>
         * 
         * <strong>example:</strong>
         * <p>10.10.200.4/32,10.10.200.25/32</p>
         */
        @NameInMap("ListValue")
        public String listValue;

        /**
         * <p>The instance ID of the VPC border firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-l6t5yj5fi762******</p>
         */
        @NameInMap("VpcFirewallId")
        public String vpcFirewallId;

        /**
         * <p>The content of the list type array.</p>
         */
        @NameInMap("WhiteListValue")
        public java.util.List<String> whiteListValue;

        /**
         * <p>The whitelist type. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: destination type</li>
         * <li><strong>2</strong>: source type.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("WhiteType")
        public Long whiteType;

        public static DescribeVpcFirewallIPSWhitelistResponseBodyWhitelists build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallIPSWhitelistResponseBodyWhitelists self = new DescribeVpcFirewallIPSWhitelistResponseBodyWhitelists();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallIPSWhitelistResponseBodyWhitelists setListType(Long listType) {
            this.listType = listType;
            return this;
        }
        public Long getListType() {
            return this.listType;
        }

        public DescribeVpcFirewallIPSWhitelistResponseBodyWhitelists setListValue(String listValue) {
            this.listValue = listValue;
            return this;
        }
        public String getListValue() {
            return this.listValue;
        }

        public DescribeVpcFirewallIPSWhitelistResponseBodyWhitelists setVpcFirewallId(String vpcFirewallId) {
            this.vpcFirewallId = vpcFirewallId;
            return this;
        }
        public String getVpcFirewallId() {
            return this.vpcFirewallId;
        }

        public DescribeVpcFirewallIPSWhitelistResponseBodyWhitelists setWhiteListValue(java.util.List<String> whiteListValue) {
            this.whiteListValue = whiteListValue;
            return this;
        }
        public java.util.List<String> getWhiteListValue() {
            return this.whiteListValue;
        }

        public DescribeVpcFirewallIPSWhitelistResponseBodyWhitelists setWhiteType(Long whiteType) {
            this.whiteType = whiteType;
            return this;
        }
        public Long getWhiteType() {
            return this.whiteType;
        }

    }

}
