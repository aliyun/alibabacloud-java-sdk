// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SearchRecursionZonesShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("Direction")
    public String direction;

    @NameInMap("EffectiveScopes")
    public String effectiveScopesShrink;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>4698691</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <strong>example:</strong>
     * <p>cheng.suow.cc</p>
     */
    @NameInMap("ZoneName")
    public String zoneName;

    public static SearchRecursionZonesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchRecursionZonesShrinkRequest self = new SearchRecursionZonesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SearchRecursionZonesShrinkRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public SearchRecursionZonesShrinkRequest setEffectiveScopesShrink(String effectiveScopesShrink) {
        this.effectiveScopesShrink = effectiveScopesShrink;
        return this;
    }
    public String getEffectiveScopesShrink() {
        return this.effectiveScopesShrink;
    }

    public SearchRecursionZonesShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public SearchRecursionZonesShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public SearchRecursionZonesShrinkRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public SearchRecursionZonesShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchRecursionZonesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchRecursionZonesShrinkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public SearchRecursionZonesShrinkRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }
    public String getZoneName() {
        return this.zoneName;
    }

}
