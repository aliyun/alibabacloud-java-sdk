// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetAttackedAssetDealRequest extends TeaModel {
    /**
     * <p>Time filter type, supporting filtering by the last 7 days, the last 30 days, the last half year, or custom time periods.</p>
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
     * <p>1732268720000</p>
     */
    @NameInMap("EndDate")
    public Long endDate;

    /**
     * <p>Start time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1732268720000</p>
     */
    @NameInMap("StartDate")
    public Long startDate;

    /**
     * <p>Source of the alert event.</p>
     * 
     * <strong>example:</strong>
     * <p>暂时无需传参，有问题请联系管理员</p>
     */
    @NameInMap("SuspEventSource")
    public String suspEventSource;

    public static GetAttackedAssetDealRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAttackedAssetDealRequest self = new GetAttackedAssetDealRequest();
        return TeaModel.build(map, self);
    }

    public GetAttackedAssetDealRequest setDateType(String dateType) {
        this.dateType = dateType;
        return this;
    }
    public String getDateType() {
        return this.dateType;
    }

    public GetAttackedAssetDealRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public GetAttackedAssetDealRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public GetAttackedAssetDealRequest setSuspEventSource(String suspEventSource) {
        this.suspEventSource = suspEventSource;
        return this;
    }
    public String getSuspEventSource() {
        return this.suspEventSource;
    }

}
