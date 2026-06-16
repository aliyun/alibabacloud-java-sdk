// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListWorkspacesRequest extends TeaModel {
    /**
     * <p>The name of the workspace. Used to filter the results.</p>
     * 
     * <strong>example:</strong>
     * <p>intl_synonym_module</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The page number to return. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public String pageSize;

    /**
     * <p>The ID of the resource group to which the workspace belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek25sodlatnioq</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    public static ListWorkspacesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspacesRequest self = new ListWorkspacesRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkspacesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListWorkspacesRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListWorkspacesRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListWorkspacesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
