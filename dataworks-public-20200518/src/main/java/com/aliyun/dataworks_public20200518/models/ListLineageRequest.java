// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListLineageRequest extends TeaModel {
    /**
     * <p>The lineage type. Valid values:</p>
     * <ul>
     * <li>up: ancestor lineage</li>
     * <li>down: descendant lineage</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>up</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The unique identifier of the entity.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>maxcompute-table.project.table</p>
     */
    @NameInMap("EntityQualifiedName")
    public String entityQualifiedName;

    /**
     * <p>The keyword of the entity name.</p>
     * 
     * <strong>example:</strong>
     * <p>name-keyword</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>next-token-from-previous-request</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The number of entries per page. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListLineageRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLineageRequest self = new ListLineageRequest();
        return TeaModel.build(map, self);
    }

    public ListLineageRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public ListLineageRequest setEntityQualifiedName(String entityQualifiedName) {
        this.entityQualifiedName = entityQualifiedName;
        return this;
    }
    public String getEntityQualifiedName() {
        return this.entityQualifiedName;
    }

    public ListLineageRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListLineageRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListLineageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
