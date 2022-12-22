// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInstanceMembersRequest extends TeaModel {
    // The number of the page to return.
    // 
    // Pages start from page 1. Default value: **1**.
    @NameInMap("CurrentPage")
    public String currentPage;

    // The remarks of the member in Cloud Firewall. The length is 1 ~ 256 characters.
    @NameInMap("MemberDesc")
    public String memberDesc;

    // The name of the member in Cloud Firewall.
    @NameInMap("MemberDisplayName")
    public String memberDisplayName;

    // The unique identifier (UID) of the member in Cloud Firewall.
    @NameInMap("MemberUid")
    public String memberUid;

    // The number of entries to return on each page.
    // 
    // Default value: **20**.
    @NameInMap("PageSize")
    public String pageSize;

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

    public DescribeInstanceMembersRequest setMemberDesc(String memberDesc) {
        this.memberDesc = memberDesc;
        return this;
    }
    public String getMemberDesc() {
        return this.memberDesc;
    }

    public DescribeInstanceMembersRequest setMemberDisplayName(String memberDisplayName) {
        this.memberDisplayName = memberDisplayName;
        return this;
    }
    public String getMemberDisplayName() {
        return this.memberDisplayName;
    }

    public DescribeInstanceMembersRequest setMemberUid(String memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public String getMemberUid() {
        return this.memberUid;
    }

    public DescribeInstanceMembersRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
