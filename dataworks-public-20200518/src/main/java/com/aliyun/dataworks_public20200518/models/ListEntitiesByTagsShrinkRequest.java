// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListEntitiesByTagsShrinkRequest extends TeaModel {
    /**
     * <p>The type of the entity.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>maxcompute-table</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The number of entries per page. Default value: 10. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The tags.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    public static ListEntitiesByTagsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEntitiesByTagsShrinkRequest self = new ListEntitiesByTagsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListEntitiesByTagsShrinkRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public ListEntitiesByTagsShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListEntitiesByTagsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListEntitiesByTagsShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}
