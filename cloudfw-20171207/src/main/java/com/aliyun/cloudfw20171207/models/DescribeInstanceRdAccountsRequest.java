// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInstanceRdAccountsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>renewal</p>
     */
    @NameInMap("MemberDesc")
    public String memberDesc;

    /**
     * <strong>example:</strong>
     * <p>cloudfirewall_2</p>
     */
    @NameInMap("MemberDisplayName")
    public String memberDisplayName;

    /**
     * <strong>example:</strong>
     * <p>258039427902****</p>
     */
    @NameInMap("MemberUid")
    public String memberUid;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <strong>example:</strong>
     * <p>47.100.170.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeInstanceRdAccountsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceRdAccountsRequest self = new DescribeInstanceRdAccountsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceRdAccountsRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeInstanceRdAccountsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeInstanceRdAccountsRequest setMemberDesc(String memberDesc) {
        this.memberDesc = memberDesc;
        return this;
    }
    public String getMemberDesc() {
        return this.memberDesc;
    }

    public DescribeInstanceRdAccountsRequest setMemberDisplayName(String memberDisplayName) {
        this.memberDisplayName = memberDisplayName;
        return this;
    }
    public String getMemberDisplayName() {
        return this.memberDisplayName;
    }

    public DescribeInstanceRdAccountsRequest setMemberUid(String memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public String getMemberUid() {
        return this.memberUid;
    }

    public DescribeInstanceRdAccountsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeInstanceRdAccountsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
