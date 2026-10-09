// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListParametersShrinkRequest extends TeaModel {
    /**
     * <p>The list of parameter IDs.</p>
     */
    @NameInMap("Ids")
    public String idsShrink;

    /**
     * <p>The list of parameter names.</p>
     */
    @NameInMap("Names")
    public String namesShrink;

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
