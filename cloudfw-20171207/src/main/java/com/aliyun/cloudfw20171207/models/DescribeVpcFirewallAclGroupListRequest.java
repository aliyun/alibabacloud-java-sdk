// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallAclGroupListRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: 1.</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>Specifies whether VPC firewalls are configured. Valid values:</p>
     * <br>
     * <p>*   **notconfigured**: VPC firewalls are not configured.</p>
     * <p>*   **configured**: VPC firewalls are configured.</p>
     * <p>*   If you do not specify this parameter, the access control policies of all VPC firewalls are queried.</p>
     */
    @NameInMap("FirewallConfigureStatus")
    public String firewallConfigureStatus;

    /**
     * <p>The language of the content within the response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese (default)</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries to return on each page. Maximum value: 50.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    public static DescribeVpcFirewallAclGroupListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallAclGroupListRequest self = new DescribeVpcFirewallAclGroupListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallAclGroupListRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeVpcFirewallAclGroupListRequest setFirewallConfigureStatus(String firewallConfigureStatus) {
        this.firewallConfigureStatus = firewallConfigureStatus;
        return this;
    }
    public String getFirewallConfigureStatus() {
        return this.firewallConfigureStatus;
    }

    public DescribeVpcFirewallAclGroupListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeVpcFirewallAclGroupListRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
