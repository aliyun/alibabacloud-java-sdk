// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListEventsViewRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>primary</p>
     */
    @NameInMap("CalendarId")
    public String calendarId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxAttendees")
    public Integer maxAttendees;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>cnNTbW1xxx</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>2022-11-28T00:00:00+08:00</p>
     */
    @NameInMap("TimeMax")
    public String timeMax;

    /**
     * <strong>example:</strong>
     * <p>2022-11-27T00:00:00+08:00</p>
     */
    @NameInMap("TimeMin")
    public String timeMin;

    public static ListEventsViewRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEventsViewRequest self = new ListEventsViewRequest();
        return TeaModel.build(map, self);
    }

    public ListEventsViewRequest setCalendarId(String calendarId) {
        this.calendarId = calendarId;
        return this;
    }
    public String getCalendarId() {
        return this.calendarId;
    }

    public ListEventsViewRequest setMaxAttendees(Integer maxAttendees) {
        this.maxAttendees = maxAttendees;
        return this;
    }
    public Integer getMaxAttendees() {
        return this.maxAttendees;
    }

    public ListEventsViewRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListEventsViewRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListEventsViewRequest setTimeMax(String timeMax) {
        this.timeMax = timeMax;
        return this;
    }
    public String getTimeMax() {
        return this.timeMax;
    }

    public ListEventsViewRequest setTimeMin(String timeMin) {
        this.timeMin = timeMin;
        return this;
    }
    public String getTimeMin() {
        return this.timeMin;
    }

}
