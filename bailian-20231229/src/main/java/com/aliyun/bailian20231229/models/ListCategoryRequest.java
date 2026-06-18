// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ListCategoryRequest extends TeaModel {
    /**
     * <p>Filters the results to include only the category with this exact name. If this parameter is omitted, no filtering is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>产品清单</p>
     */
    @NameInMap("CategoryName")
    public String categoryName;

    /**
     * <p>The type of category to query. Valid value:</p>
     * <ul>
     * <li><code>UNSTRUCTURED</code>: A category for unstructured data.</li>
     * </ul>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <blockquote>
     * <p>This API does not support querying structured data tables.</p>
     * </blockquote>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <blockquote>
     * <p>This API does not support querying structured data tables.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UNSTRUCTURED</p>
     */
    @NameInMap("CategoryType")
    public String categoryType;

    /**
     * <p>The ID of the connector.</p>
     * 
     * <strong>example:</strong>
     * <p>file_conn_xxxxx</p>
     */
    @NameInMap("ConnectorId")
    public String connectorId;

    /**
     * <p>The maximum number of categories to return per page. The valid range is 1 to 200.</p>
     * <p>Default value: 20. If this parameter is not specified or is set to a value less than 1, the default value is used. If a value greater than 200 is specified, the maximum value of 200 is used.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. To retrieve the next page of results, pass the <code>NextToken</code> value from the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdH70eOCSCKtacdomNzak4U=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the parent category.</p>
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
