// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDutyRosterRequest extends TeaModel {
    @NameInMap("BeginTime")
    public Long beginTime;

    @NameInMap("DutyRosterIdentifier")
    public String dutyRosterIdentifier;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("UserType")
    public String userType;

    @NameInMap("Watchkeeper")
    public String watchkeeper;

    public static GetDutyRosterRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDutyRosterRequest self = new GetDutyRosterRequest();
        return TeaModel.build(map, self);
    }

    public GetDutyRosterRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public GetDutyRosterRequest setDutyRosterIdentifier(String dutyRosterIdentifier) {
        this.dutyRosterIdentifier = dutyRosterIdentifier;
        return this;
    }
    public String getDutyRosterIdentifier() {
        return this.dutyRosterIdentifier;
    }

    public GetDutyRosterRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetDutyRosterRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public GetDutyRosterRequest setWatchkeeper(String watchkeeper) {
        this.watchkeeper = watchkeeper;
        return this;
    }
    public String getWatchkeeper() {
        return this.watchkeeper;
    }

}
