// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeTrFirewallV2RoutePolicyListRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("FirewallId")
    public String firewallId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PageSize")
    public Integer pageSize;

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
