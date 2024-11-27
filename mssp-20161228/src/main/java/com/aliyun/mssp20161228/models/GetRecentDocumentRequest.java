// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetRecentDocumentRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DateType")
    public String dateType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndDate")
    public Long endDate;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartDate")
    public Long startDate;

    @NameInMap("SuspEventSource")
    public String suspEventSource;

    public static GetRecentDocumentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRecentDocumentRequest self = new GetRecentDocumentRequest();
        return TeaModel.build(map, self);
    }

    public GetRecentDocumentRequest setDateType(String dateType) {
        this.dateType = dateType;
        return this;
    }
    public String getDateType() {
        return this.dateType;
    }

    public GetRecentDocumentRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public GetRecentDocumentRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public GetRecentDocumentRequest setSuspEventSource(String suspEventSource) {
        this.suspEventSource = suspEventSource;
        return this;
    }
    public String getSuspEventSource() {
        return this.suspEventSource;
    }

}
