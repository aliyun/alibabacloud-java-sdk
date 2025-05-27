// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eduembed20240101.models;

import com.aliyun.tea.*;

public class CreateLabReservationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>16600</p>
     */
    @NameInMap("AccountId")
    public Long accountId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-04-29 18:00:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>875</p>
     */
    @NameInMap("LabId")
    public Long labId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MemberCount")
    public Long memberCount;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-04-29 16:00:00</p>
     */
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
