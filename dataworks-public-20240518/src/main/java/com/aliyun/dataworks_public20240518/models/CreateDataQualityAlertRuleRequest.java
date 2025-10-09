// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDataQualityAlertRuleRequest extends TeaModel {
    /**
     * <p>The alert condition of the data quality monitoring rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>results.any { r -&gt; r.status == \&quot;fail\&quot; &amp;&amp; r.rule.severity == \&quot;High\&quot; }</p>
     */
    @NameInMap("Condition")
    public String condition;

    /**
     * <p>The list of alert channels.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Notification")
    public CreateDataQualityAlertRuleRequestNotification notification;

    /**
     * <p>The project ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The monitored target of the data quality monitoring rule.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Target")
    public CreateDataQualityAlertRuleRequestTarget target;

    public static CreateDataQualityAlertRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataQualityAlertRuleRequest self = new CreateDataQualityAlertRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataQualityAlertRuleRequest setCondition(String condition) {
        this.condition = condition;
        return this;
    }
    public String getCondition() {
        return this.condition;
    }

    public CreateDataQualityAlertRuleRequest setNotification(CreateDataQualityAlertRuleRequestNotification notification) {
        this.notification = notification;
        return this;
    }
    public CreateDataQualityAlertRuleRequestNotification getNotification() {
        return this.notification;
    }

    public CreateDataQualityAlertRuleRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateDataQualityAlertRuleRequest setTarget(CreateDataQualityAlertRuleRequestTarget target) {
        this.target = target;
        return this;
    }
    public CreateDataQualityAlertRuleRequestTarget getTarget() {
        return this.target;
    }

    public static class CreateDataQualityAlertRuleRequestNotificationReceivers extends TeaModel {
        /**
         * <p>Additional configurations required for the alert recipients. When ReceiverType is DingdingUrl, you can set <code>{&quot;atAll&quot;:true}</code> to mention all members.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;atAll&quot;:true}</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <p>The type of alert recipients.</p>
         * <ul>
         * <li>AliUid</li>
         * <li>WebhookUrl</li>
         * <li>DingdingUrl</li>
         * <li>WeixinUrl</li>
         * <li>FeishuUrl</li>
         * <li>TaskOwner</li>
         * <li>DataQualityScanOwner</li>
         * <li>ShiftSchedule</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TaskOwner</p>
         */
        @NameInMap("ReceiverType")
        public String receiverType;

        /**
         * <p>The value of alert recipients.</p>
         */
        @NameInMap("ReceiverValues")
        public java.util.List<String> receiverValues;

        public static CreateDataQualityAlertRuleRequestNotificationReceivers build(java.util.Map<String, ?> map) throws Exception {
            CreateDataQualityAlertRuleRequestNotificationReceivers self = new CreateDataQualityAlertRuleRequestNotificationReceivers();
            return TeaModel.build(map, self);
        }

        public CreateDataQualityAlertRuleRequestNotificationReceivers setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public CreateDataQualityAlertRuleRequestNotificationReceivers setReceiverType(String receiverType) {
            this.receiverType = receiverType;
            return this;
        }
        public String getReceiverType() {
            return this.receiverType;
        }

        public CreateDataQualityAlertRuleRequestNotificationReceivers setReceiverValues(java.util.List<String> receiverValues) {
            this.receiverValues = receiverValues;
            return this;
        }
        public java.util.List<String> getReceiverValues() {
            return this.receiverValues;
        }

    }

    public static class CreateDataQualityAlertRuleRequestNotification extends TeaModel {
        /**
         * <p>The list of alert channels. You can set both <code>Email</code> and <code>Sms</code> at the same time. In other cases, only one channel can be set.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Channels")
        public java.util.List<String> channels;

        /**
         * <p>The alert recipients.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Receivers")
        public java.util.List<CreateDataQualityAlertRuleRequestNotificationReceivers> receivers;

        public static CreateDataQualityAlertRuleRequestNotification build(java.util.Map<String, ?> map) throws Exception {
            CreateDataQualityAlertRuleRequestNotification self = new CreateDataQualityAlertRuleRequestNotification();
            return TeaModel.build(map, self);
        }

        public CreateDataQualityAlertRuleRequestNotification setChannels(java.util.List<String> channels) {
            this.channels = channels;
            return this;
        }
        public java.util.List<String> getChannels() {
            return this.channels;
        }

        public CreateDataQualityAlertRuleRequestNotification setReceivers(java.util.List<CreateDataQualityAlertRuleRequestNotificationReceivers> receivers) {
            this.receivers = receivers;
            return this;
        }
        public java.util.List<CreateDataQualityAlertRuleRequestNotificationReceivers> getReceivers() {
            return this.receivers;
        }

    }

    public static class CreateDataQualityAlertRuleRequestTarget extends TeaModel {
        /**
         * <p>The list of monitored target IDs. Currently, only one ID can be set.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Ids")
        public java.util.List<Long> ids;

        /**
         * <p>The type of the monitored target. Only DataQualityScan is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DataQualityScan</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateDataQualityAlertRuleRequestTarget build(java.util.Map<String, ?> map) throws Exception {
            CreateDataQualityAlertRuleRequestTarget self = new CreateDataQualityAlertRuleRequestTarget();
            return TeaModel.build(map, self);
        }

        public CreateDataQualityAlertRuleRequestTarget setIds(java.util.List<Long> ids) {
            this.ids = ids;
            return this;
        }
        public java.util.List<Long> getIds() {
            return this.ids;
        }

        public CreateDataQualityAlertRuleRequestTarget setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
