// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListAlertEventsResponseBody extends TeaModel {
    /**
     * <p>The struct returned.</p>
     */
    @NameInMap("PageBean")
    public ListAlertEventsResponseBodyPageBean pageBean;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAlertEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlertEventsResponseBody self = new ListAlertEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlertEventsResponseBody setPageBean(ListAlertEventsResponseBodyPageBean pageBean) {
        this.pageBean = pageBean;
        return this;
    }
    public ListAlertEventsResponseBodyPageBean getPageBean() {
        return this.pageBean;
    }

    public ListAlertEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAlertEventsResponseBodyPageBeanEventsAlarms extends TeaModel {
        /**
         * <p>The ID of the alert.</p>
         */
        @NameInMap("AlarmId")
        public Long alarmId;

        /**
         * <p>The name of the alert.</p>
         */
        @NameInMap("AlarmName")
        public String alarmName;

        /**
         * <p>The time when the alert was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The status of the alert. Valid values:</p>
         * <br>
         * <p>*   0: The alert is pending.</p>
         * <p>*   1: The alert is being handled.</p>
         * <p>*   2: The alert is cleared.</p>
         */
        @NameInMap("State")
        public Integer state;

        public static ListAlertEventsResponseBodyPageBeanEventsAlarms build(java.util.Map<String, ?> map) throws Exception {
            ListAlertEventsResponseBodyPageBeanEventsAlarms self = new ListAlertEventsResponseBodyPageBeanEventsAlarms();
            return TeaModel.build(map, self);
        }

        public ListAlertEventsResponseBodyPageBeanEventsAlarms setAlarmId(Long alarmId) {
            this.alarmId = alarmId;
            return this;
        }
        public Long getAlarmId() {
            return this.alarmId;
        }

        public ListAlertEventsResponseBodyPageBeanEventsAlarms setAlarmName(String alarmName) {
            this.alarmName = alarmName;
            return this;
        }
        public String getAlarmName() {
            return this.alarmName;
        }

        public ListAlertEventsResponseBodyPageBeanEventsAlarms setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAlertEventsResponseBodyPageBeanEventsAlarms setState(Integer state) {
            this.state = state;
            return this;
        }
        public Integer getState() {
            return this.state;
        }

    }

    public static class ListAlertEventsResponseBodyPageBeanEvents extends TeaModel {
        /**
         * <p>The list of associated alerts.</p>
         */
        @NameInMap("Alarms")
        public java.util.List<ListAlertEventsResponseBodyPageBeanEventsAlarms> alarms;

        /**
         * <p>The name of the alert.</p>
         */
        @NameInMap("AlertName")
        public String alertName;

        /**
         * <p>The list of annotations.</p>
         */
        @NameInMap("Annotations")
        public String annotations;

        /**
         * <p>The description of the alert event.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The end time of the alert event.</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The URL of the alert event.</p>
         */
        @NameInMap("GeneratorURL")
        public String generatorURL;

        /**
         * <p>The user who handled the alert.</p>
         */
        @NameInMap("HandlerName")
        public String handlerName;

        /**
         * <p>The name of the alert integration.</p>
         */
        @NameInMap("IntegrationName")
        public String integrationName;

        /**
         * <p>The type of the alert integration.</p>
         */
        @NameInMap("IntegrationType")
        public String integrationType;

        /**
         * <p>The list of tags.</p>
         */
        @NameInMap("Labels")
        public String labels;

        /**
         * <p>The time when the alert event was received.</p>
         */
        @NameInMap("ReceiveTime")
        public String receiveTime;

        /**
         * <p>The severity level of the alert. Valid value:</p>
         * <br>
         * <p>*   critical: P1</p>
         * <p>*   error: P2</p>
         * <p>*   warning: P3</p>
         * <p>*   page: P4</p>
         * <p>*   default: P6</p>
         */
        @NameInMap("Severity")
        public String severity;

        /**
         * <p>The start time of the alert event.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the alert event. Valid values:</p>
         * <br>
         * <p>*   Active</p>
         * <p>*   Silenced</p>
         * <p>*   Resolved</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListAlertEventsResponseBodyPageBeanEvents build(java.util.Map<String, ?> map) throws Exception {
            ListAlertEventsResponseBodyPageBeanEvents self = new ListAlertEventsResponseBodyPageBeanEvents();
            return TeaModel.build(map, self);
        }

        public ListAlertEventsResponseBodyPageBeanEvents setAlarms(java.util.List<ListAlertEventsResponseBodyPageBeanEventsAlarms> alarms) {
            this.alarms = alarms;
            return this;
        }
        public java.util.List<ListAlertEventsResponseBodyPageBeanEventsAlarms> getAlarms() {
            return this.alarms;
        }

        public ListAlertEventsResponseBodyPageBeanEvents setAlertName(String alertName) {
            this.alertName = alertName;
            return this;
        }
        public String getAlertName() {
            return this.alertName;
        }

        public ListAlertEventsResponseBodyPageBeanEvents setAnnotations(String annotations) {
            this.annotations = annotations;
            return this;
        }
        public String getAnnotations() {
            return this.annotations;
        }

        public ListAlertEventsResponseBodyPageBeanEvents setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAlertEventsResponseBodyPageBeanEvents setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListAlertEventsResponseBodyPageBeanEvents setGeneratorURL(String generatorURL) {
            this.generatorURL = generatorURL;
            return this;
        }
        public String getGeneratorURL() {
            return this.generatorURL;
        }

        public ListAlertEventsResponseBodyPageBeanEvents setHandlerName(String handlerName) {
            this.handlerName = handlerName;
            return this;
        }
        public String getHandlerName() {
            return this.handlerName;
        }

        public ListAlertEventsResponseBodyPageBeanEvents setIntegrationName(String integrationName) {
            this.integrationName = integrationName;
            return this;
        }
        public String getIntegrationName() {
            return this.integrationName;
        }

        public ListAlertEventsResponseBodyPageBeanEvents setIntegrationType(String integrationType) {
            this.integrationType = integrationType;
            return this;
        }
        public String getIntegrationType() {
            return this.integrationType;
        }

        public ListAlertEventsResponseBodyPageBeanEvents setLabels(String labels) {
            this.labels = labels;
            return this;
        }
        public String getLabels() {
            return this.labels;
        }

        public ListAlertEventsResponseBodyPageBeanEvents setReceiveTime(String receiveTime) {
            this.receiveTime = receiveTime;
            return this;
        }
        public String getReceiveTime() {
            return this.receiveTime;
        }

        public ListAlertEventsResponseBodyPageBeanEvents setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public ListAlertEventsResponseBodyPageBeanEvents setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListAlertEventsResponseBodyPageBeanEvents setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListAlertEventsResponseBodyPageBean extends TeaModel {
        /**
         * <p>The list of information about historical alert events.</p>
         */
        @NameInMap("Events")
        public java.util.List<ListAlertEventsResponseBodyPageBeanEvents> events;

        /**
         * <p>The number of the page returned.</p>
         */
        @NameInMap("Page")
        public Long page;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The total number of returned entries.</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListAlertEventsResponseBodyPageBean build(java.util.Map<String, ?> map) throws Exception {
            ListAlertEventsResponseBodyPageBean self = new ListAlertEventsResponseBodyPageBean();
            return TeaModel.build(map, self);
        }

        public ListAlertEventsResponseBodyPageBean setEvents(java.util.List<ListAlertEventsResponseBodyPageBeanEvents> events) {
            this.events = events;
            return this;
        }
        public java.util.List<ListAlertEventsResponseBodyPageBeanEvents> getEvents() {
            return this.events;
        }

        public ListAlertEventsResponseBodyPageBean setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public ListAlertEventsResponseBodyPageBean setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public ListAlertEventsResponseBodyPageBean setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
