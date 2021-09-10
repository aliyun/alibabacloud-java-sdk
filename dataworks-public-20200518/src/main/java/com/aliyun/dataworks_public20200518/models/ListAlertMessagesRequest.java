// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListAlertMessagesRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("BeginTime")
    public String beginTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RemindId")
    public Long remindId;

    @NameInMap("AlertMethods")
    public String alertMethods;

    @NameInMap("AlertUser")
    public String alertUser;

    @NameInMap("AlertRuleTypes")
    public String alertRuleTypes;

    public static ListAlertMessagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlertMessagesRequest self = new ListAlertMessagesRequest();
        return TeaModel.build(map, self);
    }

    public ListAlertMessagesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAlertMessagesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAlertMessagesRequest setBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public String getBeginTime() {
        return this.beginTime;
    }

    public ListAlertMessagesRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListAlertMessagesRequest setRemindId(Long remindId) {
        this.remindId = remindId;
        return this;
    }
    public Long getRemindId() {
        return this.remindId;
    }

    public ListAlertMessagesRequest setAlertMethods(String alertMethods) {
        this.alertMethods = alertMethods;
        return this;
    }
    public String getAlertMethods() {
        return this.alertMethods;
    }

    public ListAlertMessagesRequest setAlertUser(String alertUser) {
        this.alertUser = alertUser;
        return this;
    }
    public String getAlertUser() {
        return this.alertUser;
    }

    public ListAlertMessagesRequest setAlertRuleTypes(String alertRuleTypes) {
        this.alertRuleTypes = alertRuleTypes;
        return this;
    }
    public String getAlertRuleTypes() {
        return this.alertRuleTypes;
    }

}
