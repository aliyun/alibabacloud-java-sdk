// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListAlertsResponseBody extends TeaModel {
    // 返回结构体
    @NameInMap("PageBean")
    public ListAlertsResponseBodyPageBean pageBean;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static ListAlertsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlertsResponseBody self = new ListAlertsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlertsResponseBody setPageBean(ListAlertsResponseBodyPageBean pageBean) {
        this.pageBean = pageBean;
        return this;
    }
    public ListAlertsResponseBodyPageBean getPageBean() {
        return this.pageBean;
    }

    public ListAlertsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAlertsResponseBodyPageBeanListAlertsActivities extends TeaModel {
        // 通知内容
        @NameInMap("Content")
        public String content;

        // 描述
        @NameInMap("Description")
        public String description;

        // 处理人名称
        @NameInMap("HandlerName")
        public String handlerName;

        // 时间
        @NameInMap("Time")
        public String time;

        // 活动类型
        @NameInMap("Type")
        public Long type;

        public static ListAlertsResponseBodyPageBeanListAlertsActivities build(java.util.Map<String, ?> map) throws Exception {
            ListAlertsResponseBodyPageBeanListAlertsActivities self = new ListAlertsResponseBodyPageBeanListAlertsActivities();
            return TeaModel.build(map, self);
        }

        public ListAlertsResponseBodyPageBeanListAlertsActivities setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListAlertsResponseBodyPageBeanListAlertsActivities setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAlertsResponseBodyPageBeanListAlertsActivities setHandlerName(String handlerName) {
            this.handlerName = handlerName;
            return this;
        }
        public String getHandlerName() {
            return this.handlerName;
        }

        public ListAlertsResponseBodyPageBeanListAlertsActivities setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public ListAlertsResponseBodyPageBeanListAlertsActivities setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

    }

    public static class ListAlertsResponseBodyPageBeanListAlertsAlertEvents extends TeaModel {
        // 事件名称
        @NameInMap("AlertName")
        public String alertName;

        // 注释列表
        @NameInMap("Annotations")
        public String annotations;

        // 事件描述
        @NameInMap("Description")
        public String description;

        // 结束时间
        @NameInMap("EndTime")
        public String endTime;

        // 事件地址
        @NameInMap("GeneratorURL")
        public String generatorURL;

        // 集成名称
        @NameInMap("IntegrationName")
        public String integrationName;

        // 集成类型
        @NameInMap("IntegrationType")
        public String integrationType;

        // 标签列表
        @NameInMap("Labels")
        public String labels;

        // 事件接受时间
        @NameInMap("ReceiveTime")
        public String receiveTime;

        // 事件等级
        @NameInMap("Severity")
        public String severity;

        // 开始时间
        @NameInMap("StartTime")
        public String startTime;

        // 告警状态Active("Active"),      * Inhibited("Inhibited"),      * Silenced("Silenced"),      * Resolved("Resolved")
        @NameInMap("State")
        public String state;

        public static ListAlertsResponseBodyPageBeanListAlertsAlertEvents build(java.util.Map<String, ?> map) throws Exception {
            ListAlertsResponseBodyPageBeanListAlertsAlertEvents self = new ListAlertsResponseBodyPageBeanListAlertsAlertEvents();
            return TeaModel.build(map, self);
        }

        public ListAlertsResponseBodyPageBeanListAlertsAlertEvents setAlertName(String alertName) {
            this.alertName = alertName;
            return this;
        }
        public String getAlertName() {
            return this.alertName;
        }

        public ListAlertsResponseBodyPageBeanListAlertsAlertEvents setAnnotations(String annotations) {
            this.annotations = annotations;
            return this;
        }
        public String getAnnotations() {
            return this.annotations;
        }

        public ListAlertsResponseBodyPageBeanListAlertsAlertEvents setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAlertsResponseBodyPageBeanListAlertsAlertEvents setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListAlertsResponseBodyPageBeanListAlertsAlertEvents setGeneratorURL(String generatorURL) {
            this.generatorURL = generatorURL;
            return this;
        }
        public String getGeneratorURL() {
            return this.generatorURL;
        }

        public ListAlertsResponseBodyPageBeanListAlertsAlertEvents setIntegrationName(String integrationName) {
            this.integrationName = integrationName;
            return this;
        }
        public String getIntegrationName() {
            return this.integrationName;
        }

        public ListAlertsResponseBodyPageBeanListAlertsAlertEvents setIntegrationType(String integrationType) {
            this.integrationType = integrationType;
            return this;
        }
        public String getIntegrationType() {
            return this.integrationType;
        }

        public ListAlertsResponseBodyPageBeanListAlertsAlertEvents setLabels(String labels) {
            this.labels = labels;
            return this;
        }
        public String getLabels() {
            return this.labels;
        }

        public ListAlertsResponseBodyPageBeanListAlertsAlertEvents setReceiveTime(String receiveTime) {
            this.receiveTime = receiveTime;
            return this;
        }
        public String getReceiveTime() {
            return this.receiveTime;
        }

        public ListAlertsResponseBodyPageBeanListAlertsAlertEvents setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public ListAlertsResponseBodyPageBeanListAlertsAlertEvents setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListAlertsResponseBodyPageBeanListAlertsAlertEvents setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class ListAlertsResponseBodyPageBeanListAlerts extends TeaModel {
        // 活动列表
        @NameInMap("Activities")
        public java.util.List<ListAlertsResponseBodyPageBeanListAlertsActivities> activities;

        // 事件列表
        @NameInMap("AlertEvents")
        public java.util.List<ListAlertsResponseBodyPageBeanListAlertsAlertEvents> alertEvents;

        // 告警ID
        @NameInMap("AlertId")
        public Long alertId;

        // 告警名称
        @NameInMap("AlertName")
        public String alertName;

        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 通知策略ID
        @NameInMap("DispatchRuleId")
        public Float dispatchRuleId;

        // 通知策略名称
        @NameInMap("DispatchRuleName")
        public String dispatchRuleName;

        // 告警等级(P1~P6)
        @NameInMap("Severity")
        public String severity;

        // 告警状态(0 - 待处理， 1 - 处理中， 2 - 已处理)
        @NameInMap("State")
        public Long state;

        public static ListAlertsResponseBodyPageBeanListAlerts build(java.util.Map<String, ?> map) throws Exception {
            ListAlertsResponseBodyPageBeanListAlerts self = new ListAlertsResponseBodyPageBeanListAlerts();
            return TeaModel.build(map, self);
        }

        public ListAlertsResponseBodyPageBeanListAlerts setActivities(java.util.List<ListAlertsResponseBodyPageBeanListAlertsActivities> activities) {
            this.activities = activities;
            return this;
        }
        public java.util.List<ListAlertsResponseBodyPageBeanListAlertsActivities> getActivities() {
            return this.activities;
        }

        public ListAlertsResponseBodyPageBeanListAlerts setAlertEvents(java.util.List<ListAlertsResponseBodyPageBeanListAlertsAlertEvents> alertEvents) {
            this.alertEvents = alertEvents;
            return this;
        }
        public java.util.List<ListAlertsResponseBodyPageBeanListAlertsAlertEvents> getAlertEvents() {
            return this.alertEvents;
        }

        public ListAlertsResponseBodyPageBeanListAlerts setAlertId(Long alertId) {
            this.alertId = alertId;
            return this;
        }
        public Long getAlertId() {
            return this.alertId;
        }

        public ListAlertsResponseBodyPageBeanListAlerts setAlertName(String alertName) {
            this.alertName = alertName;
            return this;
        }
        public String getAlertName() {
            return this.alertName;
        }

        public ListAlertsResponseBodyPageBeanListAlerts setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAlertsResponseBodyPageBeanListAlerts setDispatchRuleId(Float dispatchRuleId) {
            this.dispatchRuleId = dispatchRuleId;
            return this;
        }
        public Float getDispatchRuleId() {
            return this.dispatchRuleId;
        }

        public ListAlertsResponseBodyPageBeanListAlerts setDispatchRuleName(String dispatchRuleName) {
            this.dispatchRuleName = dispatchRuleName;
            return this;
        }
        public String getDispatchRuleName() {
            return this.dispatchRuleName;
        }

        public ListAlertsResponseBodyPageBeanListAlerts setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public ListAlertsResponseBodyPageBeanListAlerts setState(Long state) {
            this.state = state;
            return this;
        }
        public Long getState() {
            return this.state;
        }

    }

    public static class ListAlertsResponseBodyPageBean extends TeaModel {
        // 告警发送历史信息组
        @NameInMap("ListAlerts")
        public java.util.List<ListAlertsResponseBodyPageBeanListAlerts> listAlerts;

        // 页数
        @NameInMap("Page")
        public Long page;

        // 每页展示数目
        @NameInMap("Size")
        public Long size;

        // 总数
        @NameInMap("Total")
        public Long total;

        public static ListAlertsResponseBodyPageBean build(java.util.Map<String, ?> map) throws Exception {
            ListAlertsResponseBodyPageBean self = new ListAlertsResponseBodyPageBean();
            return TeaModel.build(map, self);
        }

        public ListAlertsResponseBodyPageBean setListAlerts(java.util.List<ListAlertsResponseBodyPageBeanListAlerts> listAlerts) {
            this.listAlerts = listAlerts;
            return this;
        }
        public java.util.List<ListAlertsResponseBodyPageBeanListAlerts> getListAlerts() {
            return this.listAlerts;
        }

        public ListAlertsResponseBodyPageBean setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public ListAlertsResponseBodyPageBean setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public ListAlertsResponseBodyPageBean setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
