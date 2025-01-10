// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListVpdGrantRulesRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable pagination query.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnablePage")
    public Boolean enablePage;

    /**
     * <p>Lingjun HUB Instance ID</p>
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
     * <p>grant-rule-8rgvqazb</p>
     */
    @NameInMap("GrantRuleId")
    public String grantRuleId;

    /**
     * <p>Authorized Tenant ID</p>
     * 
     * <strong>example:</strong>
     * <p>1620939556166279</p>
     */
    @NameInMap("GrantTenantId")
    public String grantTenantId;

    /**
     * <p>The ID of the network instance that you want to query.</p>
     * 
     * <strong>example:</strong>
     * <p>vpd-8rgvqazb</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Instance name</p>
     * 
     * <strong>example:</strong>
     * <p>vpd-1</p>
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
     * <p>The number of entries to return on each page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
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
     * <p>rg-aek2l4sq6l7unhi</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ListVpdGrantRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVpdGrantRulesRequest self = new ListVpdGrantRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListVpdGrantRulesRequest setEnablePage(Boolean enablePage) {
        this.enablePage = enablePage;
        return this;
    }
    public Boolean getEnablePage() {
        return this.enablePage;
    }

    public ListVpdGrantRulesRequest setErId(String erId) {
        this.erId = erId;
        return this;
    }
    public String getErId() {
        return this.erId;
    }

    public ListVpdGrantRulesRequest setForSelect(Boolean forSelect) {
        this.forSelect = forSelect;
        return this;
    }
    public Boolean getForSelect() {
        return this.forSelect;
    }

    public ListVpdGrantRulesRequest setGrantRuleId(String grantRuleId) {
        this.grantRuleId = grantRuleId;
        return this;
    }
    public String getGrantRuleId() {
        return this.grantRuleId;
    }

    public ListVpdGrantRulesRequest setGrantTenantId(String grantTenantId) {
        this.grantTenantId = grantTenantId;
        return this;
    }
    public String getGrantTenantId() {
        return this.grantTenantId;
    }

    public ListVpdGrantRulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListVpdGrantRulesRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ListVpdGrantRulesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListVpdGrantRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListVpdGrantRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListVpdGrantRulesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
