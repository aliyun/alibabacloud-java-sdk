// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateDataQualityAlertRuleRequest extends TeaModel {
    /**
     * <p>The alert condition of the data quality monitoring rule.</p>
     * 
     * <strong>example:</strong>
     * <p>results.any { r -&gt; r.status == \&quot;fail\&quot; &amp;&amp; r.rule.severity == \&quot;High\&quot; }</p>
     */
    @NameInMap("Condition")
    public String condition;

    /**
     * <p>The ID of the alert rule.</p>
     * 
     * <strong>example:</strong>
     * <p>105412</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>Alert notification configurations.</p>
     */
    @NameInMap("Notification")
    public UpdateDataQualityAlertRuleRequestNotification notification;

    /**
     * <p>The project ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The monitored target of the data quality monitoring rule.</p>
     */
    @NameInMap("Target")
    public UpdateDataQualityAlertRuleRequestTarget target;

    public static UpdateDataQualityAlertRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataQualityAlertRuleRequest self = new UpdateDataQualityAlertRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataQualityAlertRuleRequest setCondition(String condition) {
        this.condition = condition;
        return this;
    }
    public String getCondition() {
        return this.condition;
    }

    public UpdateDataQualityAlertRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateDataQualityAlertRuleRequest setNotification(UpdateDataQualityAlertRuleRequestNotification notification) {
        this.notification = notification;
        return this;
    }
    public UpdateDataQualityAlertRuleRequestNotification getNotification() {
        return this.notification;
    }

    public UpdateDataQualityAlertRuleRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateDataQualityAlertRuleRequest setTarget(UpdateDataQualityAlertRuleRequestTarget target) {
        this.target = target;
        return this;
    }
    public UpdateDataQualityAlertRuleRequestTarget getTarget() {
        return this.target;
    }

    public static class UpdateDataQualityAlertRuleRequestNotificationReceivers extends TeaModel {
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

        public static UpdateDataQualityAlertRuleRequestNotificationReceivers build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataQualityAlertRuleRequestNotificationReceivers self = new UpdateDataQualityAlertRuleRequestNotificationReceivers();
            return TeaModel.build(map, self);
        }

        public UpdateDataQualityAlertRuleRequestNotificationReceivers setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public UpdateDataQualityAlertRuleRequestNotificationReceivers setReceiverType(String receiverType) {
            this.receiverType = receiverType;
            return this;
        }
        public String getReceiverType() {
            return this.receiverType;
        }

        public UpdateDataQualityAlertRuleRequestNotificationReceivers setReceiverValues(java.util.List<String> receiverValues) {
            this.receiverValues = receiverValues;
            return this;
        }
        public java.util.List<String> getReceiverValues() {
            return this.receiverValues;
        }

    }

    public static class UpdateDataQualityAlertRuleRequestNotification extends TeaModel {
        /**
         * <p>The list of alert channels. You can set both Email and Sms at the same time. In other cases, only one channel can be set.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Channels")
        public java.util.List<String> channels;

        /**
         * <p>The alert recipients.</p>
         */
        @NameInMap("Receivers")
        public java.util.List<UpdateDataQualityAlertRuleRequestNotificationReceivers> receivers;

        public static UpdateDataQualityAlertRuleRequestNotification build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataQualityAlertRuleRequestNotification self = new UpdateDataQualityAlertRuleRequestNotification();
            return TeaModel.build(map, self);
        }

        public UpdateDataQualityAlertRuleRequestNotification setChannels(java.util.List<String> channels) {
            this.channels = channels;
            return this;
        }
        public java.util.List<String> getChannels() {
            return this.channels;
        }

        public UpdateDataQualityAlertRuleRequestNotification setReceivers(java.util.List<UpdateDataQualityAlertRuleRequestNotificationReceivers> receivers) {
            this.receivers = receivers;
            return this;
        }
        public java.util.List<UpdateDataQualityAlertRuleRequestNotificationReceivers> getReceivers() {
            return this.receivers;
        }

    }

    public static class UpdateDataQualityAlertRuleRequestTarget extends TeaModel {
        /**
         * <p>The list of monitored target IDs. Currently, only one ID can be set.</p>
         */
        @NameInMap("Ids")
        public java.util.List<Long> ids;

        /**
         * <p>The type of the monitored target. Only DataQualityScan is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>DataQualityScan</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateDataQualityAlertRuleRequestTarget build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataQualityAlertRuleRequestTarget self = new UpdateDataQualityAlertRuleRequestTarget();
            return TeaModel.build(map, self);
        }

        public UpdateDataQualityAlertRuleRequestTarget setIds(java.util.List<Long> ids) {
            this.ids = ids;
            return this;
        }
        public java.util.List<Long> getIds() {
            return this.ids;
        }

        public UpdateDataQualityAlertRuleRequestTarget setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
