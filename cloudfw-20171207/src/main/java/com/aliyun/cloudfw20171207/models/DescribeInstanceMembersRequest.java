// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInstanceMembersRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public String currentPage;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("MemberUid")
    public String memberUid;

    @NameInMap("MemberDisplayName")
    public String memberDisplayName;

    @NameInMap("MemberDesc")
    public String memberDesc;

    public static DescribeInstanceMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceMembersRequest self = new DescribeInstanceMembersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceMembersRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeInstanceMembersRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeInstanceMembersRequest setMemberUid(String memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public String getMemberUid() {
        return this.memberUid;
    }

    public DescribeInstanceMembersRequest setMemberDisplayName(String memberDisplayName) {
        this.memberDisplayName = memberDisplayName;
        return this;
    }
    public String getMemberDisplayName() {
        return this.memberDisplayName;
    }

    public DescribeInstanceMembersRequest setMemberDesc(String memberDesc) {
        this.memberDesc = memberDesc;
        return this;
    }
    public String getMemberDesc() {
        return this.memberDesc;
    }

}
