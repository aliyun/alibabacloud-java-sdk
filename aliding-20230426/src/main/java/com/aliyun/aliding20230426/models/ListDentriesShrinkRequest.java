// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListDentriesShrinkRequest extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Order")
    public String order;

    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ParentId")
    public String parentId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    @NameInMap("WithThumbnail")
    public Boolean withThumbnail;

    public static ListDentriesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDentriesShrinkRequest self = new ListDentriesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListDentriesShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDentriesShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDentriesShrinkRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListDentriesShrinkRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListDentriesShrinkRequest setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public ListDentriesShrinkRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public ListDentriesShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public ListDentriesShrinkRequest setWithThumbnail(Boolean withThumbnail) {
        this.withThumbnail = withThumbnail;
        return this;
    }
    public Boolean getWithThumbnail() {
        return this.withThumbnail;
    }

}
