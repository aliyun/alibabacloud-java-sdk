// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeTrFirewallV2RoutePolicyListRequest extends TeaModel {
    /**
     * <p>The page number in a paged query. Default value: 1. For more information about paging, see the corresponding parameter descriptions.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The instance ID of the virtual private cloud (VPC) firewall.</p>
     * <blockquote>
     * <p>FirewallId is required. If this parameter is not specified, the ErrorParameters (400) error is returned. You can call DescribeTrFirewallsV2List to obtain the FirewallId. Prerequisites: CEN Enterprise Edition with a transit router and VPC mount are configured, and the FirewallId is obtained by calling DescribeTrFirewallsV2List.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vfw-tr-d5ba592ac6c84aff****</p>
     */
    @NameInMap("FirewallId")
    public String firewallId;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The maximum number of entries per page in a paged query. Default value: 10. For more information about paging, see the corresponding parameter descriptions.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the firewall routing policy.</p>
     * 
     * <strong>example:</strong>
     * <p>policy-7b66257c14e141fb****</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    public static DescribeTrFirewallV2RoutePolicyListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTrFirewallV2RoutePolicyListRequest self = new DescribeTrFirewallV2RoutePolicyListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTrFirewallV2RoutePolicyListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeTrFirewallV2RoutePolicyListRequest setFirewallId(String firewallId) {
        this.firewallId = firewallId;
        return this;
    }
    public String getFirewallId() {
        return this.firewallId;
    }

    public DescribeTrFirewallV2RoutePolicyListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeTrFirewallV2RoutePolicyListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTrFirewallV2RoutePolicyListRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

}
