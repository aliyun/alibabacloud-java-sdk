// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallAclGroupListRequest extends TeaModel {
    /**
     * <p>The page number of the current page returned for a paged query. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>The configuration status of the VPC firewall. Valid values:</p>
     * <ul>
     * <li><strong>configured</strong>: The virtual private cloud (VPC) firewalls at the border are configured (that is, the firewalls are created).</li>
     * <li>Empty: queries the access control policy of all virtual private cloud (VPC) firewalls at the border.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>configured</p>
     */
    @NameInMap("FirewallConfigureStatus")
    public String firewallConfigureStatus;

    /**
     * <p>The instance ID of the virtual private cloud (VPC) firewalls at the border.</p>
     * 
     * <strong>example:</strong>
     * <p>vfw-tr-5b202e7f0be64611****</p>
     */
    @NameInMap("FirewallId")
    public String firewallId;

    /**
     * <p>The language of the response message. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The maximum number of entries to return on each page for a paged query. Maximum value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
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

    public DescribeVpcFirewallAclGroupListRequest setFirewallId(String firewallId) {
        this.firewallId = firewallId;
        return this;
    }
    public String getFirewallId() {
        return this.firewallId;
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
