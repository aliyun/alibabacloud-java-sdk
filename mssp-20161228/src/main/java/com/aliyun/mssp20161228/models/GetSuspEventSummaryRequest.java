// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetSuspEventSummaryRequest extends TeaModel {
    /**
     * <p>Filter time type. Supports filtering by the last 7 days, the last 30 days, the last half year, or custom time ranges.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>month</p>
     */
    @NameInMap("DateType")
    public String dateType;

    /**
     * <p>End time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1732156885986</p>
     */
    @NameInMap("EndDate")
    public Long endDate;

    /**
     * <p>Start time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1729478485000</p>
     */
    @NameInMap("StartDate")
    public Long startDate;

    /**
     * <p>Alert event source.</p>
     * 
     * <strong>example:</strong>
     * <p>SUSP_EVENT</p>
     */
    @NameInMap("SuspEventSource")
    public String suspEventSource;

    public static GetSuspEventSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSuspEventSummaryRequest self = new GetSuspEventSummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetSuspEventSummaryRequest setDateType(String dateType) {
        this.dateType = dateType;
        return this;
    }
    public String getDateType() {
        return this.dateType;
    }

    public GetSuspEventSummaryRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public GetSuspEventSummaryRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public GetSuspEventSummaryRequest setSuspEventSource(String suspEventSource) {
        this.suspEventSource = suspEventSource;
        return this;
    }
    public String getSuspEventSource() {
        return this.suspEventSource;
    }

}
