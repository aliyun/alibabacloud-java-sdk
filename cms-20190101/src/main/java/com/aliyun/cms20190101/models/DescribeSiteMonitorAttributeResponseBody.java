// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteMonitorAttributeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("SiteMonitors")
    public DescribeSiteMonitorAttributeResponseBodySiteMonitors siteMonitors;

    @NameInMap("MetricRules")
    public DescribeSiteMonitorAttributeResponseBodyMetricRules metricRules;

    public static DescribeSiteMonitorAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteMonitorAttributeResponseBody self = new DescribeSiteMonitorAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSiteMonitorAttributeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSiteMonitorAttributeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSiteMonitorAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSiteMonitorAttributeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeSiteMonitorAttributeResponseBody setSiteMonitors(DescribeSiteMonitorAttributeResponseBodySiteMonitors siteMonitors) {
        this.siteMonitors = siteMonitors;
        return this;
    }
    public DescribeSiteMonitorAttributeResponseBodySiteMonitors getSiteMonitors() {
        return this.siteMonitors;
    }

    public DescribeSiteMonitorAttributeResponseBody setMetricRules(DescribeSiteMonitorAttributeResponseBodyMetricRules metricRules) {
        this.metricRules = metricRules;
        return this;
    }
    public DescribeSiteMonitorAttributeResponseBodyMetricRules getMetricRules() {
        return this.metricRules;
    }

    public static class DescribeSiteMonitorAttributeResponseBodySiteMonitorsIspCitiesIspCity extends TeaModel {
        @NameInMap("City")
        public String city;

        @NameInMap("IspName")
        public String ispName;

        @NameInMap("Isp")
        public String isp;

        @NameInMap("CityName")
        public String cityName;

        public static DescribeSiteMonitorAttributeResponseBodySiteMonitorsIspCitiesIspCity build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorAttributeResponseBodySiteMonitorsIspCitiesIspCity self = new DescribeSiteMonitorAttributeResponseBodySiteMonitorsIspCitiesIspCity();
            return TeaModel.build(map, self);
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsIspCitiesIspCity setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsIspCitiesIspCity setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsIspCitiesIspCity setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsIspCitiesIspCity setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

    }

    public static class DescribeSiteMonitorAttributeResponseBodySiteMonitorsIspCities extends TeaModel {
        @NameInMap("IspCity")
        public java.util.List<DescribeSiteMonitorAttributeResponseBodySiteMonitorsIspCitiesIspCity> ispCity;

        public static DescribeSiteMonitorAttributeResponseBodySiteMonitorsIspCities build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorAttributeResponseBodySiteMonitorsIspCities self = new DescribeSiteMonitorAttributeResponseBodySiteMonitorsIspCities();
            return TeaModel.build(map, self);
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsIspCities setIspCity(java.util.List<DescribeSiteMonitorAttributeResponseBodySiteMonitorsIspCitiesIspCity> ispCity) {
            this.ispCity = ispCity;
            return this;
        }
        public java.util.List<DescribeSiteMonitorAttributeResponseBodySiteMonitorsIspCitiesIspCity> getIspCity() {
            return this.ispCity;
        }

    }

    public static class DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson extends TeaModel {
        @NameInMap("request_format")
        public String requestFormat;

        @NameInMap("response_content")
        public String responseContent;

        @NameInMap("port")
        public Integer port;

        @NameInMap("authentication")
        public Integer authentication;

        @NameInMap("match_rule")
        public Integer matchRule;

        @NameInMap("request_content")
        public String requestContent;

        @NameInMap("username")
        public String username;

        @NameInMap("dns_type")
        public String dnsType;

        @NameInMap("response_format")
        public String responseFormat;

        @NameInMap("password")
        public String password;

        @NameInMap("expect_value")
        public String expectValue;

        @NameInMap("time_out")
        public Long timeOut;

        @NameInMap("failure_rate")
        public Float failureRate;

        @NameInMap("header")
        public String header;

        @NameInMap("cookie")
        public String cookie;

        @NameInMap("ping_num")
        public Integer pingNum;

        @NameInMap("http_method")
        public String httpMethod;

        @NameInMap("dns_server")
        public String dnsServer;

        public static DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson self = new DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson();
            return TeaModel.build(map, self);
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setRequestFormat(String requestFormat) {
            this.requestFormat = requestFormat;
            return this;
        }
        public String getRequestFormat() {
            return this.requestFormat;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setResponseContent(String responseContent) {
            this.responseContent = responseContent;
            return this;
        }
        public String getResponseContent() {
            return this.responseContent;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setAuthentication(Integer authentication) {
            this.authentication = authentication;
            return this;
        }
        public Integer getAuthentication() {
            return this.authentication;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setMatchRule(Integer matchRule) {
            this.matchRule = matchRule;
            return this;
        }
        public Integer getMatchRule() {
            return this.matchRule;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setRequestContent(String requestContent) {
            this.requestContent = requestContent;
            return this;
        }
        public String getRequestContent() {
            return this.requestContent;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setDnsType(String dnsType) {
            this.dnsType = dnsType;
            return this;
        }
        public String getDnsType() {
            return this.dnsType;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setResponseFormat(String responseFormat) {
            this.responseFormat = responseFormat;
            return this;
        }
        public String getResponseFormat() {
            return this.responseFormat;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setExpectValue(String expectValue) {
            this.expectValue = expectValue;
            return this;
        }
        public String getExpectValue() {
            return this.expectValue;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setTimeOut(Long timeOut) {
            this.timeOut = timeOut;
            return this;
        }
        public Long getTimeOut() {
            return this.timeOut;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setFailureRate(Float failureRate) {
            this.failureRate = failureRate;
            return this;
        }
        public Float getFailureRate() {
            return this.failureRate;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setHeader(String header) {
            this.header = header;
            return this;
        }
        public String getHeader() {
            return this.header;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setCookie(String cookie) {
            this.cookie = cookie;
            return this;
        }
        public String getCookie() {
            return this.cookie;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setPingNum(Integer pingNum) {
            this.pingNum = pingNum;
            return this;
        }
        public Integer getPingNum() {
            return this.pingNum;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setHttpMethod(String httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }
        public String getHttpMethod() {
            return this.httpMethod;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setDnsServer(String dnsServer) {
            this.dnsServer = dnsServer;
            return this;
        }
        public String getDnsServer() {
            return this.dnsServer;
        }

    }

    public static class DescribeSiteMonitorAttributeResponseBodySiteMonitors extends TeaModel {
        @NameInMap("TaskType")
        public String taskType;

        @NameInMap("Interval")
        public String interval;

        @NameInMap("TaskState")
        public String taskState;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("Address")
        public String address;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("IspCities")
        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsIspCities ispCities;

        @NameInMap("OptionJson")
        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson optionJson;

        public static DescribeSiteMonitorAttributeResponseBodySiteMonitors build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorAttributeResponseBodySiteMonitors self = new DescribeSiteMonitorAttributeResponseBodySiteMonitors();
            return TeaModel.build(map, self);
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitors setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitors setInterval(String interval) {
            this.interval = interval;
            return this;
        }
        public String getInterval() {
            return this.interval;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitors setTaskState(String taskState) {
            this.taskState = taskState;
            return this;
        }
        public String getTaskState() {
            return this.taskState;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitors setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitors setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitors setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitors setIspCities(DescribeSiteMonitorAttributeResponseBodySiteMonitorsIspCities ispCities) {
            this.ispCities = ispCities;
            return this;
        }
        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsIspCities getIspCities() {
            return this.ispCities;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitors setOptionJson(DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson optionJson) {
            this.optionJson = optionJson;
            return this;
        }
        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson getOptionJson() {
            return this.optionJson;
        }

    }

    public static class DescribeSiteMonitorAttributeResponseBodyMetricRulesMetricRule extends TeaModel {
        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("EvaluationCount")
        public String evaluationCount;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("OkActions")
        public String okActions;

        @NameInMap("AlarmActions")
        public String alarmActions;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("Period")
        public String period;

        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("Expression")
        public String expression;

        @NameInMap("Dimensions")
        public String dimensions;

        @NameInMap("StateValue")
        public String stateValue;

        @NameInMap("ActionEnable")
        public String actionEnable;

        @NameInMap("Level")
        public String level;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Statistics")
        public String statistics;

        public static DescribeSiteMonitorAttributeResponseBodyMetricRulesMetricRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorAttributeResponseBodyMetricRulesMetricRule self = new DescribeSiteMonitorAttributeResponseBodyMetricRulesMetricRule();
            return TeaModel.build(map, self);
        }

        public DescribeSiteMonitorAttributeResponseBodyMetricRulesMetricRule setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeSiteMonitorAttributeResponseBodyMetricRulesMetricRule setEvaluationCount(String evaluationCount) {
            this.evaluationCount = evaluationCount;
            return this;
        }
        public String getEvaluationCount() {
            return this.evaluationCount;
        }

        public DescribeSiteMonitorAttributeResponseBodyMetricRulesMetricRule setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeSiteMonitorAttributeResponseBodyMetricRulesMetricRule setOkActions(String okActions) {
            this.okActions = okActions;
            return this;
        }
        public String getOkActions() {
            return this.okActions;
        }

        public DescribeSiteMonitorAttributeResponseBodyMetricRulesMetricRule setAlarmActions(String alarmActions) {
            this.alarmActions = alarmActions;
            return this;
        }
        public String getAlarmActions() {
            return this.alarmActions;
        }

        public DescribeSiteMonitorAttributeResponseBodyMetricRulesMetricRule setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeSiteMonitorAttributeResponseBodyMetricRulesMetricRule setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeSiteMonitorAttributeResponseBodyMetricRulesMetricRule setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public DescribeSiteMonitorAttributeResponseBodyMetricRulesMetricRule setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public DescribeSiteMonitorAttributeResponseBodyMetricRulesMetricRule setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public DescribeSiteMonitorAttributeResponseBodyMetricRulesMetricRule setDimensions(String dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public String getDimensions() {
            return this.dimensions;
        }

        public DescribeSiteMonitorAttributeResponseBodyMetricRulesMetricRule setStateValue(String stateValue) {
            this.stateValue = stateValue;
            return this;
        }
        public String getStateValue() {
            return this.stateValue;
        }

        public DescribeSiteMonitorAttributeResponseBodyMetricRulesMetricRule setActionEnable(String actionEnable) {
            this.actionEnable = actionEnable;
            return this;
        }
        public String getActionEnable() {
            return this.actionEnable;
        }

        public DescribeSiteMonitorAttributeResponseBodyMetricRulesMetricRule setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeSiteMonitorAttributeResponseBodyMetricRulesMetricRule setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public DescribeSiteMonitorAttributeResponseBodyMetricRulesMetricRule setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

    }

    public static class DescribeSiteMonitorAttributeResponseBodyMetricRules extends TeaModel {
        @NameInMap("MetricRule")
        public java.util.List<DescribeSiteMonitorAttributeResponseBodyMetricRulesMetricRule> metricRule;

        public static DescribeSiteMonitorAttributeResponseBodyMetricRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorAttributeResponseBodyMetricRules self = new DescribeSiteMonitorAttributeResponseBodyMetricRules();
            return TeaModel.build(map, self);
        }

        public DescribeSiteMonitorAttributeResponseBodyMetricRules setMetricRule(java.util.List<DescribeSiteMonitorAttributeResponseBodyMetricRulesMetricRule> metricRule) {
            this.metricRule = metricRule;
            return this;
        }
        public java.util.List<DescribeSiteMonitorAttributeResponseBodyMetricRulesMetricRule> getMetricRule() {
            return this.metricRule;
        }

    }

}
