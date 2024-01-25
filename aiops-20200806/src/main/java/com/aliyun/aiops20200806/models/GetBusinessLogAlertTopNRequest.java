// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetBusinessLogAlertTopNRequest extends TeaModel {
    @NameInMap("AlertType")
    public String alertType;

    @NameInMap("EventId")
    public String eventId;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("TopNum")
    public Long topNum;

    public static GetBusinessLogAlertTopNRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBusinessLogAlertTopNRequest self = new GetBusinessLogAlertTopNRequest();
        return TeaModel.build(map, self);
    }

    public GetBusinessLogAlertTopNRequest setAlertType(String alertType) {
        this.alertType = alertType;
        return this;
    }
    public String getAlertType() {
        return this.alertType;
    }

    public GetBusinessLogAlertTopNRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public GetBusinessLogAlertTopNRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public GetBusinessLogAlertTopNRequest setTopNum(Long topNum) {
        this.topNum = topNum;
        return this;
    }
    public Long getTopNum() {
        return this.topNum;
    }

}
