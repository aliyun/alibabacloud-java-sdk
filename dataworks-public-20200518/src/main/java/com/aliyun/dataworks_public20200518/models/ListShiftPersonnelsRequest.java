// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListShiftPersonnelsRequest extends TeaModel {
    @NameInMap("BeginTime")
    public Long beginTime;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("ShiftPersonUID")
    public String shiftPersonUID;

    @NameInMap("ShiftScheduleIdentifier")
    public String shiftScheduleIdentifier;

    @NameInMap("UserType")
    public String userType;

    public static ListShiftPersonnelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListShiftPersonnelsRequest self = new ListShiftPersonnelsRequest();
        return TeaModel.build(map, self);
    }

    public ListShiftPersonnelsRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public ListShiftPersonnelsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListShiftPersonnelsRequest setShiftPersonUID(String shiftPersonUID) {
        this.shiftPersonUID = shiftPersonUID;
        return this;
    }
    public String getShiftPersonUID() {
        return this.shiftPersonUID;
    }

    public ListShiftPersonnelsRequest setShiftScheduleIdentifier(String shiftScheduleIdentifier) {
        this.shiftScheduleIdentifier = shiftScheduleIdentifier;
        return this;
    }
    public String getShiftScheduleIdentifier() {
        return this.shiftScheduleIdentifier;
    }

    public ListShiftPersonnelsRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

}
