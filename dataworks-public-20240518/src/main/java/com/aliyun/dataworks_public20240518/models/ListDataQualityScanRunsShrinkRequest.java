// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataQualityScanRunsShrinkRequest extends TeaModel {
    /**
     * <p>The earliest start time of a data quality scan run to include in the results. Specify the time as a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1710239005403</p>
     */
    @NameInMap("CreateTimeFrom")
    public Long createTimeFrom;

    /**
     * <p>The latest start time of a data quality scan run to include in the results. Specify the time as a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1710239005403</p>
     */
    @NameInMap("CreateTimeTo")
    public Long createTimeTo;

    /**
     * <p>The ID of the data quality scan.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("DataQualityScanId")
    public Long dataQualityScanId;

    /**
     * <p>An object with advanced filter conditions. The following parameters are supported:</p>
     * <ul>
     * <li><p><code>TaskInstanceId</code>: The ID of the task instance.</p>
     * </li>
     * <li><p><code>RunNumber</code>: The run number of the instance.</p>
     * </li>
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
     * <p>The page number to return. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 10.</p>
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
     * <p>The sort field and order for the results. The format is <code>FieldName Order</code>. The default order is ascending (Asc). Supported fields:</p>
     * <ul>
     * <li><p>CreateTime (Desc/Asc)</p>
     * </li>
     * <li><p>Id (Desc/Asc)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CreateTime Desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The status of the data quality scan run. Valid values:</p>
     * <ul>
     * <li><p>Pass</p>
     * </li>
     * <li><p>Running</p>
     * </li>
     * <li><p>Error</p>
     * </li>
     * <li><p>Fail</p>
     * </li>
     * <li><p>Warn</p>
     * </li>
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
