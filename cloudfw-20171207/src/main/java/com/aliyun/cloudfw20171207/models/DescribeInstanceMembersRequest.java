// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInstanceMembersRequest extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>Pages start from page 1. Default value: **1**.</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>The remarks of the member in Cloud Firewall. The length is 1 ~ 256 characters.</p>
     */
    @NameInMap("MemberDesc")
    public String memberDesc;

    /**
     * <p>The name of the member in Cloud Firewall.</p>
     */
    @NameInMap("MemberDisplayName")
    public String memberDisplayName;

    /**
     * <p>The unique identifier (UID) of the member in Cloud Firewall.</p>
     */
    @NameInMap("MemberUid")
    public String memberUid;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Default value: **20**.</p>
     */
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
