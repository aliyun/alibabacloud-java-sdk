// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListEntitiesByTagsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Tags")
    public java.util.List<UserEntityTag> tags;

    public static ListEntitiesByTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEntitiesByTagsRequest self = new ListEntitiesByTagsRequest();
        return TeaModel.build(map, self);
    }

    public ListEntitiesByTagsRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public ListEntitiesByTagsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListEntitiesByTagsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListEntitiesByTagsRequest setTags(java.util.List<UserEntityTag> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<UserEntityTag> getTags() {
        return this.tags;
    }

}
