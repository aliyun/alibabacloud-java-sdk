// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeGroupMonitoringAgentProcessResponseBody extends TeaModel {
    /**
     * <p>The HTTP status codes.</p>
     * <blockquote>
     * <p> The status code 200 indicates that the request was successful.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The Request is not authorization.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number. Default value: 1</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("Processes")
    public DescribeGroupMonitoringAgentProcessResponseBodyProcesses processes;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7985D471-3FA8-4EE9-8F4B-45C19DF3D36F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values: Valid values: true and false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>28</p>
     */
    @NameInMap("Total")
    public String total;

    public static DescribeGroupMonitoringAgentProcessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupMonitoringAgentProcessResponseBody self = new DescribeGroupMonitoringAgentProcessResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGroupMonitoringAgentProcessResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeGroupMonitoringAgentProcessResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeGroupMonitoringAgentProcessResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGroupMonitoringAgentProcessResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeGroupMonitoringAgentProcessResponseBody setProcesses(DescribeGroupMonitoringAgentProcessResponseBodyProcesses processes) {
        this.processes = processes;
        return this;
    }
    public DescribeGroupMonitoringAgentProcessResponseBodyProcesses getProcesses() {
        return this.processes;
    }

    public DescribeGroupMonitoringAgentProcessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGroupMonitoringAgentProcessResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeGroupMonitoringAgentProcessResponseBody setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

    public static class DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessAlertConfigAlertConfigTargetListTarget extends TeaModel {
        @NameInMap("Arn")
        public String arn;

        @NameInMap("Id")
        public String id;

        @NameInMap("JsonParmas")
        public String jsonParmas;

        @NameInMap("Level")
        public String level;

        public static DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessAlertConfigAlertConfigTargetListTarget build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessAlertConfigAlertConfigTargetListTarget self = new DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessAlertConfigAlertConfigTargetListTarget();
            return TeaModel.build(map, self);
        }

        public DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessAlertConfigAlertConfigTargetListTarget setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessAlertConfigAlertConfigTargetListTarget setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessAlertConfigAlertConfigTargetListTarget setJsonParmas(String jsonParmas) {
            this.jsonParmas = jsonParmas;
            return this;
        }
        public String getJsonParmas() {
            return this.jsonParmas;
        }

        public DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessAlertConfigAlertConfigTargetListTarget setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

    public static class DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessAlertConfigAlertConfigTargetList extends TeaModel {
        @NameInMap("Target")
        public java.util.List<DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessAlertConfigAlertConfigTargetListTarget> target;

        public static DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessAlertConfigAlertConfigTargetList build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessAlertConfigAlertConfigTargetList self = new DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessAlertConfigAlertConfigTargetList();
            return TeaModel.build(map, self);
        }

        public DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessAlertConfigAlertConfigTargetList setTarget(java.util.List<DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessAlertConfigAlertConfigTargetListTarget> target) {
            this.target = target;
            return this;
        }
        public java.util.List<DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessAlertConfigAlertConfigTargetListTarget> getTarget() {
            return this.target;
        }

    }

    public static class DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessAlertConfigAlertConfig extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("EffectiveInterval")
        public String effectiveInterval;

        @NameInMap("EscalationsLevel")
        public String escalationsLevel;

        @NameInMap("NoEffectiveInterval")
        public String noEffectiveInterval;

        @NameInMap("SilenceTime")
        public String silenceTime;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("TargetList")
        public DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessAlertConfigAlertConfigTargetList targetList;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public String times;

        @NameInMap("Webhook")
        public String webhook;

        public static DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessAlertConfigAlertConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessAlertConfigAlertConfig self = new DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessAlertConfigAlertConfig();
            return TeaModel.build(map, self);
        }

        public DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessAlertConfigAlertConfig setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessAlertConfigAlertConfig setEffectiveInterval(String effectiveInterval) {
            this.effectiveInterval = effectiveInterval;
            return this;
        }
        public String getEffectiveInterval() {
            return this.effectiveInterval;
        }

        public DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessAlertConfigAlertConfig setEscalationsLevel(String escalationsLevel) {
            this.escalationsLevel = escalationsLevel;
            return this;
        }
        public String getEscalationsLevel() {
            return this.escalationsLevel;
        }

        public DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessAlertConfigAlertConfig setNoEffectiveInterval(String noEffectiveInterval) {
            this.noEffectiveInterval = noEffectiveInterval;
            return this;
        }
        public String getNoEffectiveInterval() {
            return this.noEffectiveInterval;
        }

        public DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessAlertConfigAlertConfig setSilenceTime(String silenceTime) {
            this.silenceTime = silenceTime;
            return this;
        }
        public String getSilenceTime() {
            return this.silenceTime;
        }

        public DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessAlertConfigAlertConfig setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessAlertConfigAlertConfig setTargetList(DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessAlertConfigAlertConfigTargetList targetList) {
            this.targetList = targetList;
            return this;
        }
        public DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessAlertConfigAlertConfigTargetList getTargetList() {
            return this.targetList;
        }

        public DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessAlertConfigAlertConfig setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessAlertConfigAlertConfig setTimes(String times) {
            this.times = times;
            return this;
        }
        public String getTimes() {
            return this.times;
        }

        public DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessAlertConfigAlertConfig setWebhook(String webhook) {
            this.webhook = webhook;
            return this;
        }
        public String getWebhook() {
            return this.webhook;
        }

    }

    public static class DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessAlertConfig extends TeaModel {
        @NameInMap("AlertConfig")
        public java.util.List<DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessAlertConfigAlertConfig> alertConfig;

        public static DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessAlertConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessAlertConfig self = new DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessAlertConfig();
            return TeaModel.build(map, self);
        }

        public DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessAlertConfig setAlertConfig(java.util.List<DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessAlertConfigAlertConfig> alertConfig) {
            this.alertConfig = alertConfig;
            return this;
        }
        public java.util.List<DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessAlertConfigAlertConfig> getAlertConfig() {
            return this.alertConfig;
        }

    }

    public static class DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessMatchExpressMatchExpress extends TeaModel {
        @NameInMap("Function")
        public String function;

        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessMatchExpressMatchExpress build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessMatchExpressMatchExpress self = new DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessMatchExpressMatchExpress();
            return TeaModel.build(map, self);
        }

        public DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessMatchExpressMatchExpress setFunction(String function) {
            this.function = function;
            return this;
        }
        public String getFunction() {
            return this.function;
        }

        public DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessMatchExpressMatchExpress setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessMatchExpressMatchExpress setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessMatchExpress extends TeaModel {
        @NameInMap("MatchExpress")
        public java.util.List<DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessMatchExpressMatchExpress> matchExpress;

        public static DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessMatchExpress build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessMatchExpress self = new DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessMatchExpress();
            return TeaModel.build(map, self);
        }

        public DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessMatchExpress setMatchExpress(java.util.List<DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessMatchExpressMatchExpress> matchExpress) {
            this.matchExpress = matchExpress;
            return this;
        }
        public java.util.List<DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessMatchExpressMatchExpress> getMatchExpress() {
            return this.matchExpress;
        }

    }

    public static class DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcess extends TeaModel {
        @NameInMap("AlertConfig")
        public DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessAlertConfig alertConfig;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Id")
        public String id;

        @NameInMap("MatchExpress")
        public DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessMatchExpress matchExpress;

        @NameInMap("MatchExpressFilterRelation")
        public String matchExpressFilterRelation;

        @NameInMap("ProcessName")
        public String processName;

        public static DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcess build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcess self = new DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcess();
            return TeaModel.build(map, self);
        }

        public DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcess setAlertConfig(DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessAlertConfig alertConfig) {
            this.alertConfig = alertConfig;
            return this;
        }
        public DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessAlertConfig getAlertConfig() {
            return this.alertConfig;
        }

        public DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcess setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcess setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcess setMatchExpress(DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessMatchExpress matchExpress) {
            this.matchExpress = matchExpress;
            return this;
        }
        public DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcessMatchExpress getMatchExpress() {
            return this.matchExpress;
        }

        public DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcess setMatchExpressFilterRelation(String matchExpressFilterRelation) {
            this.matchExpressFilterRelation = matchExpressFilterRelation;
            return this;
        }
        public String getMatchExpressFilterRelation() {
            return this.matchExpressFilterRelation;
        }

        public DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcess setProcessName(String processName) {
            this.processName = processName;
            return this;
        }
        public String getProcessName() {
            return this.processName;
        }

    }

    public static class DescribeGroupMonitoringAgentProcessResponseBodyProcesses extends TeaModel {
        @NameInMap("Process")
        public java.util.List<DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcess> process;

        public static DescribeGroupMonitoringAgentProcessResponseBodyProcesses build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupMonitoringAgentProcessResponseBodyProcesses self = new DescribeGroupMonitoringAgentProcessResponseBodyProcesses();
            return TeaModel.build(map, self);
        }

        public DescribeGroupMonitoringAgentProcessResponseBodyProcesses setProcess(java.util.List<DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcess> process) {
            this.process = process;
            return this;
        }
        public java.util.List<DescribeGroupMonitoringAgentProcessResponseBodyProcessesProcess> getProcess() {
            return this.process;
        }

    }

}
