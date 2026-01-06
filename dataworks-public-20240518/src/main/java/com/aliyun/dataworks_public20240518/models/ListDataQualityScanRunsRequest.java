// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataQualityScanRunsRequest extends TeaModel {
    /**
     * <p>The earliest time when the data quality monitor starts to run.</p>
     * 
     * <strong>example:</strong>
     * <p>1710239005403</p>
     */
    @NameInMap("CreateTimeFrom")
    public Long createTimeFrom;

    /**
     * <p>The latest time when the data quality monitor starts to run.</p>
     * 
     * <strong>example:</strong>
     * <p>1710239005403</p>
     */
    @NameInMap("CreateTimeTo")
    public Long createTimeTo;

    /**
     * <p>The ID of the data quality monitor.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("DataQualityScanId")
    public Long dataQualityScanId;

    /**
     * <p>The extended query filter. Supported parameters:</p>
     * <ul>
     * <li>TaskInstanceId</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;TaskInstanceId&quot;: 111L
     * }</p>
     */
    @NameInMap("Filter")
    public java.util.Map<String, ?> filter;

    /**
     * <p>The page number of the results. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of records per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The project ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The list of sorting fields. Supports fields such as last modified time and creation time. Format: &quot;SortField+SortOrder (Desc/Asc)&quot;, where Asc is the default. Valid values:</p>
     * <ul>
     * <li>CreateTime (Desc/Asc)</li>
     * <li>Id (Desc/Asc)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CreateTime Desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The status of the data quality check result.</p>
     * <ul>
     * <li>Pass</li>
     * <li>Running</li>
     * <li>Error</li>
     * <li>Fail</li>
     * <li>Warn</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Fail</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListDataQualityScanRunsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataQualityScanRunsRequest self = new ListDataQualityScanRunsRequest();
        return TeaModel.build(map, self);
    }

    public ListDataQualityScanRunsRequest setCreateTimeFrom(Long createTimeFrom) {
        this.createTimeFrom = createTimeFrom;
        return this;
    }
    public Long getCreateTimeFrom() {
        return this.createTimeFrom;
    }

    public ListDataQualityScanRunsRequest setCreateTimeTo(Long createTimeTo) {
        this.createTimeTo = createTimeTo;
        return this;
    }
    public Long getCreateTimeTo() {
        return this.createTimeTo;
    }

    public ListDataQualityScanRunsRequest setDataQualityScanId(Long dataQualityScanId) {
        this.dataQualityScanId = dataQualityScanId;
        return this;
    }
    public Long getDataQualityScanId() {
        return this.dataQualityScanId;
    }

    public ListDataQualityScanRunsRequest setFilter(java.util.Map<String, ?> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.Map<String, ?> getFilter() {
        return this.filter;
    }

    public ListDataQualityScanRunsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDataQualityScanRunsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataQualityScanRunsRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListDataQualityScanRunsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListDataQualityScanRunsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
