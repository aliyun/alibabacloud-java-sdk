// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallIPSWhitelistResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("ListType")
        public Long listType;

        @NameInMap("ListValue")
        public String listValue;

        @NameInMap("VpcFirewallId")
        public String vpcFirewallId;

        @NameInMap("WhiteListValue")
        public java.util.List<String> whiteListValue;

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
