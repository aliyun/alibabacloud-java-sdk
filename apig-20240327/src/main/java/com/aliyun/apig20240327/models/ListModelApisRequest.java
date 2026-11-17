// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListModelApisRequest extends TeaModel {
    /**
     * <p>The gateway instance ID used to filter results.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-d00000000000000000000</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>Specifies whether to return legacy model APIs created by scenario. If this parameter is omitted or set to false, only APIs created by selecting a model are returned. If this parameter is set to true, APIs created by both methods are returned on the same page, excluding common HTTP, MCP, or Agent APIs.</p>
     */
    @NameInMap("includeLegacy")
    public Boolean includeLegacy;

    /**
     * <p>The search keyword. Supports fuzzy search by API name or exact search by API ID.</p>
     * 
     * <strong>example:</strong>
     * <p>beta</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>The API name for exact search.</p>
     * 
     * <strong>example:</strong>
     * <p>beta-model-api</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The page number. Pages start from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the resource group used to filter results.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acf0000000000000000</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    public static ListModelApisRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModelApisRequest self = new ListModelApisRequest();
        return TeaModel.build(map, self);
    }

    public ListModelApisRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ListModelApisRequest setIncludeLegacy(Boolean includeLegacy) {
        this.includeLegacy = includeLegacy;
        return this;
    }
    public Boolean getIncludeLegacy() {
        return this.includeLegacy;
    }

    public ListModelApisRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListModelApisRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListModelApisRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListModelApisRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListModelApisRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
