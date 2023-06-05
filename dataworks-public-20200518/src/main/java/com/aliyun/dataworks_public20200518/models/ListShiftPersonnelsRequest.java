// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListShiftPersonnelsRequest extends TeaModel {
    /**
     * <p>The time when the on-duty engineer ends a shift. Set the value to a UNIX timestamp.</p>
     */
    @NameInMap("BeginTime")
    public Long beginTime;

    /**
     * <p>The ID of the request. You can use the ID to troubleshoot issues.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The time when the on-duty engineer starts a shift. Set the value to a UNIX timestamp.</p>
     */
    @NameInMap("ShiftPersonUID")
    public String shiftPersonUID;

    /**
     * <p>The type of on-duty engineers that you want to query. Valid values: ALL, PRIMARY, BACKUP, and DESIGNATED_USER.</p>
     */
    @NameInMap("ShiftScheduleIdentifier")
    public String shiftScheduleIdentifier;

    /**
     * <p>The ID of your Alibaba Cloud account. You can log on to the DataWorks console and move the pointer over the profile picture in the upper-right corner to obtain the ID.</p>
     */
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
