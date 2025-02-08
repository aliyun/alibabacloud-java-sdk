// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListBaselineConfigsRequest extends TeaModel {
    /**
     * <p>The type of the baseline. Valid values: DAILY and HOURLY. Separate multiple baseline types with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>DAILY,HOURLY</p>
     */
    @NameInMap("BaselineTypes")
    public String baselineTypes;

    /**
     * <p>The ID of the Alibaba Cloud account used by the baseline owner.</p>
     * 
     * <strong>example:</strong>
     * <p>95279527****</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The page number. Valid values: 1 to 30. Default value: 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The priority of the baseline. Valid values: {1,3,5,7,8}. Separate multiple priorities with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>1,3,5,7,8</p>
     */
    @NameInMap("Priority")
    public String priority;

    /**
     * <p>The workspace ID. You can call the ListProjects operation to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The keyword in the baseline name, which is used to search for the baseline.</p>
     * 
     * <strong>example:</strong>
     * <p>Baseline name search keywords</p>
     */
    @NameInMap("SearchText")
    public String searchText;

    /**
     * <p>Specifies whether to enable the baseline. Valid values: true and false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
