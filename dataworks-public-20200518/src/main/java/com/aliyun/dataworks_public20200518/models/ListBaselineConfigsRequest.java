// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListBaselineConfigsRequest extends TeaModel {
    /**
     * <p>The type of the baseline. Valid values: DAILY and HOURLY. A value of DAILY indicates that the baseline is a day-level baseline. A value of HOURLY indicates that the baseline is an hour-level baseline. Separate multiple baseline types with commas (,).</p>
     */
    @NameInMap("BaselineTypes")
    public String baselineTypes;

    /**
     * <p>The ID of the Alibaba Cloud account used by the baseline owner.</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The number of the page to return. Valid values: 1 to 30. Default value: 1.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 100. Default value: 10.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The priority of the baseline. Valid values: 1, 3, 5, 7, and 8. Separate multiple priorities with commas (,).</p>
     */
    @NameInMap("Priority")
    public String priority;

    /**
     * <p>The ID of the workspace. You can call the ListProjects operation to query the ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The keyword in the baseline name used to search for the baseline.</p>
     */
    @NameInMap("SearchText")
    public String searchText;

    /**
     * <p>Specifies whether to enable the baseline. Valid values: true and false.</p>
     */
    @NameInMap("Useflag")
    public Boolean useflag;

    public static ListBaselineConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBaselineConfigsRequest self = new ListBaselineConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListBaselineConfigsRequest setBaselineTypes(String baselineTypes) {
        this.baselineTypes = baselineTypes;
        return this;
    }
    public String getBaselineTypes() {
        return this.baselineTypes;
    }

    public ListBaselineConfigsRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
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

    public ListBaselineConfigsRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public ListBaselineConfigsRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListBaselineConfigsRequest setSearchText(String searchText) {
        this.searchText = searchText;
        return this;
    }
    public String getSearchText() {
        return this.searchText;
    }

    public ListBaselineConfigsRequest setUseflag(Boolean useflag) {
        this.useflag = useflag;
        return this;
    }
    public Boolean getUseflag() {
        return this.useflag;
    }

}
