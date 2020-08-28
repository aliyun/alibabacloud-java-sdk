// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteMonitorAttributeResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MetricRules")
    @Validation(required = true)
    public DescribeSiteMonitorAttributeResponseMetricRules metricRules;

    @NameInMap("SiteMonitors")
    @Validation(required = true)
    public DescribeSiteMonitorAttributeResponseSiteMonitors siteMonitors;

    public static DescribeSiteMonitorAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteMonitorAttributeResponse self = new DescribeSiteMonitorAttributeResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeSiteMonitorAttributeResponseMetricRulesMetricRule extends TeaModel {
        @NameInMap("RuleId")
        @Validation(required = true)
        public String ruleId;

        @NameInMap("RuleName")
        @Validation(required = true)
        public String ruleName;

        @NameInMap("Namespace")
        @Validation(required = true)
        public String namespace;

        @NameInMap("MetricName")
        @Validation(required = true)
        public String metricName;

        @NameInMap("OkActions")
        @Validation(required = true)
        public String okActions;

        @NameInMap("AlarmActions")
        @Validation(required = true)
        public String alarmActions;

        @NameInMap("Statistics")
        @Validation(required = true)
        public String statistics;

        @NameInMap("ActionEnable")
        @Validation(required = true)
        public String actionEnable;

        @NameInMap("Period")
        @Validation(required = true)
        public String period;

        @NameInMap("ComparisonOperator")
        @Validation(required = true)
        public String comparisonOperator;

        @NameInMap("Threshold")
        @Validation(required = true)
        public String threshold;

        @NameInMap("EvaluationCount")
        @Validation(required = true)
        public String evaluationCount;

        @NameInMap("Level")
        @Validation(required = true)
        public String level;

        @NameInMap("Expression")
        @Validation(required = true)
        public String expression;

        @NameInMap("StateValue")
        @Validation(required = true)
        public String stateValue;

        @NameInMap("Dimensions")
        @Validation(required = true)
        public String dimensions;

        public static DescribeSiteMonitorAttributeResponseMetricRulesMetricRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorAttributeResponseMetricRulesMetricRule self = new DescribeSiteMonitorAttributeResponseMetricRulesMetricRule();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeSiteMonitorAttributeResponseMetricRules extends TeaModel {
        @NameInMap("MetricRule")
        @Validation(required = true)
        public java.util.List<DescribeSiteMonitorAttributeResponseMetricRulesMetricRule> metricRule;

        public static DescribeSiteMonitorAttributeResponseMetricRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorAttributeResponseMetricRules self = new DescribeSiteMonitorAttributeResponseMetricRules();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeSiteMonitorAttributeResponseSiteMonitorsIspCitiesIspCity extends TeaModel {
        @NameInMap("CityName")
        @Validation(required = true)
        public String cityName;

        @NameInMap("IspName")
        @Validation(required = true)
        public String ispName;

        @NameInMap("City")
        @Validation(required = true)
        public String city;

        @NameInMap("Isp")
        @Validation(required = true)
        public String isp;

        public static DescribeSiteMonitorAttributeResponseSiteMonitorsIspCitiesIspCity build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorAttributeResponseSiteMonitorsIspCitiesIspCity self = new DescribeSiteMonitorAttributeResponseSiteMonitorsIspCitiesIspCity();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeSiteMonitorAttributeResponseSiteMonitorsIspCities extends TeaModel {
        @NameInMap("IspCity")
        @Validation(required = true)
        public java.util.List<DescribeSiteMonitorAttributeResponseSiteMonitorsIspCitiesIspCity> ispCity;

        public static DescribeSiteMonitorAttributeResponseSiteMonitorsIspCities build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorAttributeResponseSiteMonitorsIspCities self = new DescribeSiteMonitorAttributeResponseSiteMonitorsIspCities();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeSiteMonitorAttributeResponseSiteMonitorsOptionJson extends TeaModel {
        @NameInMap("dns_type")
        @Validation(required = true)
        public String dnsType;

        @NameInMap("dns_server")
        @Validation(required = true)
        public String dnsServer;

        @NameInMap("expect_value")
        @Validation(required = true)
        public String expectValue;

        @NameInMap("http_method")
        @Validation(required = true)
        public String httpMethod;

        @NameInMap("response_content")
        @Validation(required = true)
        public String responseContent;

        @NameInMap("match_rule")
        @Validation(required = true)
        public Integer matchRule;

        @NameInMap("request_content")
        @Validation(required = true)
        public String requestContent;

        @NameInMap("cookie")
        @Validation(required = true)
        public String cookie;

        @NameInMap("header")
        @Validation(required = true)
        public String header;

        @NameInMap("username")
        @Validation(required = true)
        public String username;

        @NameInMap("password")
        @Validation(required = true)
        public String password;

        @NameInMap("time_out")
        @Validation(required = true)
        public Long timeOut;

        @NameInMap("ping_num")
        @Validation(required = true)
        public Integer pingNum;

        @NameInMap("failure_rate")
        @Validation(required = true)
        public Double failureRate;

        @NameInMap("request_format")
        @Validation(required = true)
        public String requestFormat;

        @NameInMap("response_format")
        @Validation(required = true)
        public String responseFormat;

        @NameInMap("port")
        @Validation(required = true)
        public Integer port;

        @NameInMap("authentication")
        @Validation(required = true)
        public Integer authentication;

        @NameInMap("traceroute")
        @Validation(required = true)
        public Long traceroute;

        public static DescribeSiteMonitorAttributeResponseSiteMonitorsOptionJson build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorAttributeResponseSiteMonitorsOptionJson self = new DescribeSiteMonitorAttributeResponseSiteMonitorsOptionJson();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeSiteMonitorAttributeResponseSiteMonitors extends TeaModel {
        @NameInMap("TaskType")
        @Validation(required = true)
        public String taskType;

        @NameInMap("Address")
        @Validation(required = true)
        public String address;

        @NameInMap("TaskState")
        @Validation(required = true)
        public String taskState;

        @NameInMap("TaskName")
        @Validation(required = true)
        public String taskName;

        @NameInMap("Interval")
        @Validation(required = true)
        public String interval;

        @NameInMap("TaskId")
        @Validation(required = true)
        public String taskId;

        @NameInMap("IspCities")
        @Validation(required = true)
        public DescribeSiteMonitorAttributeResponseSiteMonitorsIspCities ispCities;

        @NameInMap("OptionJson")
        @Validation(required = true)
        public DescribeSiteMonitorAttributeResponseSiteMonitorsOptionJson optionJson;

        public static DescribeSiteMonitorAttributeResponseSiteMonitors build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorAttributeResponseSiteMonitors self = new DescribeSiteMonitorAttributeResponseSiteMonitors();
            return TeaModel.build(map, self);
        }

    }

}
