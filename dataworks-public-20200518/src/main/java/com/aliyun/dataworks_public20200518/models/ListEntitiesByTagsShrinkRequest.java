// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListEntitiesByTagsShrinkRequest extends TeaModel {
    @NameInMap("EntityType")
    public String entityType;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PageSize")
    public Integer pageSize;

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
