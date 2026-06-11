// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class ListSkillsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400-e29b-41d4-a716-446655440000</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <strong>example:</strong>
     * <p>download_count</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <strong>example:</strong>
     * <p>user123</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <strong>example:</strong>
     * <p>blur</p>
     */
    @NameInMap("Search")
    public String search;

    /**
     * <strong>example:</strong>
     * <p>customer</p>
     */
    @NameInMap("SkillName")
    public String skillName;

    public static ListSkillsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSkillsRequest self = new ListSkillsRequest();
        return TeaModel.build(map, self);
    }

    public ListSkillsRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public ListSkillsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListSkillsRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ListSkillsRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListSkillsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSkillsRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public ListSkillsRequest setSearch(String search) {
        this.search = search;
        return this;
    }
    public String getSearch() {
        return this.search;
    }

    public ListSkillsRequest setSkillName(String skillName) {
        this.skillName = skillName;
        return this;
    }
    public String getSkillName() {
        return this.skillName;
    }

}
