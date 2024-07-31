// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListAlertMessagesRequest extends TeaModel {
    /**
     * <p>The notification method. Valid values:</p>
     * <ul>
     * <li>MAIL</li>
     * <li>SMS Alert notifications can be sent by text message only in the Singapore, Malaysia (Kuala Lumpur), and Germany (Frankfurt) regions.</li>
     * </ul>
     * <p>You can specify multiple notification methods. Separate them with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>SMS,MAIL,PHONE</p>
     */
    @NameInMap("AlertMethods")
    public String alertMethods;

    /**
     * <p>The type of the alert rule. Valid values: GLOBAL, USER_DEFINE, and OTHER. The value GLOBAL indicates that the alert rule is a global alert rule. The value USER_DEFINE indicates that the alert rule is customized by a user. The value OTHER indicates that the alert rule is a rule of another type. You can specify multiple types. Separate them with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>GLOBAL,USER_DEFINE,OTHER</p>
     */
    @NameInMap("AlertRuleTypes")
    public String alertRuleTypes;

    /**
     * <p>The ID of the Alibaba Cloud account used by the alert recipient.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("AlertUser")
    public String alertUser;

    /**
     * <p>The baseline ID. This parameter takes effect if the AlertRuleTypes parameter is set to GLOBAL. You can configure either this parameter or the RemindId parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("BaselineId")
    public Long baselineId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-dd\&quot;T\&quot;HH:mm:ssZ format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-04-02T00:00:00+0800</p>
     */
    @NameInMap("BeginTime")
    public String beginTime;

    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-dd\&quot;T\&quot;HH:mm:ssZ format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-04-04T00:00:00+0800</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The page number. Default value: 1. Minimum value: 1. Maximum value: 30.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The custom alert rule ID. This parameter takes effect if the AlertRuleTypes parameter is set to USER_DEFINE. You can configure either this parameter or the BaselineId parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>9527</p>
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
