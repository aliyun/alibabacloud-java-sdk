// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataQualityScanRunsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1710239005403</p>
     */
    @NameInMap("CreateTimeFrom")
    public Long createTimeFrom;

    /**
     * <strong>example:</strong>
     * <p>1710239005403</p>
     */
    @NameInMap("CreateTimeTo")
    public Long createTimeTo;

    /**
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("DataQualityScanId")
    public Long dataQualityScanId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <strong>example:</strong>
     * <p>CreateTime Desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
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
