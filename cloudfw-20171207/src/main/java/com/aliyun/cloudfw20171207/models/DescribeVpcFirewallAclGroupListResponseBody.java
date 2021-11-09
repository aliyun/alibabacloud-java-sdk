// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallAclGroupListResponseBody extends TeaModel {
    @NameInMap("AclGroupList")
    public java.util.List<DescribeVpcFirewallAclGroupListResponseBodyAclGroupList> aclGroupList;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AclGroupId")
        public String aclGroupId;

        @NameInMap("AclGroupName")
        public String aclGroupName;

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

        public DescribeVpcFirewallAclGroupListResponseBodyAclGroupList setMemberUid(String memberUid) {
            this.memberUid = memberUid;
            return this;
        }
        public String getMemberUid() {
            return this.memberUid;
        }

    }

}
