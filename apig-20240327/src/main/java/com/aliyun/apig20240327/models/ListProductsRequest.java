// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListProductsRequest extends TeaModel {
    /**
     * <p>The product category IDs, which correspond to the Categories property of the API product resource. The members are category IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>category-xxxxxxxx</p>
     */
    @NameInMap("categoryIds")
    public String categoryIds;

    /**
     * <p>The maximum number of entries to return per request.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The name of the API product, which is the Name property of the API product resource. This is the same field as name in the response list items.</p>
     * 
     * <strong>example:</strong>
     * <p>weather-query-api</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The cursor token for the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>next-token-xxxxxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

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
     * <p>The ID of the HiMarket developer portal where the API product is published, which corresponds to the PortalId property of the API product resource. This property is used only for list queries in the product resource definition.</p>
     * 
     * <strong>example:</strong>
     * <p>portal-xxxxxxxx</p>
     */
    @NameInMap("portalId")
    public String portalId;

    /**
     * <p>The status of the API product, which corresponds to the Status property of the API product resource. This is the same field as status in the response list items. Valid values: Pending, Ready, and Published.</p>
     * 
     * <strong>example:</strong>
     * <p>Published</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The type of the API product, which corresponds to the Type property of the API product resource. This is the same field as type in the response list items. The valid values are not declared in the API definition. Refer to the types displayed in the console.</p>
     * 
     * <strong>example:</strong>
     * <p>API</p>
     */
    @NameInMap("type")
    public String type;

    public static ListProductsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProductsRequest self = new ListProductsRequest();
        return TeaModel.build(map, self);
    }

    public ListProductsRequest setCategoryIds(String categoryIds) {
        this.categoryIds = categoryIds;
        return this;
    }
    public String getCategoryIds() {
        return this.categoryIds;
    }

    public ListProductsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListProductsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListProductsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListProductsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListProductsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListProductsRequest setPortalId(String portalId) {
        this.portalId = portalId;
        return this;
    }
    public String getPortalId() {
        return this.portalId;
    }

    public ListProductsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListProductsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
