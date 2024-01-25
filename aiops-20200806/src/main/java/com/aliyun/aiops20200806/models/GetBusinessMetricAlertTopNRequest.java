// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetBusinessMetricAlertTopNRequest extends TeaModel {
    @NameInMap("AlertType")
    public String alertType;

    @NameInMap("EventId")
    public String eventId;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("TopNum")
    public Long topNum;

    public static GetBusinessMetricAlertTopNRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBusinessMetricAlertTopNRequest self = new GetBusinessMetricAlertTopNRequest();
        return TeaModel.build(map, self);
    }

    public GetBusinessMetricAlertTopNRequest setAlertType(String alertType) {
        this.alertType = alertType;
        return this;
    }
    public String getAlertType() {
        return this.alertType;
    }

    public GetBusinessMetricAlertTopNRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public GetBusinessMetricAlertTopNRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public GetBusinessMetricAlertTopNRequest setTopNum(Long topNum) {
        this.topNum = topNum;
        return this;
    }
    public Long getTopNum() {
        return this.topNum;
    }

}
