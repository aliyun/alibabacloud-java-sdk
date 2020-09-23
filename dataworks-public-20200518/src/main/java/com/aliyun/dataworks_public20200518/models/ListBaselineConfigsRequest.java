// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListBaselineConfigsRequest extends TeaModel {
    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Owner")
    public String owner;

    @NameInMap("ProjectId")
    @Validation(required = true)
    public Long projectId;

    @NameInMap("Priority")
    public String priority;

    @NameInMap("Useflag")
    public Boolean useflag;

    @NameInMap("BaselineTypes")
    public String baselineTypes;

    @NameInMap("SearchText")
    public String searchText;

    public static ListBaselineConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBaselineConfigsRequest self = new ListBaselineConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListBaselineConfigsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListBaselineConfigsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListBaselineConfigsRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ListBaselineConfigsRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListBaselineConfigsRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public ListBaselineConfigsRequest setUseflag(Boolean useflag) {
        this.useflag = useflag;
        return this;
    }
    public Boolean getUseflag() {
        return this.useflag;
    }

    public ListBaselineConfigsRequest setBaselineTypes(String baselineTypes) {
        this.baselineTypes = baselineTypes;
        return this;
    }
    public String getBaselineTypes() {
        return this.baselineTypes;
    }

    public ListBaselineConfigsRequest setSearchText(String searchText) {
        this.searchText = searchText;
        return this;
    }
    public String getSearchText() {
        return this.searchText;
    }

}
