// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eduembed20240101.models;

import com.aliyun.tea.*;

public class CreateLabReservationRequest extends TeaModel {
    @NameInMap("AccountId")
    public Long accountId;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("LabId")
    public Long labId;

    @NameInMap("MemberCount")
    public Long memberCount;

    @NameInMap("StartTime")
    public String startTime;

    public static CreateLabReservationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLabReservationRequest self = new CreateLabReservationRequest();
        return TeaModel.build(map, self);
    }

    public CreateLabReservationRequest setAccountId(Long accountId) {
        this.accountId = accountId;
        return this;
    }
    public Long getAccountId() {
        return this.accountId;
    }

    public CreateLabReservationRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateLabReservationRequest setLabId(Long labId) {
        this.labId = labId;
        return this;
    }
    public Long getLabId() {
        return this.labId;
    }

    public CreateLabReservationRequest setMemberCount(Long memberCount) {
        this.memberCount = memberCount;
        return this;
    }
    public Long getMemberCount() {
        return this.memberCount;
    }

    public CreateLabReservationRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
