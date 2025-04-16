// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallAclGroupListResponseBody extends TeaModel {
    /**
     * <p>The information about the policy groups.</p>
     */
    @NameInMap("AclGroupList")
    public java.util.List<DescribeVpcFirewallAclGroupListResponseBodyAclGroupList> aclGroupList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of the policy groups that are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeVpcFirewallAclGroupListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallAclGroupListResponseBody self = new DescribeVpcFirewallAclGroupListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallAclGroupListResponseBody setAclGroupList(java.util.List<DescribeVpcFirewallAclGroupListResponseBodyAclGroupList> aclGroupList) {
        this.aclGroupList = aclGroupList;
        return this;
    }
    public java.util.List<DescribeVpcFirewallAclGroupListResponseBodyAclGroupList> getAclGroupList() {
        return this.aclGroupList;
    }

    public DescribeVpcFirewallAclGroupListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpcFirewallAclGroupListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeVpcFirewallAclGroupListResponseBodyAclGroupListAclConfig extends TeaModel {
        @NameInMap("StrictMode")
        public Integer strictMode;

        public static DescribeVpcFirewallAclGroupListResponseBodyAclGroupListAclConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallAclGroupListResponseBodyAclGroupListAclConfig self = new DescribeVpcFirewallAclGroupListResponseBodyAclGroupListAclConfig();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallAclGroupListResponseBodyAclGroupListAclConfig setStrictMode(Integer strictMode) {
            this.strictMode = strictMode;
            return this;
        }
        public Integer getStrictMode() {
            return this.strictMode;
        }

    }

    public static class DescribeVpcFirewallAclGroupListResponseBodyAclGroupList extends TeaModel {
        @NameInMap("AclConfig")
        public DescribeVpcFirewallAclGroupListResponseBodyAclGroupListAclConfig aclConfig;

        /**
         * <p>The ID of the policy group.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>If the VPC firewall is used to protect a Cloud Enterprise Network (CEN) instance, the value of this parameter is the ID of the CEN instance.</p>
         * <p>Example: cen-ervw0g12b5jbw\<em>\</em>\<em>\</em></p>
         * </li>
         * <li><p>If the VPC firewall is used to protect an Express Connect circuit, the value of this parameter is the instance ID of the VPC firewall.</p>
         * <p>Example: vfw-a42bbb7b887148c9\<em>\</em>\<em>\</em></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vfw-a42bbb7b887148c9****</p>
         */
        @NameInMap("AclGroupId")
        public String aclGroupId;

        /**
         * <p>The name of the policy group. Valid values:</p>
         * <ul>
         * <li>If the VPC firewall is used to protect a CEN instance, the value of this parameter is the name of the CEN instance.</li>
         * <li>If the VPC firewall is used to protect an Express Connect circuit, the value of this parameter is the instance name of the VPC firewall.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>group_test</p>
         */
        @NameInMap("AclGroupName")
        public String aclGroupName;

        /**
         * <p>The number of access control policies in the policy group.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("AclRuleCount")
        public Integer aclRuleCount;

        /**
         * <p>是否是默认防火墙。取值：</p>
         * <ul>
         * <li><strong>true</strong>：是默认防火墙。</li>
         * <li><strong>false</strong>：不是默认防火墙。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The UID of the member that is managed by your Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>258039427902****</p>
         */
        @NameInMap("MemberUid")
        public String memberUid;

        public static DescribeVpcFirewallAclGroupListResponseBodyAclGroupList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallAclGroupListResponseBodyAclGroupList self = new DescribeVpcFirewallAclGroupListResponseBodyAclGroupList();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallAclGroupListResponseBodyAclGroupList setAclConfig(DescribeVpcFirewallAclGroupListResponseBodyAclGroupListAclConfig aclConfig) {
            this.aclConfig = aclConfig;
            return this;
        }
        public DescribeVpcFirewallAclGroupListResponseBodyAclGroupListAclConfig getAclConfig() {
            return this.aclConfig;
        }

        public DescribeVpcFirewallAclGroupListResponseBodyAclGroupList setAclGroupId(String aclGroupId) {
            this.aclGroupId = aclGroupId;
            return this;
        }
        public String getAclGroupId() {
            return this.aclGroupId;
        }

        public DescribeVpcFirewallAclGroupListResponseBodyAclGroupList setAclGroupName(String aclGroupName) {
            this.aclGroupName = aclGroupName;
            return this;
        }
        public String getAclGroupName() {
            return this.aclGroupName;
        }

        public DescribeVpcFirewallAclGroupListResponseBodyAclGroupList setAclRuleCount(Integer aclRuleCount) {
            this.aclRuleCount = aclRuleCount;
            return this;
        }
        public Integer getAclRuleCount() {
            return this.aclRuleCount;
        }

        public DescribeVpcFirewallAclGroupListResponseBodyAclGroupList setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public DescribeVpcFirewallAclGroupListResponseBodyAclGroupList setMemberUid(String memberUid) {
            this.memberUid = memberUid;
            return this;
        }
        public String getMemberUid() {
            return this.memberUid;
        }

    }

}
