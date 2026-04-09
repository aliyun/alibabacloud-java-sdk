// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListParametersRequest extends TeaModel {
    @NameInMap("Ids")
    public java.util.List<Long> ids;

    @NameInMap("Names")
    public java.util.List<String> names;

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

    public static ListParametersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListParametersRequest self = new ListParametersRequest();
        return TeaModel.build(map, self);
    }

    public ListParametersRequest setIds(java.util.List<Long> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<Long> getIds() {
        return this.ids;
    }

    public ListParametersRequest setNames(java.util.List<String> names) {
        this.names = names;
        return this;
    }
    public java.util.List<String> getNames() {
        return this.names;
    }

    public ListParametersRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ListParametersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListParametersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListParametersRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListParametersRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public ListParametersRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListParametersRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
