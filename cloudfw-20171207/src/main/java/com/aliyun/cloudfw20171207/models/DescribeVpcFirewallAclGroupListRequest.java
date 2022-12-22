// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallAclGroupListRequest extends TeaModel {
    // The number of the page to return. 
    // 
    // Default value: 1.
    @NameInMap("CurrentPage")
    public String currentPage;

    // Specifies whether VPC firewalls are configured. Valid values: 
    // 
    // - **notconfigured**: VPC firewalls are not configured.
    // - **configured**: VPC firewalls are configured.
    // - If this parameter is left empty, all policy groups of access control policies are queried.
    @NameInMap("FirewallConfigureStatus")
    public String firewallConfigureStatus;

    // The language of the content within the response. Valid values: 
    // 
    // - **zh**: Chinese (default)
    // - **en**: English
    @NameInMap("Lang")
    public String lang;

    // The number of entries to return on each page. 
    // 
    // Maximum value: 50.
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
