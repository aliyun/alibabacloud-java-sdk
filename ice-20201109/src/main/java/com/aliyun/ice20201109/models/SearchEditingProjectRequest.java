// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SearchEditingProjectRequest extends TeaModel {
    /**
     * <p>The creation source. Valid values:</p>
     * <ul>
     * <li><p>OpenAPI: OpenAPI.</p>
     * </li>
     * <li><p>AliyunConsole: Alibaba Cloud console.</p>
     * </li>
     * <li><p>WebSDK: WebSDK.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>WebSDK</p>
     */
    @NameInMap("CreateSource")
    public String createSource;

    /**
     * <p>The end time of the creation time. The time is in the yyyy-MM-ddTHH:mm:ssZ format (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2017-01-11T12:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The type of the editing project. Default value: EditingProject.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>EditingProject: Standard editing project. This is the default value.</p>
     * </li>
     * <li><p>LiveEditingProject: Live editing project.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>EditingProject</p>
     */
    @NameInMap("ProjectType")
    public String projectType;

    /**
     * <p>The sorting method for the results. Valid values:</p>
     * <ul>
     * <li><p>CreationTime:Desc: Sort by creation time in descending order. This is the default value.</p>
     * </li>
     * <li><p>CreationTime:Asc: Sort by creation time in ascending order.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CreationTime:Desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The start time of the creation time. The time is in the yyyy-MM-ddTHH:mm:ssZ format (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2017-01-11T12:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The status of the cloud editing project. Separate multiple values with commas (,). By default, all cloud editing projects are retrieved.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>Draft: draft.</p>
     * </li>
     * <li><p>Producing: producing.</p>
     * </li>
     * <li><p>Produced: produced.</p>
     * </li>
     * <li><p>ProduceFailed: production failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Producing</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The templatetype. Valid values:</p>
     * <ul>
     * <li><p>Timeline: timeline.</p>
     * </li>
     * <li><p>VETemplate: advanced template.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Timeline</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    public static SearchEditingProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchEditingProjectRequest self = new SearchEditingProjectRequest();
        return TeaModel.build(map, self);
    }

    public SearchEditingProjectRequest setCreateSource(String createSource) {
        this.createSource = createSource;
        return this;
    }
    public String getCreateSource() {
        return this.createSource;
    }

    public SearchEditingProjectRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public SearchEditingProjectRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public SearchEditingProjectRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public SearchEditingProjectRequest setProjectType(String projectType) {
        this.projectType = projectType;
        return this;
    }
    public String getProjectType() {
        return this.projectType;
    }

    public SearchEditingProjectRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public SearchEditingProjectRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public SearchEditingProjectRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SearchEditingProjectRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
