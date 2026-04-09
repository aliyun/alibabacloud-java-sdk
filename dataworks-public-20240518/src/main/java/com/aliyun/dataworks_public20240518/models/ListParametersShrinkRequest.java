// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListParametersShrinkRequest extends TeaModel {
    @NameInMap("Ids")
    public String idsShrink;

    @NameInMap("Names")
    public String namesShrink;

    /**
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <strong>example:</strong>
     * <p>Project</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <strong>example:</strong>
     * <p>ModifyTime Desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <strong>example:</strong>
     * <p>PlainConstant</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListParametersShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListParametersShrinkRequest self = new ListParametersShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListParametersShrinkRequest setIdsShrink(String idsShrink) {
        this.idsShrink = idsShrink;
        return this;
    }
    public String getIdsShrink() {
        return this.idsShrink;
    }

    public ListParametersShrinkRequest setNamesShrink(String namesShrink) {
        this.namesShrink = namesShrink;
        return this;
    }
    public String getNamesShrink() {
        return this.namesShrink;
    }

    public ListParametersShrinkRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ListParametersShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListParametersShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListParametersShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListParametersShrinkRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public ListParametersShrinkRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListParametersShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
