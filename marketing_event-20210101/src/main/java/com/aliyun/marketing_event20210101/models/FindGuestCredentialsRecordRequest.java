// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class FindGuestCredentialsRecordRequest extends TeaModel {
    @NameInMap("ActivityId")
    public String activityId;

    @NameInMap("DateTimeString")
    public String dateTimeString;

    @NameInMap("EndDateTime")
    public String endDateTime;

    @NameInMap("StartDateTime")
    public String startDateTime;

    public static FindGuestCredentialsRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        FindGuestCredentialsRecordRequest self = new FindGuestCredentialsRecordRequest();
        return TeaModel.build(map, self);
    }

    public FindGuestCredentialsRecordRequest setActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }
    public String getActivityId() {
        return this.activityId;
    }

    public FindGuestCredentialsRecordRequest setDateTimeString(String dateTimeString) {
        this.dateTimeString = dateTimeString;
        return this;
    }
    public String getDateTimeString() {
        return this.dateTimeString;
    }

    public FindGuestCredentialsRecordRequest setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
        return this;
    }
    public String getEndDateTime() {
        return this.endDateTime;
    }

    public FindGuestCredentialsRecordRequest setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }
    public String getStartDateTime() {
        return this.startDateTime;
    }

}
