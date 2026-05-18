// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteMonitorAttributeResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
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
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("MetricRules")
    public DescribeSiteMonitorAttributeResponseBodyMetricRules metricRules;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D17DF650-7EBD-54D0-903A-1D4E624D7402</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the site monitoring task.</p>
     */
    @NameInMap("SiteMonitors")
    public DescribeSiteMonitorAttributeResponseBodySiteMonitors siteMonitors;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

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

    public DescribeSiteMonitorAttributeResponseBody setMetricRules(DescribeSiteMonitorAttributeResponseBodyMetricRules metricRules) {
        this.metricRules = metricRules;
        return this;
    }
    public DescribeSiteMonitorAttributeResponseBodyMetricRules getMetricRules() {
        return this.metricRules;
    }

    public DescribeSiteMonitorAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSiteMonitorAttributeResponseBody setSiteMonitors(DescribeSiteMonitorAttributeResponseBodySiteMonitors siteMonitors) {
        this.siteMonitors = siteMonitors;
        return this;
    }
    public DescribeSiteMonitorAttributeResponseBodySiteMonitors getSiteMonitors() {
        return this.siteMonitors;
    }

    public DescribeSiteMonitorAttributeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeSiteMonitorAttributeResponseBodyMetricRulesMetricRule extends TeaModel {
        @NameInMap("ActionEnable")
        public String actionEnable;

        @NameInMap("AlarmActions")
        public String alarmActions;

        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("Dimensions")
        public String dimensions;

        @NameInMap("EvaluationCount")
        public String evaluationCount;

        @NameInMap("Expression")
        public String expression;

        @NameInMap("Level")
        public String level;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("OkActions")
        public String okActions;

        @NameInMap("Period")
        public String period;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("StateValue")
        public String stateValue;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public String threshold;

        public static DescribeSiteMonitorAttributeResponseBodyMetricRulesMetricRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorAttributeResponseBodyMetricRulesMetricRule self = new DescribeSiteMonitorAttributeResponseBodyMetricRulesMetricRule();
            return TeaModel.build(map, self);
        }

        public DescribeSiteMonitorAttributeResponseBodyMetricRulesMetricRule setActionEnable(String actionEnable) {
            this.actionEnable = actionEnable;
            return this;
        }
        public String getActionEnable() {
            return this.actionEnable;
        }

        public DescribeSiteMonitorAttributeResponseBodyMetricRulesMetricRule setAlarmActions(String alarmActions) {
            this.alarmActions = alarmActions;
            return this;
        }
        public String getAlarmActions() {
            return this.alarmActions;
        }

        public DescribeSiteMonitorAttributeResponseBodyMetricRulesMetricRule setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public DescribeSiteMonitorAttributeResponseBodyMetricRulesMetricRule setDimensions(String dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public String getDimensions() {
            return this.dimensions;
        }

        public DescribeSiteMonitorAttributeResponseBodyMetricRulesMetricRule setEvaluationCount(String evaluationCount) {
            this.evaluationCount = evaluationCount;
            return this;
        }
        public String getEvaluationCount() {
            return this.evaluationCount;
        }

        public DescribeSiteMonitorAttributeResponseBodyMetricRulesMetricRule setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public DescribeSiteMonitorAttributeResponseBodyMetricRulesMetricRule setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeSiteMonitorAttributeResponseBodyMetricRulesMetricRule setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
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

        public DescribeSiteMonitorAttributeResponseBodyMetricRulesMetricRule setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
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

        public DescribeSiteMonitorAttributeResponseBodyMetricRulesMetricRule setStateValue(String stateValue) {
            this.stateValue = stateValue;
            return this;
        }
        public String getStateValue() {
            return this.stateValue;
        }

        public DescribeSiteMonitorAttributeResponseBodyMetricRulesMetricRule setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public DescribeSiteMonitorAttributeResponseBodyMetricRulesMetricRule setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
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

    public static class DescribeSiteMonitorAttributeResponseBodySiteMonitorsCustomScheduleDays extends TeaModel {
        @NameInMap("days")
        public java.util.List<Integer> days;

        public static DescribeSiteMonitorAttributeResponseBodySiteMonitorsCustomScheduleDays build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorAttributeResponseBodySiteMonitorsCustomScheduleDays self = new DescribeSiteMonitorAttributeResponseBodySiteMonitorsCustomScheduleDays();
            return TeaModel.build(map, self);
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsCustomScheduleDays setDays(java.util.List<Integer> days) {
            this.days = days;
            return this;
        }
        public java.util.List<Integer> getDays() {
            return this.days;
        }

    }

    public static class DescribeSiteMonitorAttributeResponseBodySiteMonitorsCustomSchedule extends TeaModel {
        @NameInMap("days")
        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsCustomScheduleDays days;

        /**
         * <p>The end time of the detection. Unit: hours.</p>
         * 
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("end_hour")
        public Integer endHour;

        /**
         * <p>The start time of the detection. Unit: hours.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("start_hour")
        public Integer startHour;

        /**
         * <p>The time zone of the detection.</p>
         * 
         * <strong>example:</strong>
         * <p>local</p>
         */
        @NameInMap("time_zone")
        public String timeZone;

        public static DescribeSiteMonitorAttributeResponseBodySiteMonitorsCustomSchedule build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorAttributeResponseBodySiteMonitorsCustomSchedule self = new DescribeSiteMonitorAttributeResponseBodySiteMonitorsCustomSchedule();
            return TeaModel.build(map, self);
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsCustomSchedule setDays(DescribeSiteMonitorAttributeResponseBodySiteMonitorsCustomScheduleDays days) {
            this.days = days;
            return this;
        }
        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsCustomScheduleDays getDays() {
            return this.days;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsCustomSchedule setEndHour(Integer endHour) {
            this.endHour = endHour;
            return this;
        }
        public Integer getEndHour() {
            return this.endHour;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsCustomSchedule setStartHour(Integer startHour) {
            this.startHour = startHour;
            return this;
        }
        public Integer getStartHour() {
            return this.startHour;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsCustomSchedule setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

    public static class DescribeSiteMonitorAttributeResponseBodySiteMonitorsIspCitiesIspCity extends TeaModel {
        @NameInMap("City")
        public String city;

        @NameInMap("CityName")
        public String cityName;

        @NameInMap("Isp")
        public String isp;

        @NameInMap("IspName")
        public String ispName;

        @NameInMap("Type")
        public String type;

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

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsIspCitiesIspCity setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsIspCitiesIspCity setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsIspCitiesIspCity setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsIspCitiesIspCity setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
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

    public static class DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAssertionsAssertions extends TeaModel {
        @NameInMap("operator")
        public String operator;

        @NameInMap("property")
        public String property;

        @NameInMap("target")
        public String target;

        @NameInMap("type")
        public String type;

        public static DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAssertionsAssertions build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAssertionsAssertions self = new DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAssertionsAssertions();
            return TeaModel.build(map, self);
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAssertionsAssertions setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAssertionsAssertions setProperty(String property) {
            this.property = property;
            return this;
        }
        public String getProperty() {
            return this.property;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAssertionsAssertions setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAssertionsAssertions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAssertions extends TeaModel {
        @NameInMap("assertions")
        public java.util.List<DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAssertionsAssertions> assertions;

        public static DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAssertions build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAssertions self = new DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAssertions();
            return TeaModel.build(map, self);
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAssertions setAssertions(java.util.List<DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAssertionsAssertions> assertions) {
            this.assertions = assertions;
            return this;
        }
        public java.util.List<DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAssertionsAssertions> getAssertions() {
            return this.assertions;
        }

    }

    public static class DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAuthInfoScopes extends TeaModel {
        @NameInMap("scopes")
        public java.util.List<String> scopes;

        public static DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAuthInfoScopes build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAuthInfoScopes self = new DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAuthInfoScopes();
            return TeaModel.build(map, self);
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAuthInfoScopes setScopes(java.util.List<String> scopes) {
            this.scopes = scopes;
            return this;
        }
        public java.util.List<String> getScopes() {
            return this.scopes;
        }

    }

    public static class DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAuthInfo extends TeaModel {
        @NameInMap("access_key_id")
        public String accessKeyId;

        @NameInMap("access_key_secret")
        public String accessKeySecret;

        @NameInMap("api_action")
        public String apiAction;

        @NameInMap("api_version")
        public String apiVersion;

        @NameInMap("auth_style")
        public String authStyle;

        @NameInMap("client_id")
        public String clientId;

        @NameInMap("client_secret")
        public String clientSecret;

        @NameInMap("grant_type")
        public String grantType;

        @NameInMap("password")
        public String password;

        @NameInMap("region_id")
        public String regionId;

        @NameInMap("scopes")
        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAuthInfoScopes scopes;

        @NameInMap("service_name")
        public String serviceName;

        @NameInMap("session_token")
        public String sessionToken;

        @NameInMap("token_url")
        public String tokenUrl;

        @NameInMap("type")
        public String type;

        @NameInMap("use_cookie_session_key")
        public Boolean useCookieSessionKey;

        @NameInMap("username")
        public String username;

        @NameInMap("with_addon_resources")
        public Boolean withAddonResources;

        public static DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAuthInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAuthInfo self = new DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAuthInfo();
            return TeaModel.build(map, self);
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAuthInfo setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAuthInfo setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAuthInfo setApiAction(String apiAction) {
            this.apiAction = apiAction;
            return this;
        }
        public String getApiAction() {
            return this.apiAction;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAuthInfo setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public String getApiVersion() {
            return this.apiVersion;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAuthInfo setAuthStyle(String authStyle) {
            this.authStyle = authStyle;
            return this;
        }
        public String getAuthStyle() {
            return this.authStyle;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAuthInfo setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAuthInfo setClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public String getClientSecret() {
            return this.clientSecret;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAuthInfo setGrantType(String grantType) {
            this.grantType = grantType;
            return this;
        }
        public String getGrantType() {
            return this.grantType;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAuthInfo setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAuthInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAuthInfo setScopes(DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAuthInfoScopes scopes) {
            this.scopes = scopes;
            return this;
        }
        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAuthInfoScopes getScopes() {
            return this.scopes;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAuthInfo setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAuthInfo setSessionToken(String sessionToken) {
            this.sessionToken = sessionToken;
            return this;
        }
        public String getSessionToken() {
            return this.sessionToken;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAuthInfo setTokenUrl(String tokenUrl) {
            this.tokenUrl = tokenUrl;
            return this;
        }
        public String getTokenUrl() {
            return this.tokenUrl;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAuthInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAuthInfo setUseCookieSessionKey(Boolean useCookieSessionKey) {
            this.useCookieSessionKey = useCookieSessionKey;
            return this;
        }
        public Boolean getUseCookieSessionKey() {
            return this.useCookieSessionKey;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAuthInfo setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAuthInfo setWithAddonResources(Boolean withAddonResources) {
            this.withAddonResources = withAddonResources;
            return this;
        }
        public Boolean getWithAddonResources() {
            return this.withAddonResources;
        }

    }

    public static class DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonBlockedUrlList extends TeaModel {
        @NameInMap("blocked_url_list")
        public java.util.List<String> blockedUrlList;

        public static DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonBlockedUrlList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonBlockedUrlList self = new DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonBlockedUrlList();
            return TeaModel.build(map, self);
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonBlockedUrlList setBlockedUrlList(java.util.List<String> blockedUrlList) {
            this.blockedUrlList = blockedUrlList;
            return this;
        }
        public java.util.List<String> getBlockedUrlList() {
            return this.blockedUrlList;
        }

    }

    public static class DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonBrowserHeaders extends TeaModel {
        @NameInMap("browser_headers")
        public java.util.List<java.util.Map<String, ?>> browserHeaders;

        public static DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonBrowserHeaders build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonBrowserHeaders self = new DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonBrowserHeaders();
            return TeaModel.build(map, self);
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonBrowserHeaders setBrowserHeaders(java.util.List<java.util.Map<String, ?>> browserHeaders) {
            this.browserHeaders = browserHeaders;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getBrowserHeaders() {
            return this.browserHeaders;
        }

    }

    public static class DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonBrowserHosts extends TeaModel {
        @NameInMap("browser_hosts")
        public java.util.List<String> browserHosts;

        public static DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonBrowserHosts build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonBrowserHosts self = new DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonBrowserHosts();
            return TeaModel.build(map, self);
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonBrowserHosts setBrowserHosts(java.util.List<String> browserHosts) {
            this.browserHosts = browserHosts;
            return this;
        }
        public java.util.List<String> getBrowserHosts() {
            return this.browserHosts;
        }

    }

    public static class DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonBrowserInfoBrowserInfo extends TeaModel {
        @NameInMap("browser")
        public String browser;

        @NameInMap("device")
        public String device;

        public static DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonBrowserInfoBrowserInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonBrowserInfoBrowserInfo self = new DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonBrowserInfoBrowserInfo();
            return TeaModel.build(map, self);
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonBrowserInfoBrowserInfo setBrowser(String browser) {
            this.browser = browser;
            return this;
        }
        public String getBrowser() {
            return this.browser;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonBrowserInfoBrowserInfo setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

    }

    public static class DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonBrowserInfo extends TeaModel {
        @NameInMap("browser_info")
        public java.util.List<DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonBrowserInfoBrowserInfo> browserInfo;

        public static DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonBrowserInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonBrowserInfo self = new DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonBrowserInfo();
            return TeaModel.build(map, self);
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonBrowserInfo setBrowserInfo(java.util.List<DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonBrowserInfoBrowserInfo> browserInfo) {
            this.browserInfo = browserInfo;
            return this;
        }
        public java.util.List<DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonBrowserInfoBrowserInfo> getBrowserInfo() {
            return this.browserInfo;
        }

    }

    public static class DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonConfigVariablesConfigVariables extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("secure")
        public Boolean secure;

        @NameInMap("value")
        public String value;

        public static DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonConfigVariablesConfigVariables build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonConfigVariablesConfigVariables self = new DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonConfigVariablesConfigVariables();
            return TeaModel.build(map, self);
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonConfigVariablesConfigVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonConfigVariablesConfigVariables setSecure(Boolean secure) {
            this.secure = secure;
            return this;
        }
        public Boolean getSecure() {
            return this.secure;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonConfigVariablesConfigVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonConfigVariables extends TeaModel {
        @NameInMap("config_variables")
        public java.util.List<DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonConfigVariablesConfigVariables> configVariables;

        public static DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonConfigVariables build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonConfigVariables self = new DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonConfigVariables();
            return TeaModel.build(map, self);
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonConfigVariables setConfigVariables(java.util.List<DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonConfigVariablesConfigVariables> configVariables) {
            this.configVariables = configVariables;
            return this;
        }
        public java.util.List<DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonConfigVariablesConfigVariables> getConfigVariables() {
            return this.configVariables;
        }

    }

    public static class DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonExpectExistString extends TeaModel {
        @NameInMap("expect_exist_string")
        public java.util.List<String> expectExistString;

        public static DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonExpectExistString build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonExpectExistString self = new DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonExpectExistString();
            return TeaModel.build(map, self);
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonExpectExistString setExpectExistString(java.util.List<String> expectExistString) {
            this.expectExistString = expectExistString;
            return this;
        }
        public java.util.List<String> getExpectExistString() {
            return this.expectExistString;
        }

    }

    public static class DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonExpectNonExistString extends TeaModel {
        @NameInMap("expect_non_exist_string")
        public java.util.List<String> expectNonExistString;

        public static DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonExpectNonExistString build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonExpectNonExistString self = new DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonExpectNonExistString();
            return TeaModel.build(map, self);
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonExpectNonExistString setExpectNonExistString(java.util.List<String> expectNonExistString) {
            this.expectNonExistString = expectNonExistString;
            return this;
        }
        public java.util.List<String> getExpectNonExistString() {
            return this.expectNonExistString;
        }

    }

    public static class DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonQuicTarget extends TeaModel {
        @NameInMap("quic_target")
        public java.util.List<String> quicTarget;

        public static DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonQuicTarget build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonQuicTarget self = new DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonQuicTarget();
            return TeaModel.build(map, self);
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonQuicTarget setQuicTarget(java.util.List<String> quicTarget) {
            this.quicTarget = quicTarget;
            return this;
        }
        public java.util.List<String> getQuicTarget() {
            return this.quicTarget;
        }

    }

    public static class DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonStepsStepsExtractedVariablesExtractedVariablesParser extends TeaModel {
        @NameInMap("parser_type")
        public String parserType;

        @NameInMap("value")
        public String value;

        public static DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonStepsStepsExtractedVariablesExtractedVariablesParser build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonStepsStepsExtractedVariablesExtractedVariablesParser self = new DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonStepsStepsExtractedVariablesExtractedVariablesParser();
            return TeaModel.build(map, self);
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonStepsStepsExtractedVariablesExtractedVariablesParser setParserType(String parserType) {
            this.parserType = parserType;
            return this;
        }
        public String getParserType() {
            return this.parserType;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonStepsStepsExtractedVariablesExtractedVariablesParser setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonStepsStepsExtractedVariablesExtractedVariables extends TeaModel {
        @NameInMap("extracted_type")
        public String extractedType;

        @NameInMap("field")
        public String field;

        @NameInMap("name")
        public String name;

        @NameInMap("parser")
        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonStepsStepsExtractedVariablesExtractedVariablesParser parser;

        public static DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonStepsStepsExtractedVariablesExtractedVariables build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonStepsStepsExtractedVariablesExtractedVariables self = new DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonStepsStepsExtractedVariablesExtractedVariables();
            return TeaModel.build(map, self);
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonStepsStepsExtractedVariablesExtractedVariables setExtractedType(String extractedType) {
            this.extractedType = extractedType;
            return this;
        }
        public String getExtractedType() {
            return this.extractedType;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonStepsStepsExtractedVariablesExtractedVariables setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonStepsStepsExtractedVariablesExtractedVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonStepsStepsExtractedVariablesExtractedVariables setParser(DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonStepsStepsExtractedVariablesExtractedVariablesParser parser) {
            this.parser = parser;
            return this;
        }
        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonStepsStepsExtractedVariablesExtractedVariablesParser getParser() {
            return this.parser;
        }

    }

    public static class DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonStepsStepsExtractedVariables extends TeaModel {
        @NameInMap("extracted_variables")
        public java.util.List<DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonStepsStepsExtractedVariablesExtractedVariables> extractedVariables;

        public static DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonStepsStepsExtractedVariables build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonStepsStepsExtractedVariables self = new DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonStepsStepsExtractedVariables();
            return TeaModel.build(map, self);
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonStepsStepsExtractedVariables setExtractedVariables(java.util.List<DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonStepsStepsExtractedVariablesExtractedVariables> extractedVariables) {
            this.extractedVariables = extractedVariables;
            return this;
        }
        public java.util.List<DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonStepsStepsExtractedVariablesExtractedVariables> getExtractedVariables() {
            return this.extractedVariables;
        }

    }

    public static class DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonStepsSteps extends TeaModel {
        @NameInMap("allow_failure")
        public Boolean allowFailure;

        @NameInMap("auto_extract_cookie")
        public Boolean autoExtractCookie;

        @NameInMap("extracted_variables")
        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonStepsStepsExtractedVariables extractedVariables;

        @NameInMap("is_critical")
        public Boolean isCritical;

        @NameInMap("name")
        @Deprecated
        public String name;

        @NameInMap("option")
        public String option;

        @NameInMap("step_name")
        public String stepName;

        @NameInMap("step_type")
        public String stepType;

        @NameInMap("url")
        public String url;

        @NameInMap("use_generated_cookie")
        public Boolean useGeneratedCookie;

        @NameInMap("wait_time_in_secs")
        public Integer waitTimeInSecs;

        public static DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonStepsSteps build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonStepsSteps self = new DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonStepsSteps();
            return TeaModel.build(map, self);
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonStepsSteps setAllowFailure(Boolean allowFailure) {
            this.allowFailure = allowFailure;
            return this;
        }
        public Boolean getAllowFailure() {
            return this.allowFailure;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonStepsSteps setAutoExtractCookie(Boolean autoExtractCookie) {
            this.autoExtractCookie = autoExtractCookie;
            return this;
        }
        public Boolean getAutoExtractCookie() {
            return this.autoExtractCookie;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonStepsSteps setExtractedVariables(DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonStepsStepsExtractedVariables extractedVariables) {
            this.extractedVariables = extractedVariables;
            return this;
        }
        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonStepsStepsExtractedVariables getExtractedVariables() {
            return this.extractedVariables;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonStepsSteps setIsCritical(Boolean isCritical) {
            this.isCritical = isCritical;
            return this;
        }
        public Boolean getIsCritical() {
            return this.isCritical;
        }

        @Deprecated
        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonStepsSteps setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonStepsSteps setOption(String option) {
            this.option = option;
            return this;
        }
        public String getOption() {
            return this.option;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonStepsSteps setStepName(String stepName) {
            this.stepName = stepName;
            return this;
        }
        public String getStepName() {
            return this.stepName;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonStepsSteps setStepType(String stepType) {
            this.stepType = stepType;
            return this;
        }
        public String getStepType() {
            return this.stepType;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonStepsSteps setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonStepsSteps setUseGeneratedCookie(Boolean useGeneratedCookie) {
            this.useGeneratedCookie = useGeneratedCookie;
            return this;
        }
        public Boolean getUseGeneratedCookie() {
            return this.useGeneratedCookie;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonStepsSteps setWaitTimeInSecs(Integer waitTimeInSecs) {
            this.waitTimeInSecs = waitTimeInSecs;
            return this;
        }
        public Integer getWaitTimeInSecs() {
            return this.waitTimeInSecs;
        }

    }

    public static class DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonSteps extends TeaModel {
        @NameInMap("steps")
        public java.util.List<DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonStepsSteps> steps;

        public static DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonSteps build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonSteps self = new DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonSteps();
            return TeaModel.build(map, self);
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonSteps setSteps(java.util.List<DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonStepsSteps> steps) {
            this.steps = steps;
            return this;
        }
        public java.util.List<DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonStepsSteps> getSteps() {
            return this.steps;
        }

    }

    public static class DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonTrafficHijackElementBlacklist extends TeaModel {
        @NameInMap("traffic_hijack_element_blacklist")
        public java.util.List<String> trafficHijackElementBlacklist;

        public static DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonTrafficHijackElementBlacklist build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonTrafficHijackElementBlacklist self = new DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonTrafficHijackElementBlacklist();
            return TeaModel.build(map, self);
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonTrafficHijackElementBlacklist setTrafficHijackElementBlacklist(java.util.List<String> trafficHijackElementBlacklist) {
            this.trafficHijackElementBlacklist = trafficHijackElementBlacklist;
            return this;
        }
        public java.util.List<String> getTrafficHijackElementBlacklist() {
            return this.trafficHijackElementBlacklist;
        }

    }

    public static class DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonTrafficHijackElementWhitelist extends TeaModel {
        @NameInMap("traffic_hijack_element_whitelist")
        public java.util.List<String> trafficHijackElementWhitelist;

        public static DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonTrafficHijackElementWhitelist build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonTrafficHijackElementWhitelist self = new DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonTrafficHijackElementWhitelist();
            return TeaModel.build(map, self);
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonTrafficHijackElementWhitelist setTrafficHijackElementWhitelist(java.util.List<String> trafficHijackElementWhitelist) {
            this.trafficHijackElementWhitelist = trafficHijackElementWhitelist;
            return this;
        }
        public java.util.List<String> getTrafficHijackElementWhitelist() {
            return this.trafficHijackElementWhitelist;
        }

    }

    public static class DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson extends TeaModel {
        @NameInMap("assertions")
        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAssertions assertions;

        /**
         * <p>The number of retries after a DNS failure occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("attempts")
        public Long attempts;

        @NameInMap("auth_info")
        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAuthInfo authInfo;

        @NameInMap("blocked_url_list")
        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonBlockedUrlList blockedUrlList;

        @NameInMap("browser_headers")
        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonBrowserHeaders browserHeaders;

        @NameInMap("browser_hosts")
        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonBrowserHosts browserHosts;

        @NameInMap("browser_info")
        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonBrowserInfo browserInfo;

        /**
         * <p>Indicates whether certificate errors are ignored. Valid values:</p>
         * <ul>
         * <li>false: Certificate errors are not ignored.</li>
         * <li>true: Certificate errors are ignored.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("browser_insecure")
        public Boolean browserInsecure;

        /**
         * <p>The version of the browser test task. Valid values:</p>
         * <ul>
         * <li>1: browser test for a single page</li>
         * <li>2: browser test for multiple pages</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("browser_task_version")
        public String browserTaskVersion;

        @NameInMap("config_variables")
        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonConfigVariables configVariables;

        /**
         * <p>The cookie of the HTTP request.</p>
         * 
         * <strong>example:</strong>
         * <p>lang=en</p>
         */
        @NameInMap("cookie")
        public String cookie;

        /**
         * <p>Indicates whether the automatic MTR diagnostics feature is enabled for a failed task. Valid values:</p>
         * <ul>
         * <li>false: The automatic MTR diagnostics feature is disabled for a failed task.</li>
         * <li>true: The automatic MTR diagnostics feature is enabled for a failed task.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("diagnosis_mtr")
        public Boolean diagnosisMtr;

        /**
         * <p>Indicates whether the automatic ping latency detection feature is enabled for a failed task. Valid values:</p>
         * <ul>
         * <li>false: The automatic ping latency detection feature is disabled for a failed task.</li>
         * <li>true: The automatic ping latency detection feature is enabled for a failed task.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("diagnosis_ping")
        public Boolean diagnosisPing;

        /**
         * <p>The DNS hijack whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.taobao.com:www.taobao.com.danuoyi.tbcache.com">www.taobao.com:www.taobao.com.danuoyi.tbcache.com</a></p>
         */
        @NameInMap("dns_hijack_whitelist")
        public String dnsHijackWhitelist;

        /**
         * <p>The relationship between the list of expected aliases or IP addresses and the list of DNS results. Valid values:</p>
         * <ul>
         * <li>IN_DNS: The list of expected values is a subset of the list of DNS results.</li>
         * <li>DNS_IN: The list of DNS results is a subset of the list of expected values.</li>
         * <li>EQUAL: The list of DNS results is the same as the list of expected values.</li>
         * <li>ANY: The list of DNS results intersects with the list of expected values.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IN_DNS</p>
         */
        @NameInMap("dns_match_rule")
        public String dnsMatchRule;

        /**
         * <p>The IP address of the DNS server.</p>
         * <blockquote>
         * <p> This parameter is returned only if the TaskType parameter is set to DNS.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("dns_server")
        public String dnsServer;

        /**
         * <p>The type of the DNS record. This parameter is returned only if the TaskType parameter is set to DNS. Valid values:</p>
         * <ul>
         * <li>A (default): a record that specifies an IP address related to the specified host name or domain name.</li>
         * <li>CNAME: a record that maps multiple domain names to a domain name.</li>
         * <li>NS: a record that specifies a DNS server used to parse domain names.</li>
         * <li>MX: a record that links domain names to the address of a mail server.</li>
         * <li>TXT: a record that stores the text information of host name or domain names. The text must be 1 to 512 bytes in length. The TXT record serves as a Sender Policy Framework (SPF) record to fight against spam.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>A</p>
         */
        @NameInMap("dns_type")
        public String dnsType;

        /**
         * <p>Indicates whether the WebSocket task is allowed to return no response or return an empty response. Default value: false. Valid values: false and true.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("empty_message")
        public Boolean emptyMessage;

        @NameInMap("enable_packet_capture")
        public Boolean enablePacketCapture;

        @NameInMap("expect_exist_string")
        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonExpectExistString expectExistString;

        @NameInMap("expect_non_exist_string")
        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonExpectNonExistString expectNonExistString;

        /**
         * <p>The domain name or alias to be parsed.</p>
         * <blockquote>
         * <p> This parameter is returned only if the TaskType parameter is set to DNS.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>dns_server</p>
         */
        @NameInMap("expect_value")
        public String expectValue;

        /**
         * <p>The packet loss rate.</p>
         * <blockquote>
         * <p> This parameter is returned only if the TaskType parameter is set to PING.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0.4</p>
         */
        @NameInMap("failure_rate")
        public Float failureRate;

        /**
         * <p>The header of the HTTP request.</p>
         * 
         * <strong>example:</strong>
         * <p>testKey:testValue</p>
         */
        @NameInMap("header")
        public String header;

        /**
         * <p>The number of hops to perform traceroute diagnostics if the PING task fails.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("hops")
        public Integer hops;

        /**
         * <p>The custom hosts for the HTTP test task. Format: ip1,ip2:address. You can specify values in multiple lines. Specify the A record or CNAME record that can be resolved by the domain name at the left of the colon. Separate multiple records with commas (,). Specify the domain name at the right of the colon.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1:<a href="http://www.aliyun.com">www.aliyun.com</a></p>
         */
        @NameInMap("host_binding")
        public String hostBinding;

        /**
         * <p>The host binding type. Valid values: 0 and 1. 0 indicates random. 1 indicates polling.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("host_binding_type")
        public Integer hostBindingType;

        /**
         * <p>The HTTP request method. Valid values:</p>
         * <ul>
         * <li>get</li>
         * <li>post</li>
         * <li>head</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>get</p>
         */
        @NameInMap("http_method")
        public String httpMethod;

        /**
         * <p>The timeout period of a PING task that uses ICMP. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3000</p>
         */
        @NameInMap("icmp_timeout_millis")
        public Integer icmpTimeoutMillis;

        /**
         * <p>ip_network indicates the network type of the task. Valid values: v4, v6, and auto. Default value: v4.</p>
         * 
         * <strong>example:</strong>
         * <p>v4</p>
         */
        @NameInMap("ip_network")
        public String ipNetwork;

        /**
         * <p>Indicates whether to perform Base64 decoding and then store the password. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isBase64Encode")
        public String isBase64Encode;

        /**
         * <p>Indicates whether the alert rule is included. Valid values:</p>
         * <ul>
         * <li>0: The alert rule is included.</li>
         * <li>1: The alert rule is excluded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("match_rule")
        public Integer matchRule;

        @NameInMap("max_tls_version")
        public String maxTlsVersion;

        /**
         * <p>The minimum TLS version. By default, TLS 1.2 and later versions are supported. TLS 1.0 and 1.1 are disabled. If you still require TLS 1.0 or 1.1, you can change the configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>tlsv1.2</p>
         */
        @NameInMap("min_tls_version")
        public String minTlsVersion;

        /**
         * <p>The password of the SMTP, POP3, or FTP protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>123****</p>
         */
        @NameInMap("password")
        public String password;

        /**
         * <p>The heartbeat of the PING protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>29</p>
         */
        @NameInMap("ping_num")
        public Integer pingNum;

        /**
         * <p>The port number for TCP pings.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("ping_port")
        public Integer pingPort;

        /**
         * <p>The PING protocol type. Valid values:</p>
         * <ul>
         * <li>icmp</li>
         * <li>tcp</li>
         * <li>udp</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>icmp,tcp,udp</p>
         */
        @NameInMap("ping_type")
        public String pingType;

        /**
         * <p>The port number of the TCP, UDP, SMTP, or POP3 protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>110</p>
         */
        @NameInMap("port")
        public Integer port;

        /**
         * <strong>example:</strong>
         * <p>cert.pem</p>
         */
        @NameInMap("private_crt_file_name")
        public String privateCrtFileName;

        /**
         * <p>The protocol that is used to send the request.</p>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>Indicates whether the Quick UDP Internet Connections (QUIC) protocol is used for browser detection. Valid values: true false Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("quic_enabled")
        public Boolean quicEnabled;

        @NameInMap("quic_target")
        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonQuicTarget quicTarget;

        /**
         * <p>The content of the HTTP request.</p>
         * 
         * <strong>example:</strong>
         * <p>aa=bb</p>
         */
        @NameInMap("request_content")
        public String requestContent;

        /**
         * <p>The format of the HTTP request. Valid values:</p>
         * <ul>
         * <li>hex: hexadecimal</li>
         * <li>txt: text</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>txt</p>
         */
        @NameInMap("request_format")
        public String requestFormat;

        /**
         * <p>The response to the HTTP request.</p>
         * 
         * <strong>example:</strong>
         * <p>txt</p>
         */
        @NameInMap("response_content")
        public String responseContent;

        /**
         * <p>The format of the HTTP response. Valid values:</p>
         * <ul>
         * <li>hex: hexadecimal</li>
         * <li>txt: text</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>txt</p>
         */
        @NameInMap("response_format")
        public String responseFormat;

        /**
         * <p>The number of retries for failed detections.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("retry_delay")
        public Integer retryDelay;

        @NameInMap("safe_link")
        public Integer safeLink;

        /**
         * <p>Indicates whether page screenshot is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("screen_shot")
        public Boolean screenShot;

        /**
         * <p>Indicates whether to scroll to the bottom of the page after opening the page. This parameter is valid for a browser test task.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("scroll_end")
        public Boolean scrollEnd;

        @NameInMap("server_name")
        public String serverName;

        @NameInMap("steps")
        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonSteps steps;

        /**
         * <p>Indicates whether to allow the loading failures of some page elements. Valid values: false and true.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("strict_mode")
        public Boolean strictMode;

        @NameInMap("supported_cipher_suits")
        public String supportedCipherSuits;

        /**
         * <p>The timeout period. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("time_out")
        public Long timeOut;

        @NameInMap("trace_region")
        public String traceRegion;

        @NameInMap("trace_type")
        public String traceType;

        @NameInMap("traffic_hijack_element_blacklist")
        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonTrafficHijackElementBlacklist trafficHijackElementBlacklist;

        /**
         * <p>When redirection occurs, if the browser loads more than the specified number of resources, traffic hijacking is considered to have occurred. If you set the value to 0, no validation is performed. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("traffic_hijack_element_count")
        public Integer trafficHijackElementCount;

        @NameInMap("traffic_hijack_element_whitelist")
        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonTrafficHijackElementWhitelist trafficHijackElementWhitelist;

        @NameInMap("use_private_crt")
        public Boolean usePrivateCrt;

        @NameInMap("use_ssl")
        public Boolean useSsl;

        /**
         * <p>The username of the FTP, SMTP, or POP3 protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>testUser</p>
         */
        @NameInMap("username")
        public String username;

        /**
         * <p>The additional waiting time after a page is opened in a browser test task.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("waitTime_after_completion")
        public Integer waitTimeAfterCompletion;

        public static DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson self = new DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson();
            return TeaModel.build(map, self);
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setAssertions(DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAssertions assertions) {
            this.assertions = assertions;
            return this;
        }
        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAssertions getAssertions() {
            return this.assertions;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setAttempts(Long attempts) {
            this.attempts = attempts;
            return this;
        }
        public Long getAttempts() {
            return this.attempts;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setAuthInfo(DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAuthInfo authInfo) {
            this.authInfo = authInfo;
            return this;
        }
        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonAuthInfo getAuthInfo() {
            return this.authInfo;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setBlockedUrlList(DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonBlockedUrlList blockedUrlList) {
            this.blockedUrlList = blockedUrlList;
            return this;
        }
        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonBlockedUrlList getBlockedUrlList() {
            return this.blockedUrlList;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setBrowserHeaders(DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonBrowserHeaders browserHeaders) {
            this.browserHeaders = browserHeaders;
            return this;
        }
        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonBrowserHeaders getBrowserHeaders() {
            return this.browserHeaders;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setBrowserHosts(DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonBrowserHosts browserHosts) {
            this.browserHosts = browserHosts;
            return this;
        }
        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonBrowserHosts getBrowserHosts() {
            return this.browserHosts;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setBrowserInfo(DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonBrowserInfo browserInfo) {
            this.browserInfo = browserInfo;
            return this;
        }
        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonBrowserInfo getBrowserInfo() {
            return this.browserInfo;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setBrowserInsecure(Boolean browserInsecure) {
            this.browserInsecure = browserInsecure;
            return this;
        }
        public Boolean getBrowserInsecure() {
            return this.browserInsecure;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setBrowserTaskVersion(String browserTaskVersion) {
            this.browserTaskVersion = browserTaskVersion;
            return this;
        }
        public String getBrowserTaskVersion() {
            return this.browserTaskVersion;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setConfigVariables(DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonConfigVariables configVariables) {
            this.configVariables = configVariables;
            return this;
        }
        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonConfigVariables getConfigVariables() {
            return this.configVariables;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setCookie(String cookie) {
            this.cookie = cookie;
            return this;
        }
        public String getCookie() {
            return this.cookie;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setDiagnosisMtr(Boolean diagnosisMtr) {
            this.diagnosisMtr = diagnosisMtr;
            return this;
        }
        public Boolean getDiagnosisMtr() {
            return this.diagnosisMtr;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setDiagnosisPing(Boolean diagnosisPing) {
            this.diagnosisPing = diagnosisPing;
            return this;
        }
        public Boolean getDiagnosisPing() {
            return this.diagnosisPing;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setDnsHijackWhitelist(String dnsHijackWhitelist) {
            this.dnsHijackWhitelist = dnsHijackWhitelist;
            return this;
        }
        public String getDnsHijackWhitelist() {
            return this.dnsHijackWhitelist;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setDnsMatchRule(String dnsMatchRule) {
            this.dnsMatchRule = dnsMatchRule;
            return this;
        }
        public String getDnsMatchRule() {
            return this.dnsMatchRule;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setDnsServer(String dnsServer) {
            this.dnsServer = dnsServer;
            return this;
        }
        public String getDnsServer() {
            return this.dnsServer;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setDnsType(String dnsType) {
            this.dnsType = dnsType;
            return this;
        }
        public String getDnsType() {
            return this.dnsType;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setEmptyMessage(Boolean emptyMessage) {
            this.emptyMessage = emptyMessage;
            return this;
        }
        public Boolean getEmptyMessage() {
            return this.emptyMessage;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setEnablePacketCapture(Boolean enablePacketCapture) {
            this.enablePacketCapture = enablePacketCapture;
            return this;
        }
        public Boolean getEnablePacketCapture() {
            return this.enablePacketCapture;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setExpectExistString(DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonExpectExistString expectExistString) {
            this.expectExistString = expectExistString;
            return this;
        }
        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonExpectExistString getExpectExistString() {
            return this.expectExistString;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setExpectNonExistString(DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonExpectNonExistString expectNonExistString) {
            this.expectNonExistString = expectNonExistString;
            return this;
        }
        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonExpectNonExistString getExpectNonExistString() {
            return this.expectNonExistString;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setExpectValue(String expectValue) {
            this.expectValue = expectValue;
            return this;
        }
        public String getExpectValue() {
            return this.expectValue;
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

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setHops(Integer hops) {
            this.hops = hops;
            return this;
        }
        public Integer getHops() {
            return this.hops;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setHostBinding(String hostBinding) {
            this.hostBinding = hostBinding;
            return this;
        }
        public String getHostBinding() {
            return this.hostBinding;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setHostBindingType(Integer hostBindingType) {
            this.hostBindingType = hostBindingType;
            return this;
        }
        public Integer getHostBindingType() {
            return this.hostBindingType;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setHttpMethod(String httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }
        public String getHttpMethod() {
            return this.httpMethod;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setIcmpTimeoutMillis(Integer icmpTimeoutMillis) {
            this.icmpTimeoutMillis = icmpTimeoutMillis;
            return this;
        }
        public Integer getIcmpTimeoutMillis() {
            return this.icmpTimeoutMillis;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setIpNetwork(String ipNetwork) {
            this.ipNetwork = ipNetwork;
            return this;
        }
        public String getIpNetwork() {
            return this.ipNetwork;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setIsBase64Encode(String isBase64Encode) {
            this.isBase64Encode = isBase64Encode;
            return this;
        }
        public String getIsBase64Encode() {
            return this.isBase64Encode;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setMatchRule(Integer matchRule) {
            this.matchRule = matchRule;
            return this;
        }
        public Integer getMatchRule() {
            return this.matchRule;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setMaxTlsVersion(String maxTlsVersion) {
            this.maxTlsVersion = maxTlsVersion;
            return this;
        }
        public String getMaxTlsVersion() {
            return this.maxTlsVersion;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setMinTlsVersion(String minTlsVersion) {
            this.minTlsVersion = minTlsVersion;
            return this;
        }
        public String getMinTlsVersion() {
            return this.minTlsVersion;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setPingNum(Integer pingNum) {
            this.pingNum = pingNum;
            return this;
        }
        public Integer getPingNum() {
            return this.pingNum;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setPingPort(Integer pingPort) {
            this.pingPort = pingPort;
            return this;
        }
        public Integer getPingPort() {
            return this.pingPort;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setPingType(String pingType) {
            this.pingType = pingType;
            return this;
        }
        public String getPingType() {
            return this.pingType;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setPrivateCrtFileName(String privateCrtFileName) {
            this.privateCrtFileName = privateCrtFileName;
            return this;
        }
        public String getPrivateCrtFileName() {
            return this.privateCrtFileName;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setQuicEnabled(Boolean quicEnabled) {
            this.quicEnabled = quicEnabled;
            return this;
        }
        public Boolean getQuicEnabled() {
            return this.quicEnabled;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setQuicTarget(DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonQuicTarget quicTarget) {
            this.quicTarget = quicTarget;
            return this;
        }
        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonQuicTarget getQuicTarget() {
            return this.quicTarget;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setRequestContent(String requestContent) {
            this.requestContent = requestContent;
            return this;
        }
        public String getRequestContent() {
            return this.requestContent;
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

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setResponseFormat(String responseFormat) {
            this.responseFormat = responseFormat;
            return this;
        }
        public String getResponseFormat() {
            return this.responseFormat;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setRetryDelay(Integer retryDelay) {
            this.retryDelay = retryDelay;
            return this;
        }
        public Integer getRetryDelay() {
            return this.retryDelay;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setSafeLink(Integer safeLink) {
            this.safeLink = safeLink;
            return this;
        }
        public Integer getSafeLink() {
            return this.safeLink;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setScreenShot(Boolean screenShot) {
            this.screenShot = screenShot;
            return this;
        }
        public Boolean getScreenShot() {
            return this.screenShot;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setScrollEnd(Boolean scrollEnd) {
            this.scrollEnd = scrollEnd;
            return this;
        }
        public Boolean getScrollEnd() {
            return this.scrollEnd;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setServerName(String serverName) {
            this.serverName = serverName;
            return this;
        }
        public String getServerName() {
            return this.serverName;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setSteps(DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonSteps steps) {
            this.steps = steps;
            return this;
        }
        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonSteps getSteps() {
            return this.steps;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setStrictMode(Boolean strictMode) {
            this.strictMode = strictMode;
            return this;
        }
        public Boolean getStrictMode() {
            return this.strictMode;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setSupportedCipherSuits(String supportedCipherSuits) {
            this.supportedCipherSuits = supportedCipherSuits;
            return this;
        }
        public String getSupportedCipherSuits() {
            return this.supportedCipherSuits;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setTimeOut(Long timeOut) {
            this.timeOut = timeOut;
            return this;
        }
        public Long getTimeOut() {
            return this.timeOut;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setTraceRegion(String traceRegion) {
            this.traceRegion = traceRegion;
            return this;
        }
        public String getTraceRegion() {
            return this.traceRegion;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setTraceType(String traceType) {
            this.traceType = traceType;
            return this;
        }
        public String getTraceType() {
            return this.traceType;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setTrafficHijackElementBlacklist(DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonTrafficHijackElementBlacklist trafficHijackElementBlacklist) {
            this.trafficHijackElementBlacklist = trafficHijackElementBlacklist;
            return this;
        }
        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonTrafficHijackElementBlacklist getTrafficHijackElementBlacklist() {
            return this.trafficHijackElementBlacklist;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setTrafficHijackElementCount(Integer trafficHijackElementCount) {
            this.trafficHijackElementCount = trafficHijackElementCount;
            return this;
        }
        public Integer getTrafficHijackElementCount() {
            return this.trafficHijackElementCount;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setTrafficHijackElementWhitelist(DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonTrafficHijackElementWhitelist trafficHijackElementWhitelist) {
            this.trafficHijackElementWhitelist = trafficHijackElementWhitelist;
            return this;
        }
        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJsonTrafficHijackElementWhitelist getTrafficHijackElementWhitelist() {
            return this.trafficHijackElementWhitelist;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setUsePrivateCrt(Boolean usePrivateCrt) {
            this.usePrivateCrt = usePrivateCrt;
            return this;
        }
        public Boolean getUsePrivateCrt() {
            return this.usePrivateCrt;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setUseSsl(Boolean useSsl) {
            this.useSsl = useSsl;
            return this;
        }
        public Boolean getUseSsl() {
            return this.useSsl;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson setWaitTimeAfterCompletion(Integer waitTimeAfterCompletion) {
            this.waitTimeAfterCompletion = waitTimeAfterCompletion;
            return this;
        }
        public Integer getWaitTimeAfterCompletion() {
            return this.waitTimeAfterCompletion;
        }

    }

    public static class DescribeSiteMonitorAttributeResponseBodySiteMonitorsVpcConfig extends TeaModel {
        /**
         * <p>The region of the website for synthetic monitoring.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The ID of the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-xxxxxx</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The ID of the VPC used by the synthetic test task.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-xxxxxx</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the vSwitch used by the synthetic test task.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-xxxxxx</p>
         */
        @NameInMap("VswitchId")
        public String vswitchId;

        public static DescribeSiteMonitorAttributeResponseBodySiteMonitorsVpcConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorAttributeResponseBodySiteMonitorsVpcConfig self = new DescribeSiteMonitorAttributeResponseBodySiteMonitorsVpcConfig();
            return TeaModel.build(map, self);
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsVpcConfig setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsVpcConfig setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsVpcConfig setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsVpcConfig setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

    }

    public static class DescribeSiteMonitorAttributeResponseBodySiteMonitors extends TeaModel {
        /**
         * <p>The URL that is monitored by the site monitoring task.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://aliyun.com">https://aliyun.com</a></p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The type of the detection point. Default value: PC. Valid values:</p>
         * <ul>
         * <li>PC</li>
         * <li>MOBILE</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PC</p>
         */
        @NameInMap("AgentGroup")
        public String agentGroup;

        /**
         * <p>The custom detection cycle. You can specify only a time range within a week (from Monday to Sunday).</p>
         */
        @NameInMap("CustomSchedule")
        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsCustomSchedule customSchedule;

        /**
         * <p>The interval at which the site monitoring task is executed. Unit: minutes. Valid values: 1, 5, 15, 30, and 60.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Interval")
        public String interval;

        @NameInMap("IspCities")
        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsIspCities ispCities;

        /**
         * <p>The extended options of the site monitoring task. The options vary based on the specified protocol. For more information, see <a href="https://help.aliyun.com/document_detail/115048.html">CreateSiteMonitor</a>.</p>
         */
        @NameInMap("OptionJson")
        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsOptionJson optionJson;

        /**
         * <p>The ID of the site monitoring task.</p>
         * 
         * <strong>example:</strong>
         * <p>cc641dff-c19d-45f3-ad0a-818a0c4f****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The name of the site monitoring task.</p>
         * 
         * <strong>example:</strong>
         * <p>test123</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The status of the site monitoring task. Valid values:</p>
         * <ul>
         * <li>1: The task is enabled.</li>
         * <li>2: The task is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TaskState")
        public String taskState;

        /**
         * <p>The protocol that is used by the site monitoring task. Valid values: HTTP, HTTPS, PING, TCP, UDP, DNS, SMTP, POP3, and FTP.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <p>The VPC configurations of the synthetic test task.</p>
         */
        @NameInMap("VpcConfig")
        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsVpcConfig vpcConfig;

        public static DescribeSiteMonitorAttributeResponseBodySiteMonitors build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorAttributeResponseBodySiteMonitors self = new DescribeSiteMonitorAttributeResponseBodySiteMonitors();
            return TeaModel.build(map, self);
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitors setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitors setAgentGroup(String agentGroup) {
            this.agentGroup = agentGroup;
            return this;
        }
        public String getAgentGroup() {
            return this.agentGroup;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitors setCustomSchedule(DescribeSiteMonitorAttributeResponseBodySiteMonitorsCustomSchedule customSchedule) {
            this.customSchedule = customSchedule;
            return this;
        }
        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsCustomSchedule getCustomSchedule() {
            return this.customSchedule;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitors setInterval(String interval) {
            this.interval = interval;
            return this;
        }
        public String getInterval() {
            return this.interval;
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

        public DescribeSiteMonitorAttributeResponseBodySiteMonitors setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitors setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitors setTaskState(String taskState) {
            this.taskState = taskState;
            return this;
        }
        public String getTaskState() {
            return this.taskState;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitors setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public DescribeSiteMonitorAttributeResponseBodySiteMonitors setVpcConfig(DescribeSiteMonitorAttributeResponseBodySiteMonitorsVpcConfig vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }
        public DescribeSiteMonitorAttributeResponseBodySiteMonitorsVpcConfig getVpcConfig() {
            return this.vpcConfig;
        }

    }

}
