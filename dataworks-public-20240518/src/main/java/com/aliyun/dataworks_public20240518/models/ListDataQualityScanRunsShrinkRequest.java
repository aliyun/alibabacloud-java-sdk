// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataQualityScanRunsShrinkRequest extends TeaModel {
    /**
     * <p>The earliest start time of the data quality monitoring run.</p>
     * 
     * <strong>example:</strong>
     * <p>1710239005403</p>
     */
    @NameInMap("CreateTimeFrom")
    public Long createTimeFrom;

    /**
     * <p>The latest start time of the data quality monitoring run.</p>
     * 
     * <strong>example:</strong>
     * <p>1710239005403</p>
     */
    @NameInMap("CreateTimeTo")
    public Long createTimeTo;

    /**
     * <p>The data quality monitoring ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("DataQualityScanId")
    public Long dataQualityScanId;

    /**
     * <p>The extension query filter. The following filter parameters are supported:</p>
     * <ul>
     * <li>TaskInstanceId: the scheduling node instance ID.</li>
     * <li>RunNumber: the number of times the instance has run.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;TaskInstanceId&quot;: &quot;111&quot;,
     *     &quot;RunNumber&quot;: &quot;1&quot;
     * }</p>
     */
    @NameInMap("Filter")
    public String filterShrink;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
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
     * <p>The list of sort fields. Fields such as modification time and creation time are supported. The format is &quot;SortField+SortOrder(Desc/Asc)&quot;. The default value is Asc, which can be omitted. Valid values for the sort field:</p>
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
     * <p>The status of the data quality check result. Valid values:</p>
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

    public static ListDataQualityScanRunsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataQualityScanRunsShrinkRequest self = new ListDataQualityScanRunsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListDataQualityScanRunsShrinkRequest setCreateTimeFrom(Long createTimeFrom) {
        this.createTimeFrom = createTimeFrom;
        return this;
    }
    public Long getCreateTimeFrom() {
        return this.createTimeFrom;
    }

    public ListDataQualityScanRunsShrinkRequest setCreateTimeTo(Long createTimeTo) {
        this.createTimeTo = createTimeTo;
        return this;
    }
    public Long getCreateTimeTo() {
        return this.createTimeTo;
    }

    public ListDataQualityScanRunsShrinkRequest setDataQualityScanId(Long dataQualityScanId) {
        this.dataQualityScanId = dataQualityScanId;
        return this;
    }
    public Long getDataQualityScanId() {
        return this.dataQualityScanId;
    }

    public ListDataQualityScanRunsShrinkRequest setFilterShrink(String filterShrink) {
        this.filterShrink = filterShrink;
        return this;
    }
    public String getFilterShrink() {
        return this.filterShrink;
    }

    public ListDataQualityScanRunsShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDataQualityScanRunsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataQualityScanRunsShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListDataQualityScanRunsShrinkRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListDataQualityScanRunsShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
