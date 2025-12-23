// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QueryIpcQuotaRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>understand</p>
     */
    @NameInMap("Capability")
    public String capability;

    /**
     * <strong>example:</strong>
     * <p>2025-05-09T08:52:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
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
