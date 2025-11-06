// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class ListInstanceAlarmResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListInstanceAlarmResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListInstanceAlarmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceAlarmResponseBody self = new ListInstanceAlarmResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceAlarmResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListInstanceAlarmResponseBody setData(ListInstanceAlarmResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListInstanceAlarmResponseBodyData getData() {
        return this.data;
    }

    public ListInstanceAlarmResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListInstanceAlarmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceAlarmResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVOAlarmVOAlarmDetailsAlarmDetail extends TeaModel {
        @NameInMap("AlertState")
        public String alertState;

        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("ContactGroups")
        public String contactGroups;

        @NameInMap("Dimensions")
        public String dimensions;

        @NameInMap("EffectiveInterval")
        public String effectiveInterval;

        @NameInMap("EnableState")
        public Boolean enableState;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("MailSubject")
        public String mailSubject;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("NoEffectiveInterval")
        public String noEffectiveInterval;

        @NameInMap("Period")
        public String period;

        @NameInMap("Resources")
        public String resources;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("SilenceTime")
        public String silenceTime;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public String times;

        @NameInMap("Webhook")
        public String webhook;

        public static ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVOAlarmVOAlarmDetailsAlarmDetail build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVOAlarmVOAlarmDetailsAlarmDetail self = new ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVOAlarmVOAlarmDetailsAlarmDetail();
            return TeaModel.build(map, self);
        }

        public ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVOAlarmVOAlarmDetailsAlarmDetail setAlertState(String alertState) {
            this.alertState = alertState;
            return this;
        }
        public String getAlertState() {
            return this.alertState;
        }

        public ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVOAlarmVOAlarmDetailsAlarmDetail setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVOAlarmVOAlarmDetailsAlarmDetail setContactGroups(String contactGroups) {
            this.contactGroups = contactGroups;
            return this;
        }
        public String getContactGroups() {
            return this.contactGroups;
        }

        public ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVOAlarmVOAlarmDetailsAlarmDetail setDimensions(String dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public String getDimensions() {
            return this.dimensions;
        }

        public ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVOAlarmVOAlarmDetailsAlarmDetail setEffectiveInterval(String effectiveInterval) {
            this.effectiveInterval = effectiveInterval;
            return this;
        }
        public String getEffectiveInterval() {
            return this.effectiveInterval;
        }

        public ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVOAlarmVOAlarmDetailsAlarmDetail setEnableState(Boolean enableState) {
            this.enableState = enableState;
            return this;
        }
        public Boolean getEnableState() {
            return this.enableState;
        }

        public ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVOAlarmVOAlarmDetailsAlarmDetail setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVOAlarmVOAlarmDetailsAlarmDetail setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVOAlarmVOAlarmDetailsAlarmDetail setMailSubject(String mailSubject) {
            this.mailSubject = mailSubject;
            return this;
        }
        public String getMailSubject() {
            return this.mailSubject;
        }

        public ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVOAlarmVOAlarmDetailsAlarmDetail setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVOAlarmVOAlarmDetailsAlarmDetail setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVOAlarmVOAlarmDetailsAlarmDetail setNoEffectiveInterval(String noEffectiveInterval) {
            this.noEffectiveInterval = noEffectiveInterval;
            return this;
        }
        public String getNoEffectiveInterval() {
            return this.noEffectiveInterval;
        }

        public ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVOAlarmVOAlarmDetailsAlarmDetail setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVOAlarmVOAlarmDetailsAlarmDetail setResources(String resources) {
            this.resources = resources;
            return this;
        }
        public String getResources() {
            return this.resources;
        }

        public ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVOAlarmVOAlarmDetailsAlarmDetail setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVOAlarmVOAlarmDetailsAlarmDetail setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVOAlarmVOAlarmDetailsAlarmDetail setSilenceTime(String silenceTime) {
            this.silenceTime = silenceTime;
            return this;
        }
        public String getSilenceTime() {
            return this.silenceTime;
        }

        public ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVOAlarmVOAlarmDetailsAlarmDetail setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVOAlarmVOAlarmDetailsAlarmDetail setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVOAlarmVOAlarmDetailsAlarmDetail setTimes(String times) {
            this.times = times;
            return this;
        }
        public String getTimes() {
            return this.times;
        }

        public ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVOAlarmVOAlarmDetailsAlarmDetail setWebhook(String webhook) {
            this.webhook = webhook;
            return this;
        }
        public String getWebhook() {
            return this.webhook;
        }

    }

    public static class ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVOAlarmVOAlarmDetails extends TeaModel {
        @NameInMap("AlarmDetail")
        public java.util.List<ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVOAlarmVOAlarmDetailsAlarmDetail> alarmDetail;

        public static ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVOAlarmVOAlarmDetails build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVOAlarmVOAlarmDetails self = new ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVOAlarmVOAlarmDetails();
            return TeaModel.build(map, self);
        }

        public ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVOAlarmVOAlarmDetails setAlarmDetail(java.util.List<ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVOAlarmVOAlarmDetailsAlarmDetail> alarmDetail) {
            this.alarmDetail = alarmDetail;
            return this;
        }
        public java.util.List<ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVOAlarmVOAlarmDetailsAlarmDetail> getAlarmDetail() {
            return this.alarmDetail;
        }

    }

    public static class ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVOAlarmVO extends TeaModel {
        @NameInMap("AlarmCount")
        public Integer alarmCount;

        @NameInMap("AlarmDetails")
        public ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVOAlarmVOAlarmDetails alarmDetails;

        @NameInMap("HasConfigAlarm")
        public Boolean hasConfigAlarm;

        public static ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVOAlarmVO build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVOAlarmVO self = new ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVOAlarmVO();
            return TeaModel.build(map, self);
        }

        public ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVOAlarmVO setAlarmCount(Integer alarmCount) {
            this.alarmCount = alarmCount;
            return this;
        }
        public Integer getAlarmCount() {
            return this.alarmCount;
        }

        public ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVOAlarmVO setAlarmDetails(ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVOAlarmVOAlarmDetails alarmDetails) {
            this.alarmDetails = alarmDetails;
            return this;
        }
        public ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVOAlarmVOAlarmDetails getAlarmDetails() {
            return this.alarmDetails;
        }

        public ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVOAlarmVO setHasConfigAlarm(Boolean hasConfigAlarm) {
            this.hasConfigAlarm = hasConfigAlarm;
            return this;
        }
        public Boolean getHasConfigAlarm() {
            return this.hasConfigAlarm;
        }

    }

    public static class ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVO extends TeaModel {
        @NameInMap("AlarmVO")
        public ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVOAlarmVO alarmVO;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        public static ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVO build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVO self = new ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVO();
            return TeaModel.build(map, self);
        }

        public ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVO setAlarmVO(ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVOAlarmVO alarmVO) {
            this.alarmVO = alarmVO;
            return this;
        }
        public ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVOAlarmVO getAlarmVO() {
            return this.alarmVO;
        }

        public ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVO setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVO setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

    }

    public static class ListInstanceAlarmResponseBodyDataVoList extends TeaModel {
        @NameInMap("CommodityInstanceAlarmVO")
        public java.util.List<ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVO> commodityInstanceAlarmVO;

        public static ListInstanceAlarmResponseBodyDataVoList build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceAlarmResponseBodyDataVoList self = new ListInstanceAlarmResponseBodyDataVoList();
            return TeaModel.build(map, self);
        }

        public ListInstanceAlarmResponseBodyDataVoList setCommodityInstanceAlarmVO(java.util.List<ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVO> commodityInstanceAlarmVO) {
            this.commodityInstanceAlarmVO = commodityInstanceAlarmVO;
            return this;
        }
        public java.util.List<ListInstanceAlarmResponseBodyDataVoListCommodityInstanceAlarmVO> getCommodityInstanceAlarmVO() {
            return this.commodityInstanceAlarmVO;
        }

    }

    public static class ListInstanceAlarmResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("VoList")
        public ListInstanceAlarmResponseBodyDataVoList voList;

        public static ListInstanceAlarmResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceAlarmResponseBodyData self = new ListInstanceAlarmResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListInstanceAlarmResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListInstanceAlarmResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListInstanceAlarmResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public ListInstanceAlarmResponseBodyData setVoList(ListInstanceAlarmResponseBodyDataVoList voList) {
            this.voList = voList;
            return this;
        }
        public ListInstanceAlarmResponseBodyDataVoList getVoList() {
            return this.voList;
        }

    }

}
