// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeClientsRequest extends TeaModel {
    /**
     * <p>The ID of the Cloud Backup client.</p>
     * 
     * <strong>example:</strong>
     * <p>c-000ed600******6b0</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>The type of the Cloud Backup client. Valid value: <strong>ECS_AGENT</strong>, which indicates an SAP HANA backup client.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS_AGENT</p>
     */
    @NameInMap("ClientType")
    public String clientType;

    /**
     * <p>The ID of the SAP HANA instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cl-0005ni1******2l87</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 99. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmw6bxl7o5qyq</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The type of the data source. Valid value:<strong>HANA</strong>, which indicates SAP HANA backup.</p>
     * 
     * <strong>example:</strong>
     * <p>HANA</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The ID of the backup vault.</p>
     * 
     * <strong>example:</strong>
     * <p>v-0001vk0z******xdyr</p>
     */
    @NameInMap("VaultId")
    public String vaultId;

    public static DescribeClientsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClientsRequest self = new DescribeClientsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClientsRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public DescribeClientsRequest setClientType(String clientType) {
        this.clientType = clientType;
        return this;
    }
    public String getClientType() {
        return this.clientType;
    }

    public DescribeClientsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeClientsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeClientsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeClientsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeClientsRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public DescribeClientsRequest setVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }
    public String getVaultId() {
        return this.vaultId;
    }

}
