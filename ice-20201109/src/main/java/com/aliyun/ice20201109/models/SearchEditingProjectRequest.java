// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SearchEditingProjectRequest extends TeaModel {
    /**
     * <p>The source of the project.</p>
     * <p>\-OpenAPI</p>
     * <p>\-AliyunConsole</p>
     * <p>\-WebSDK</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>AliyunConsole: The project is created in the Alibaba Cloud console.</li>
     * <li>WebSDK: The project is created by using the SDK for Web.</li>
     * <li>OpenAPI: The project is created by calling API operations.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>WebSDK</p>
     */
    @NameInMap("CreateSource")
    public String createSource;

    /**
     * <p>The end of the time range to query. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
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
     * <p>The number of entries per page. Default value: 10. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The type of the editing project. Default value: EditingProject. Valid values:</p>
     * <ul>
     * <li>EditingProject: a regular editing project.</li>
     * <li>LiveEditingProject: a live stream editing project.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>EditingProject</p>
     */
    @NameInMap("ProjectType")
    public String projectType;

    /**
     * <p>The sorting rule of results. Valid values:</p>
     * <p>\- CreationTime:Desc (default): The results are sorted in reverse chronological order based on the creation time.</p>
     * <p>\- CreationTime:Asc: The results are sorted in chronological order based on the creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>CreationTime:Desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The beginning of the time range to query. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-01-11T12:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The status of the online editing project. Separate multiple values with commas (,). By default, all online editing projects are queried.</p>
     * <p>Valid values:</p>
     * <p>\-Draft</p>
     * <p>\-Producing</p>
     * <p>\-Produced</p>
     * <p>\-ProduceFailed</p>
     * 
     * <strong>example:</strong>
     * <p>Producing</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The template type. Valid values:</p>
     * <p>\-Timeline</p>
     * <p>\-VETemplate</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Timeline: regular template.</li>
     * <li>VETemplate: advanced template.</li>
     * <li>None: No template is used.</li>
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
