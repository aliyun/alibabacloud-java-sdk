// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListParametersShrinkRequest extends TeaModel {
    /**
     * <p>A list of parameter IDs.</p>
     */
    @NameInMap("Ids")
    public String idsShrink;

    /**
     * <p>A list of parameter names.</p>
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
     * <p>The page number. Default: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The workspace ID. Call the ListProjects operation to get the workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The scope of the parameter. The default value is Project. Other values are not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Project</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>The field to sort the parameters by. Specify the value in the &quot;FieldName SortOrder&quot; format. The Asc sort order is optional. Supported values are:</p>
     * <ul>
     * <li><p>ModifyTime (Desc/Asc)</p>
     * </li>
     * <li><p>CreateTime (Desc/Asc)</p>
     * </li>
     * <li><p>Name (Desc/Asc)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ModifyTime Desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The type of the parameter. Valid values:</p>
     * <ul>
     * <li><p>PlainConstant: A plaintext constant.</p>
     * </li>
     * <li><p>SecretConstant: A secret constant.</p>
     * </li>
     * <li><p>Variable: A variable.</p>
     * </li>
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
