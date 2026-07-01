// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QueryIpcQuotaRequest extends TeaModel {
    /**
     * <p>Capability. Default value is understand. Valid values:</p>
     * <ul>
     * <li><p>understand: understanding</p>
     * </li>
     * <li><p>understand-reid: understanding with reid</p>
     * </li>
     * <li><p>search: search</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>understand</p>
     */
    @NameInMap("Capability")
    public String capability;

    /**
     * <p>End time. UTC time in the format: yyyy-MM-ddTHH:mm:ssZ. The difference between EndTime and StartTime must not exceed 180 days.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-05-09T08:52:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Page number for paging. Default Value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>Page size, which specifies the number of entries displayed per page. Default value is 10, and the maximum value is 50.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Start Time. UTC time in the format: yyyy-MM-ddTHH:mm:ssZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-05-08T08:52:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static QueryIpcQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIpcQuotaRequest self = new QueryIpcQuotaRequest();
        return TeaModel.build(map, self);
    }

    public QueryIpcQuotaRequest setCapability(String capability) {
        this.capability = capability;
        return this;
    }
    public String getCapability() {
        return this.capability;
    }

    public QueryIpcQuotaRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryIpcQuotaRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryIpcQuotaRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryIpcQuotaRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
