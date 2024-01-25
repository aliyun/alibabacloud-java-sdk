// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetPatrolInspectionDetailThrendDataRequest extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("RequestContent")
    public String requestContent;

    @NameInMap("StartTime")
    public Long startTime;

    public static GetPatrolInspectionDetailThrendDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPatrolInspectionDetailThrendDataRequest self = new GetPatrolInspectionDetailThrendDataRequest();
        return TeaModel.build(map, self);
    }

    public GetPatrolInspectionDetailThrendDataRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetPatrolInspectionDetailThrendDataRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public GetPatrolInspectionDetailThrendDataRequest setRequestContent(String requestContent) {
        this.requestContent = requestContent;
        return this;
    }
    public String getRequestContent() {
        return this.requestContent;
    }

    public GetPatrolInspectionDetailThrendDataRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
