// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.educloud20220202.models;

import com.aliyun.tea.*;

public class AddLabReservedRequest extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("LabId")
    public String labId;

    @NameInMap("Number")
    public Long number;

    @NameInMap("StartTime")
    public Long startTime;

    public static AddLabReservedRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLabReservedRequest self = new AddLabReservedRequest();
        return TeaModel.build(map, self);
    }

    public AddLabReservedRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public AddLabReservedRequest setLabId(String labId) {
        this.labId = labId;
        return this;
    }
    public String getLabId() {
        return this.labId;
    }

    public AddLabReservedRequest setNumber(Long number) {
        this.number = number;
        return this;
    }
    public Long getNumber() {
        return this.number;
    }

    public AddLabReservedRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
