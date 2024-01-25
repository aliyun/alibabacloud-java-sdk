// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetAlertDetailTrendDataRequest extends TeaModel {
    @NameInMap("AbnormalId")
    public Long abnormalId;

    @NameInMap("AlertId")
    public Long alertId;

    @NameInMap("BeginTime")
    public Long beginTime;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("OperaUid")
    public String operaUid;

    public static GetAlertDetailTrendDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlertDetailTrendDataRequest self = new GetAlertDetailTrendDataRequest();
        return TeaModel.build(map, self);
    }

    public GetAlertDetailTrendDataRequest setAbnormalId(Long abnormalId) {
        this.abnormalId = abnormalId;
        return this;
    }
    public Long getAbnormalId() {
        return this.abnormalId;
    }

    public GetAlertDetailTrendDataRequest setAlertId(Long alertId) {
        this.alertId = alertId;
        return this;
    }
    public Long getAlertId() {
        return this.alertId;
    }

    public GetAlertDetailTrendDataRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public GetAlertDetailTrendDataRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetAlertDetailTrendDataRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
