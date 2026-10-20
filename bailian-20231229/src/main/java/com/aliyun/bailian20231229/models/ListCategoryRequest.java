// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ListCategoryRequest extends TeaModel {
    /**
     * <p>Performs an exact match or filter on the category list returned by the operation based on the category name. Default value: empty, which means category name filtering is not enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>ProductList</p>
     */
    @NameInMap("CategoryName")
    public String categoryName;

    /**
     * <p>The type of category to query. Valid values:</p>
     * <ul>
     * <li>UNSTRUCTURED: category.</li>
     * </ul>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <blockquote>
     * <p>Querying tables (data tables) by using API operations is not supported.</p>
     * </blockquote>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <blockquote>
     * <p>Querying structured data tables by using API operations is not supported.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UNSTRUCTURED</p>
     */
    @NameInMap("CategoryType")
    public String categoryType;

    /**
     * <p>The connector ID.</p>
     * 
     * <strong>example:</strong>
     * <p>file_conn_xxxxx</p>
     */
    @NameInMap("ConnectorId")
    public String connectorId;

    /**
     * <p>The number of categories per page in a paged query. Maximum value: 200. Valid values: 1 to 200.</p>
     * <p>Default value:
     * If the value is not set or is less than 1, the default value is 20. If the value is greater than 200, the default value is 200.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. Set this parameter to the NextToken value returned in the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdH70eOCSCKtacdomNzak4U=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the parent category for the categories to query.</p>
     * 
     * <strong>example:</strong>
     * <p>cate_cdd11b1b79a74e8bbd675c356a91ee3xxxxxxxx</p>
     */
    @NameInMap("ParentCategoryId")
    public String parentCategoryId;

    public static ListCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCategoryRequest self = new ListCategoryRequest();
        return TeaModel.build(map, self);
    }

    public ListCategoryRequest setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }
    public String getCategoryName() {
        return this.categoryName;
    }

    public ListCategoryRequest setCategoryType(String categoryType) {
        this.categoryType = categoryType;
        return this;
    }
    public String getCategoryType() {
        return this.categoryType;
    }

    public ListCategoryRequest setConnectorId(String connectorId) {
        this.connectorId = connectorId;
        return this;
    }
    public String getConnectorId() {
        return this.connectorId;
    }

    public ListCategoryRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListCategoryRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCategoryRequest setParentCategoryId(String parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
        return this;
    }
    public String getParentCategoryId() {
        return this.parentCategoryId;
    }

}
