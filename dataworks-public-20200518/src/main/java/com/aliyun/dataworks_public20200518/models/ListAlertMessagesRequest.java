// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListAlertMessagesRequest extends TeaModel {
    /**
     * <p>The notification method. Valid values:</p>
     * <br>
     * <p>*   MAIL: email</p>
     * <br>
     * <p>*   SMS: text message</p>
     * <br>
     * <p>    Alert notifications can be sent by text message only in the Singapore, Malaysia (Kuala Lumpur), and Germany (Frankfurt) regions.</p>
     * <br>
     * <p>You can specify multiple notification methods. Separate them with commas (,).</p>
     */
    @NameInMap("AlertMethods")
    public String alertMethods;

    /**
     * <p>The type of the alert rule. Valid values: GLOBAL, USER_DEFINE, and OTHER. The value GLOBAL indicates that the alert rule is a global alert rule. The value USER_DEFINE indicates that the alert rule is customized by a user. The value OTHER indicates that the alert rule is a rule of another type. You can specify multiple types. Separate them with commas (,).</p>
     */
    @NameInMap("AlertRuleTypes")
    public String alertRuleTypes;

    /**
     * <p>The ID of the Alibaba Cloud account used by the alert recipient.</p>
     */
    @NameInMap("AlertUser")
    public String alertUser;

    /**
     * <p>The ID of the baseline. This parameter takes effect if the AlertRuleTypes parameter is set to GLOBAL.</p>
     * <br>
     * <p>You can configure either this parameter or RemindId.</p>
     */
    @NameInMap("BaselineId")
    public Long baselineId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the yyyy-MM-dd\\"T\\"HH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("BeginTime")
    public String beginTime;

    /**
     * <p>The end of the time range to query. Specify the time in the yyyy-MM-dd\\"T\\"HH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The number of the page to return. Valid values: 1 to 30. Default value: 1.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 10. Maximum value: 100.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the custom alert rule. This parameter takes effect if the AlertRuleTypes parameter is set to USER_DEFINE.</p>
     * <br>
     * <p>You can configure either this parameter or BaselineId.</p>
     */
    @NameInMap("RemindId")
    public Long remindId;

    public static ListAlertMessagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlertMessagesRequest self = new ListAlertMessagesRequest();
        return TeaModel.build(map, self);
    }

    public ListAlertMessagesRequest setAlertMethods(String alertMethods) {
        this.alertMethods = alertMethods;
        return this;
    }
    public String getAlertMethods() {
        return this.alertMethods;
    }

    public ListAlertMessagesRequest setAlertRuleTypes(String alertRuleTypes) {
        this.alertRuleTypes = alertRuleTypes;
        return this;
    }
    public String getAlertRuleTypes() {
        return this.alertRuleTypes;
    }

    public ListAlertMessagesRequest setAlertUser(String alertUser) {
        this.alertUser = alertUser;
        return this;
    }
    public String getAlertUser() {
        return this.alertUser;
    }

    public ListAlertMessagesRequest setBaselineId(Long baselineId) {
        this.baselineId = baselineId;
        return this;
    }
    public Long getBaselineId() {
        return this.baselineId;
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

    public ListAlertMessagesRequest setRemindId(Long remindId) {
        this.remindId = remindId;
        return this;
    }
    public Long getRemindId() {
        return this.remindId;
    }

}
