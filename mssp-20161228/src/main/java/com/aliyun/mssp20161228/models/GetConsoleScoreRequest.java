// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetConsoleScoreRequest extends TeaModel {
    /**
     * <p>Filter time type, supports filtering by the last 7 days, last 30 days, last half year, or custom. If empty, it represents the last 7 days.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>month</p>
     */
    @NameInMap("DateType")
    public String dateType;

    /**
     * <p>End date.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1732156885986</p>
     */
    @NameInMap("EndDate")
    public Long endDate;

    /**
     * <p>Start date.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1729478485000</p>
     */
    @NameInMap("StartDate")
    public Long startDate;

    /**
     * <p>Source of alert events.</p>
     * 
     * <strong>example:</strong>
     * <p>该字段暂未使用，有问题请联系管理员</p>
     */
    @NameInMap("SuspEventSource")
    public String suspEventSource;

    public static GetConsoleScoreRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConsoleScoreRequest self = new GetConsoleScoreRequest();
        return TeaModel.build(map, self);
    }

    public GetConsoleScoreRequest setDateType(String dateType) {
        this.dateType = dateType;
        return this;
    }
    public String getDateType() {
        return this.dateType;
    }

    public GetConsoleScoreRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public GetConsoleScoreRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public GetConsoleScoreRequest setSuspEventSource(String suspEventSource) {
        this.suspEventSource = suspEventSource;
        return this;
    }
    public String getSuspEventSource() {
        return this.suspEventSource;
    }

}
