// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetVideoListRequest extends TeaModel {
    /**
     * <p>The category ID.</p>
     * 
     * <strong>example:</strong>
     * <p>781111</p>
     */
    @NameInMap("CateId")
    public Long cateId;

    /**
     * <p>The end time of the creation time. The end time must be later than the start time. The time is in the yyyy-MM-ddTHH:mm:ssZ format and must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-01-11T12:59:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The current page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The sort order of the query results. Valid values:</p>
     * <ul>
     * <li>CreationTime:Desc: Sorts the results by creation time in descending order. This is the default value.</li>
     * <li>CreationTime:Asc: Sorts the results by creation time in ascending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CreationTime:Asc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The start time of the creation time. The time is in the yyyy-MM-ddTHH:mm:ssZ format and must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-01-11T12:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The video status. Separate multiple statuses with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>Uploading,Normal</p>
     */
    @NameInMap("Status")
    public String status;

    public static GetVideoListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVideoListRequest self = new GetVideoListRequest();
        return TeaModel.build(map, self);
    }

    public GetVideoListRequest setCateId(Long cateId) {
        this.cateId = cateId;
        return this;
    }
    public Long getCateId() {
        return this.cateId;
    }

    public GetVideoListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetVideoListRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetVideoListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetVideoListRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public GetVideoListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetVideoListRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
