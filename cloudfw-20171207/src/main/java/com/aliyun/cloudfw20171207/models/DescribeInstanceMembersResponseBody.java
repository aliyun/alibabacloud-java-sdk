// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInstanceMembersResponseBody extends TeaModel {
    // The information about the member in Cloud Firewall.
    @NameInMap("Members")
    public java.util.List<DescribeInstanceMembersResponseBodyMembers> members;

    // The pagination information.
    @NameInMap("PageInfo")
    public DescribeInstanceMembersResponseBodyPageInfo pageInfo;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceMembersResponseBody self = new DescribeInstanceMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceMembersResponseBody setMembers(java.util.List<DescribeInstanceMembersResponseBodyMembers> members) {
        this.members = members;
        return this;
    }
    public java.util.List<DescribeInstanceMembersResponseBodyMembers> getMembers() {
        return this.members;
    }

    public DescribeInstanceMembersResponseBody setPageInfo(DescribeInstanceMembersResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeInstanceMembersResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeInstanceMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceMembersResponseBodyMembers extends TeaModel {
        // The time when the member was added to Cloud Firewall.
        // 
        // >  The value is a UNIX timestamp. Unit: seconds.
        @NameInMap("CreateTime")
        public Integer createTime;

        // The remarks of the member in Cloud Firewall.
        @NameInMap("MemberDesc")
        public String memberDesc;

        // The name of the member in Cloud Firewall.
        @NameInMap("MemberDisplayName")
        public String memberDisplayName;

        // The status of the member in Cloud Firewall. Valid values:
        // 
        // *   **normal**
        // *   **deleting**
        @NameInMap("MemberStatus")
        public String memberStatus;

        // The UID of the member in Cloud Firewall.
        @NameInMap("MemberUid")
        public Long memberUid;

        // The time when the member in Cloud Firewall was last modified.
        // 
        // >  The value is a UNIX timestamp. Unit: seconds.
        @NameInMap("ModifyTime")
        public Integer modifyTime;

        public static DescribeInstanceMembersResponseBodyMembers build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceMembersResponseBodyMembers self = new DescribeInstanceMembersResponseBodyMembers();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceMembersResponseBodyMembers setCreateTime(Integer createTime) {
            this.createTime = createTime;
            return this;
        }
        public Integer getCreateTime() {
            return this.createTime;
        }

        public DescribeInstanceMembersResponseBodyMembers setMemberDesc(String memberDesc) {
            this.memberDesc = memberDesc;
            return this;
        }
        public String getMemberDesc() {
            return this.memberDesc;
        }

        public DescribeInstanceMembersResponseBodyMembers setMemberDisplayName(String memberDisplayName) {
            this.memberDisplayName = memberDisplayName;
            return this;
        }
        public String getMemberDisplayName() {
            return this.memberDisplayName;
        }

        public DescribeInstanceMembersResponseBodyMembers setMemberStatus(String memberStatus) {
            this.memberStatus = memberStatus;
            return this;
        }
        public String getMemberStatus() {
            return this.memberStatus;
        }

        public DescribeInstanceMembersResponseBodyMembers setMemberUid(Long memberUid) {
            this.memberUid = memberUid;
            return this;
        }
        public Long getMemberUid() {
            return this.memberUid;
        }

        public DescribeInstanceMembersResponseBodyMembers setModifyTime(Integer modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Integer getModifyTime() {
            return this.modifyTime;
        }

    }

    public static class DescribeInstanceMembersResponseBodyPageInfo extends TeaModel {
        // The page number of the current page.
        @NameInMap("CurrentPage")
        public Integer currentPage;

        // The number of entries returned per page.
        @NameInMap("PageSize")
        public Integer pageSize;

        // The total number of the members in Cloud Firewall.
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeInstanceMembersResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceMembersResponseBodyPageInfo self = new DescribeInstanceMembersResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceMembersResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeInstanceMembersResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeInstanceMembersResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
