// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDataQualityAlertRuleResponseBody extends TeaModel {
    @NameInMap("DataQualityAlertRule")
    public GetDataQualityAlertRuleResponseBodyDataQualityAlertRule dataQualityAlertRule;

    /**
     * <strong>example:</strong>
     * <p>0bc14115****159376359</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDataQualityAlertRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataQualityAlertRuleResponseBody self = new GetDataQualityAlertRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataQualityAlertRuleResponseBody setDataQualityAlertRule(GetDataQualityAlertRuleResponseBodyDataQualityAlertRule dataQualityAlertRule) {
        this.dataQualityAlertRule = dataQualityAlertRule;
        return this;
    }
    public GetDataQualityAlertRuleResponseBodyDataQualityAlertRule getDataQualityAlertRule() {
        return this.dataQualityAlertRule;
    }

    public GetDataQualityAlertRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDataQualityAlertRuleResponseBodyDataQualityAlertRuleNotificationReceivers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;atAll&quot;:true}</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <strong>example:</strong>
         * <p>TaskOwner</p>
         */
        @NameInMap("ReceiverType")
        public String receiverType;

        @NameInMap("ReceiverValues")
        public java.util.List<String> receiverValues;

        public static GetDataQualityAlertRuleResponseBodyDataQualityAlertRuleNotificationReceivers build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityAlertRuleResponseBodyDataQualityAlertRuleNotificationReceivers self = new GetDataQualityAlertRuleResponseBodyDataQualityAlertRuleNotificationReceivers();
            return TeaModel.build(map, self);
        }

        public GetDataQualityAlertRuleResponseBodyDataQualityAlertRuleNotificationReceivers setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public GetDataQualityAlertRuleResponseBodyDataQualityAlertRuleNotificationReceivers setReceiverType(String receiverType) {
            this.receiverType = receiverType;
            return this;
        }
        public String getReceiverType() {
            return this.receiverType;
        }

        public GetDataQualityAlertRuleResponseBodyDataQualityAlertRuleNotificationReceivers setReceiverValues(java.util.List<String> receiverValues) {
            this.receiverValues = receiverValues;
            return this;
        }
        public java.util.List<String> getReceiverValues() {
            return this.receiverValues;
        }

    }

    public static class GetDataQualityAlertRuleResponseBodyDataQualityAlertRuleNotification extends TeaModel {
        @NameInMap("Channels")
        public java.util.List<String> channels;

        @NameInMap("Receivers")
        public java.util.List<GetDataQualityAlertRuleResponseBodyDataQualityAlertRuleNotificationReceivers> receivers;

        public static GetDataQualityAlertRuleResponseBodyDataQualityAlertRuleNotification build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityAlertRuleResponseBodyDataQualityAlertRuleNotification self = new GetDataQualityAlertRuleResponseBodyDataQualityAlertRuleNotification();
            return TeaModel.build(map, self);
        }

        public GetDataQualityAlertRuleResponseBodyDataQualityAlertRuleNotification setChannels(java.util.List<String> channels) {
            this.channels = channels;
            return this;
        }
        public java.util.List<String> getChannels() {
            return this.channels;
        }

        public GetDataQualityAlertRuleResponseBodyDataQualityAlertRuleNotification setReceivers(java.util.List<GetDataQualityAlertRuleResponseBodyDataQualityAlertRuleNotificationReceivers> receivers) {
            this.receivers = receivers;
            return this;
        }
        public java.util.List<GetDataQualityAlertRuleResponseBodyDataQualityAlertRuleNotificationReceivers> getReceivers() {
            return this.receivers;
        }

    }

    public static class GetDataQualityAlertRuleResponseBodyDataQualityAlertRuleTarget extends TeaModel {
        @NameInMap("Ids")
        public java.util.List<Long> ids;

        /**
         * <strong>example:</strong>
         * <p>DataQualityScan</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetDataQualityAlertRuleResponseBodyDataQualityAlertRuleTarget build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityAlertRuleResponseBodyDataQualityAlertRuleTarget self = new GetDataQualityAlertRuleResponseBodyDataQualityAlertRuleTarget();
            return TeaModel.build(map, self);
        }

        public GetDataQualityAlertRuleResponseBodyDataQualityAlertRuleTarget setIds(java.util.List<Long> ids) {
            this.ids = ids;
            return this;
        }
        public java.util.List<Long> getIds() {
            return this.ids;
        }

        public GetDataQualityAlertRuleResponseBodyDataQualityAlertRuleTarget setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDataQualityAlertRuleResponseBodyDataQualityAlertRule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>results.any { r -&gt; r.status == \&quot;fail\&quot; &amp;&amp; r.rule.severity == \&quot;High\&quot; }</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <strong>example:</strong>
         * <p>21045</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("Notification")
        public GetDataQualityAlertRuleResponseBodyDataQualityAlertRuleNotification notification;

        /**
         * <strong>example:</strong>
         * <p>90912</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("Target")
        public GetDataQualityAlertRuleResponseBodyDataQualityAlertRuleTarget target;

        public static GetDataQualityAlertRuleResponseBodyDataQualityAlertRule build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityAlertRuleResponseBodyDataQualityAlertRule self = new GetDataQualityAlertRuleResponseBodyDataQualityAlertRule();
            return TeaModel.build(map, self);
        }

        public GetDataQualityAlertRuleResponseBodyDataQualityAlertRule setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public GetDataQualityAlertRuleResponseBodyDataQualityAlertRule setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDataQualityAlertRuleResponseBodyDataQualityAlertRule setNotification(GetDataQualityAlertRuleResponseBodyDataQualityAlertRuleNotification notification) {
            this.notification = notification;
            return this;
        }
        public GetDataQualityAlertRuleResponseBodyDataQualityAlertRuleNotification getNotification() {
            return this.notification;
        }

        public GetDataQualityAlertRuleResponseBodyDataQualityAlertRule setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetDataQualityAlertRuleResponseBodyDataQualityAlertRule setTarget(GetDataQualityAlertRuleResponseBodyDataQualityAlertRuleTarget target) {
            this.target = target;
            return this;
        }
        public GetDataQualityAlertRuleResponseBodyDataQualityAlertRuleTarget getTarget() {
            return this.target;
        }

    }

}
