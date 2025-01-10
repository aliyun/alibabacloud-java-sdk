// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListVccGrantRulesRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable paged query. Optional values:</p>
     * <ul>
     * <li><strong>true</strong>: Enable pagination query</li>
     * <li><strong>false</strong>: Pagination query is disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnablePage")
    public Boolean enablePage;

    /**
     * <p>Lingjun HUB ID</p>
     * 
     * <strong>example:</strong>
     * <p>er-kkopgtne</p>
     */
    @NameInMap("ErId")
    public String erId;

    /**
     * <p>Use the drop-down box</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ForSelect")
    public Boolean forSelect;

    /**
     * <p>Authorization Entry ID</p>
     * 
     * <strong>example:</strong>
     * <p>grant-rule-jaj33d1b804</p>
     */
    @NameInMap("GrantRuleId")
    public String grantRuleId;

    /**
     * <p>Authorized Tenant ID</p>
     * 
     * <strong>example:</strong>
     * <p>1620939556166277</p>
     */
    @NameInMap("GrantTenantId")
    public String grantTenantId;

    /**
     * <p>Network Instance ID</p>
     * 
     * <strong>example:</strong>
     * <p>vcc-cn-jaj33d1b804</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Instance name</p>
     * 
     * <strong>example:</strong>
     * <p>vcc-1</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The page number of the page to return. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Resource group instance ID</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzb3n5lgk2ieq</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ListVccGrantRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVccGrantRulesRequest self = new ListVccGrantRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListVccGrantRulesRequest setEnablePage(Boolean enablePage) {
        this.enablePage = enablePage;
        return this;
    }
    public Boolean getEnablePage() {
        return this.enablePage;
    }

    public ListVccGrantRulesRequest setErId(String erId) {
        this.erId = erId;
        return this;
    }
    public String getErId() {
        return this.erId;
    }

    public ListVccGrantRulesRequest setForSelect(Boolean forSelect) {
        this.forSelect = forSelect;
        return this;
    }
    public Boolean getForSelect() {
        return this.forSelect;
    }

    public ListVccGrantRulesRequest setGrantRuleId(String grantRuleId) {
        this.grantRuleId = grantRuleId;
        return this;
    }
    public String getGrantRuleId() {
        return this.grantRuleId;
    }

    public ListVccGrantRulesRequest setGrantTenantId(String grantTenantId) {
        this.grantTenantId = grantTenantId;
        return this;
    }
    public String getGrantTenantId() {
        return this.grantTenantId;
    }

    public ListVccGrantRulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListVccGrantRulesRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ListVccGrantRulesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListVccGrantRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListVccGrantRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListVccGrantRulesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
