// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class ListSkillsRequest extends TeaModel {
    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400-e29b-41d4-a716-446655440000</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The field by which to sort the results. Set the value to download_count to sort by download count. Default value: gmt_modified.</p>
     * 
     * <strong>example:</strong>
     * <p>download_count</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>Filters results by owner.</p>
     * 
     * <strong>example:</strong>
     * <p>user123</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Filters results by visibility. Valid values:</p>
     * <ul>
     * <li>PUBLIC: public</li>
     * <li>PRIVATE: private.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>The search mode. Valid values:</p>
     * <ul>
     * <li>accurate: exact match</li>
     * <li>blur: fuzzy match.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>blur</p>
     */
    @NameInMap("Search")
    public String search;

    /**
     * <p>The filter keyword.</p>
     * 
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
