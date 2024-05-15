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
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of the policy groups that are returned.</p>
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

    public static class DescribeVpcFirewallAclGroupListResponseBodyAclGroupList extends TeaModel {
        /**
         * <p>The ID of the policy group.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   If the VPC firewall is used to protect a Cloud Enterprise Network (CEN) instance, the value of this parameter is the ID of the CEN instance.</p>
         * <br>
         * <p>    Example: cen-ervw0g12b5jbw\\*\\*\\*\\*</p>
         * <br>
         * <p>*   If the VPC firewall is used to protect an Express Connect circuit, the value of this parameter is the instance ID of the VPC firewall.</p>
         * <br>
         * <p>    Example: vfw-a42bbb7b887148c9\\*\\*\\*\\*</p>
         */
        @NameInMap("AclGroupId")
        public String aclGroupId;

        /**
         * <p>The name of the policy group. Valid values:</p>
         * <br>
         * <p>*   If the VPC firewall is used to protect a CEN instance, the value of this parameter is the name of the CEN instance.</p>
         * <p>*   If the VPC firewall is used to protect an Express Connect circuit, the value of this parameter is the instance name of the VPC firewall.</p>
         */
        @NameInMap("AclGroupName")
        public String aclGroupName;

        /**
         * <p>The number of access control policies in the policy group.</p>
         */
        @NameInMap("AclRuleCount")
        public Integer aclRuleCount;

        /**
         * <p>是否是默认防火墙。取值：</p>
         * <p>- **true**：是默认防火墙。</p>
         * <p>- **false**：不是默认防火墙。</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The UID of the member that is managed by your Alibaba Cloud account.</p>
         */
        @NameInMap("MemberUid")
        public String memberUid;

        public static DescribeVpcFirewallAclGroupListResponseBodyAclGroupList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallAclGroupListResponseBodyAclGroupList self = new DescribeVpcFirewallAclGroupListResponseBodyAclGroupList();
            return TeaModel.build(map, self);
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
