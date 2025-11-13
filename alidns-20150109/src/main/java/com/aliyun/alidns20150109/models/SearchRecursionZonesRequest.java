// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SearchRecursionZonesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("Direction")
    public String direction;

    @NameInMap("EffectiveScopes")
    public java.util.List<SearchRecursionZonesRequestEffectiveScopes> effectiveScopes;

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

    public static SearchRecursionZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchRecursionZonesRequest self = new SearchRecursionZonesRequest();
        return TeaModel.build(map, self);
    }

    public SearchRecursionZonesRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public SearchRecursionZonesRequest setEffectiveScopes(java.util.List<SearchRecursionZonesRequestEffectiveScopes> effectiveScopes) {
        this.effectiveScopes = effectiveScopes;
        return this;
    }
    public java.util.List<SearchRecursionZonesRequestEffectiveScopes> getEffectiveScopes() {
        return this.effectiveScopes;
    }

    public SearchRecursionZonesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public SearchRecursionZonesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public SearchRecursionZonesRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public SearchRecursionZonesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchRecursionZonesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchRecursionZonesRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public SearchRecursionZonesRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }
    public String getZoneName() {
        return this.zoneName;
    }

    public static class SearchRecursionZonesRequestEffectiveScopes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>account</p>
         */
        @NameInMap("EffectiveType")
        public String effectiveType;

        /**
         * <strong>example:</strong>
         * <p>[20003]</p>
         */
        @NameInMap("Scope")
        public java.util.List<String> scope;

        public static SearchRecursionZonesRequestEffectiveScopes build(java.util.Map<String, ?> map) throws Exception {
            SearchRecursionZonesRequestEffectiveScopes self = new SearchRecursionZonesRequestEffectiveScopes();
            return TeaModel.build(map, self);
        }

        public SearchRecursionZonesRequestEffectiveScopes setEffectiveType(String effectiveType) {
            this.effectiveType = effectiveType;
            return this;
        }
        public String getEffectiveType() {
            return this.effectiveType;
        }

        public SearchRecursionZonesRequestEffectiveScopes setScope(java.util.List<String> scope) {
            this.scope = scope;
            return this;
        }
        public java.util.List<String> getScope() {
            return this.scope;
        }

    }

}
