// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListAlertEventsRequest extends TeaModel {
    @NameInMap("AlertName")
    public String alertName;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("MatchingConditions")
    public String matchingConditions;

    @NameInMap("Page")
    public Long page;

    @NameInMap("Size")
    public Long size;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Status")
    public String status;

    public static ListAlertEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlertEventsRequest self = new ListAlertEventsRequest();
        return TeaModel.build(map, self);
    }

    public ListAlertEventsRequest setAlertName(String alertName) {
        this.alertName = alertName;
        return this;
    }
    public String getAlertName() {
        return this.alertName;
    }

    public ListAlertEventsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListAlertEventsRequest setMatchingConditions(String matchingConditions) {
        this.matchingConditions = matchingConditions;
        return this;
    }
    public String getMatchingConditions() {
        return this.matchingConditions;
    }

    public ListAlertEventsRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListAlertEventsRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public ListAlertEventsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListAlertEventsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
