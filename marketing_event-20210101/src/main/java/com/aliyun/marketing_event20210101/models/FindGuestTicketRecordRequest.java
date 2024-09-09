// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class FindGuestTicketRecordRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>34434</p>
     */
    @NameInMap("ActivityId")
    public String activityId;

    /**
     * <strong>example:</strong>
     * <p>2023-09-04 15:14:00</p>
     */
    @NameInMap("DateTimeString")
    public String dateTimeString;

    @NameInMap("EndDateTime")
    public String endDateTime;

    @NameInMap("StartDateTime")
    public String startDateTime;

    public static FindGuestTicketRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        FindGuestTicketRecordRequest self = new FindGuestTicketRecordRequest();
        return TeaModel.build(map, self);
    }

    public FindGuestTicketRecordRequest setActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }
    public String getActivityId() {
        return this.activityId;
    }

    public FindGuestTicketRecordRequest setDateTimeString(String dateTimeString) {
        this.dateTimeString = dateTimeString;
        return this;
    }
    public String getDateTimeString() {
        return this.dateTimeString;
    }

    public FindGuestTicketRecordRequest setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
        return this;
    }
    public String getEndDateTime() {
        return this.endDateTime;
    }

    public FindGuestTicketRecordRequest setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }
    public String getStartDateTime() {
        return this.startDateTime;
    }

}
