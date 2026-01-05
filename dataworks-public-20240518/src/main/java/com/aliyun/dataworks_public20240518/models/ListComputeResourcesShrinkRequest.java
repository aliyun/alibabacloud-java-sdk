// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListComputeResourcesShrinkRequest extends TeaModel {
    /**
     * <p>The environment type of the computing resource. Valid values:</p>
     * <ul>
     * <li>Dev</li>
     * <li>Prod</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Dev</p>
     */
    @NameInMap("EnvType")
    public String envType;

    /**
     * <p>The name of the computing resource.</p>
     * 
     * <strong>example:</strong>
     * <p>category name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The sort direction of the computing resource list. Valid values:</p>
     * <ul>
     * <li>Desc: descending order.</li>
     * <li>Asc: ascending order.</li>
     * </ul>
     * <p>Default value: Desc</p>
     * 
     * <strong>example:</strong>
     * <p>Asc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number to query. The default value is 1, which indicates the first page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. The default value is 10, and the maximum value is 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the DataWorks workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>21229</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The field to sort the computing resource list by. Supported fields include name, creation time, and computing resource ID.</p>
     * <ul>
     * <li>CreateTime: Sorts by creation time</li>
     * <li>Id: Sorts by computing resource ID</li>
     * <li>Name: Sorts by computing resource name.</li>
     * <li>CreateTimeWithDefaultFirst: Sorts based on whether it is the default resource and by creation time, with the default computing resource listed first.</li>
     * </ul>
     * <p>Default value: CreateTime</p>
     * 
     * <strong>example:</strong>
     * <p>CreateTimeWithDefaultFirst</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The filter for computing resource types. You can configure multiple types for filtering.</p>
     */
    @NameInMap("Types")
    public String typesShrink;

    public static ListComputeResourcesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListComputeResourcesShrinkRequest self = new ListComputeResourcesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListComputeResourcesShrinkRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public ListComputeResourcesShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListComputeResourcesShrinkRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListComputeResourcesShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListComputeResourcesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListComputeResourcesShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListComputeResourcesShrinkRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListComputeResourcesShrinkRequest setTypesShrink(String typesShrink) {
        this.typesShrink = typesShrink;
        return this;
    }
    public String getTypesShrink() {
        return this.typesShrink;
    }

}
