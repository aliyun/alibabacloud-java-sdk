// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListContactGroupsRequest extends TeaModel {
    @NameInMap("contactGroupIds")
    public java.util.List<String> contactGroupIds;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    @NameInMap("workspace")
    public String workspace;

    public static ListContactGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListContactGroupsRequest self = new ListContactGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListContactGroupsRequest setContactGroupIds(java.util.List<String> contactGroupIds) {
        this.contactGroupIds = contactGroupIds;
        return this;
    }
    public java.util.List<String> getContactGroupIds() {
        return this.contactGroupIds;
    }

    public ListContactGroupsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListContactGroupsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListContactGroupsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListContactGroupsRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
