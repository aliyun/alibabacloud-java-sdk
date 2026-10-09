// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListParametersRequest extends TeaModel {
    /**
     * <p>The list of parameter IDs.</p>
     */
    @NameInMap("Ids")
    public java.util.List<Long> ids;

    /**
     * <p>The list of parameter names.</p>
     */
    @NameInMap("Names")
    public java.util.List<String> names;

    /**
     * <p>The account ID of the owner.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the workspace. You can call the ListProjects operation to obtain the workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The scope of the parameter. Default value: Project. Other types are not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Project</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>The list of fields by which to sort the results. Supported fields include modification time and creation time. The format is &quot;SortField+SortOrder(Desc/Asc)&quot;. You can omit Asc. Valid values:</p>
     * <ul>
     * <li>ModifyTime (Desc/Asc)</li>
     * <li>CreateTime (Desc/Asc)</li>
     * <li>Name (Desc/Asc)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ModifyTime Desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The parameter type. Valid values:</p>
     * <ul>
     * <li>PlainConstant: plaintext constant.</li>
     * <li>SecretConstant: ciphertext constant.</li>
     * <li>Variable: variable.</li>
     * </ul>
     * 
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
