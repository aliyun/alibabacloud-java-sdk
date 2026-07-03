// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListGatewaysShrinkRequest extends TeaModel {
    /**
     * <p>The gateway ID for exact match query.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-cpv4sqdl****</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>The gateway type.</p>
     * 
     * <strong>example:</strong>
     * <p>API</p>
     */
    @NameInMap("gatewayType")
    public String gatewayType;

    /**
     * <p>The keyword for full match search. Case-insensitive.</p>
     * 
     * <strong>example:</strong>
     * <p>dev</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>The gateway name for exact match query.</p>
     * 
     * <strong>example:</strong>
     * <p>itemcenter-gateway</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzq6bzz5uyg2q</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("tag")
    public String tagShrink;

    public static ListGatewaysShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGatewaysShrinkRequest self = new ListGatewaysShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListGatewaysShrinkRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ListGatewaysShrinkRequest setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }
    public String getGatewayType() {
        return this.gatewayType;
    }

    public ListGatewaysShrinkRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListGatewaysShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListGatewaysShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListGatewaysShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListGatewaysShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListGatewaysShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

}
