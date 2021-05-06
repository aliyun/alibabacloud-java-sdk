// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInstanceRdAccountsRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

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

    public static DescribeInstanceRdAccountsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceRdAccountsRequest self = new DescribeInstanceRdAccountsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceRdAccountsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeInstanceRdAccountsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeInstanceRdAccountsRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeInstanceRdAccountsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeInstanceRdAccountsRequest setMemberUid(String memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public String getMemberUid() {
        return this.memberUid;
    }

    public DescribeInstanceRdAccountsRequest setMemberDisplayName(String memberDisplayName) {
        this.memberDisplayName = memberDisplayName;
        return this;
    }
    public String getMemberDisplayName() {
        return this.memberDisplayName;
    }

    public DescribeInstanceRdAccountsRequest setMemberDesc(String memberDesc) {
        this.memberDesc = memberDesc;
        return this;
    }
    public String getMemberDesc() {
        return this.memberDesc;
    }

}
