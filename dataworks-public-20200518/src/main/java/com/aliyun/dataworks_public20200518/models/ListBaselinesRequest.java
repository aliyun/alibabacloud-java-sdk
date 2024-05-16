// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListBaselinesRequest extends TeaModel {
    @NameInMap("BaselineTypes")
    public String baselineTypes;

    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("Owner")
    public String owner;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Priority")
    public String priority;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("SearchText")
    public String searchText;

    public static ListBaselinesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBaselinesRequest self = new ListBaselinesRequest();
        return TeaModel.build(map, self);
    }

    public ListBaselinesRequest setBaselineTypes(String baselineTypes) {
        this.baselineTypes = baselineTypes;
        return this;
    }
    public String getBaselineTypes() {
        return this.baselineTypes;
    }

    public ListBaselinesRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public ListBaselinesRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ListBaselinesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListBaselinesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListBaselinesRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public ListBaselinesRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListBaselinesRequest setSearchText(String searchText) {
        this.searchText = searchText;
        return this;
    }
    public String getSearchText() {
        return this.searchText;
    }

}
