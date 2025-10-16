// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallCenSummaryListRequest extends TeaModel {
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
     * <p>135809047715****</p>
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
     * <p>Basic</p>
     */
    @NameInMap("TransitRouterType")
    public String transitRouterType;

    public static DescribeVpcFirewallCenSummaryListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallCenSummaryListRequest self = new DescribeVpcFirewallCenSummaryListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallCenSummaryListRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeVpcFirewallCenSummaryListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeVpcFirewallCenSummaryListRequest setMemberUid(String memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public String getMemberUid() {
        return this.memberUid;
    }

    public DescribeVpcFirewallCenSummaryListRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeVpcFirewallCenSummaryListRequest setTransitRouterType(String transitRouterType) {
        this.transitRouterType = transitRouterType;
        return this;
    }
    public String getTransitRouterType() {
        return this.transitRouterType;
    }

}
