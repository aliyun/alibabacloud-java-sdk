// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class WafRuleConfig extends TeaModel {
    /**
     * <p>The operation to perform after the WAF rule is matched.</p>
     * 
     * <strong>example:</strong>
     * <p>deny</p>
     */
    @NameInMap("Action")
    public String action;

    /**
     * <p>The extended action configurations.</p>
     */
    @NameInMap("Actions")
    public WafRuleConfigActions actions;

    /**
     * <p>The configuration of secondary package detection.</p>
     */
    @NameInMap("AppPackage")
    public WafRuleConfigAppPackage appPackage;

    /**
     * <p>The SDK configuration for apps.</p>
     */
    @NameInMap("AppSdk")
    public WafRuleConfigAppSdk appSdk;

    /**
     * <p>The match expression.</p>
     * 
     * <strong>example:</strong>
     * <p>ip.src eq 1.1.1.1</p>
     */
    @NameInMap("Expression")
    public String expression;

    /**
     * <p>The ID of the WAF rule.</p>
     * 
     * <strong>example:</strong>
     * <p>20000001</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The ID of the managed rule group, which is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>30000001</p>
     */
    @NameInMap("ManagedGroupId")
    public Long managedGroupId;

    /**
     * <p>The managed list.</p>
     * 
     * <strong>example:</strong>
     * <p>intelligence_crawler</p>
     */
    @NameInMap("ManagedList")
    public String managedList;

    /**
     * <p>The managed rulesets.</p>
     */
    @NameInMap("ManagedRulesets")
    public java.util.List<WafRuleConfigManagedRulesets> managedRulesets;

    /**
     * <p>The name of the WAF rule.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>example notes</p>
     */
    @NameInMap("Notes")
    public String notes;

    /**
     * <p>The configuration of the rate limiting rule.</p>
     */
    @NameInMap("RateLimit")
    public WafRuleConfigRateLimit rateLimit;

    /**
     * <p>The security level.</p>
     */
    @NameInMap("SecurityLevel")
    public WafRuleConfigSecurityLevel securityLevel;

    /**
     * <p>The token verification configurations.</p>
     */
    @NameInMap("Sigchl")
    public java.util.List<String> sigchl;

    /**
     * <p>The status of the WAF rule.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The timer.</p>
     */
    @NameInMap("Timer")
    public WafTimer timer;

    /**
     * <p>The name of the WAF rule.</p>
     * 
     * <strong>example:</strong>
     * <p>http_custom</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>Defines whether the IP can access.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.1</p>
     */
    @NameInMap("Value")
    public String value;

    public static WafRuleConfig build(java.util.Map<String, ?> map) throws Exception {
        WafRuleConfig self = new WafRuleConfig();
        return TeaModel.build(map, self);
    }

    public WafRuleConfig setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public WafRuleConfig setActions(WafRuleConfigActions actions) {
        this.actions = actions;
        return this;
    }
    public WafRuleConfigActions getActions() {
        return this.actions;
    }

    public WafRuleConfig setAppPackage(WafRuleConfigAppPackage appPackage) {
        this.appPackage = appPackage;
        return this;
    }
    public WafRuleConfigAppPackage getAppPackage() {
        return this.appPackage;
    }

    public WafRuleConfig setAppSdk(WafRuleConfigAppSdk appSdk) {
        this.appSdk = appSdk;
        return this;
    }
    public WafRuleConfigAppSdk getAppSdk() {
        return this.appSdk;
    }

    public WafRuleConfig setExpression(String expression) {
        this.expression = expression;
        return this;
    }
    public String getExpression() {
        return this.expression;
    }

    public WafRuleConfig setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public WafRuleConfig setManagedGroupId(Long managedGroupId) {
        this.managedGroupId = managedGroupId;
        return this;
    }
    public Long getManagedGroupId() {
        return this.managedGroupId;
    }

    public WafRuleConfig setManagedList(String managedList) {
        this.managedList = managedList;
        return this;
    }
    public String getManagedList() {
        return this.managedList;
    }

    public WafRuleConfig setManagedRulesets(java.util.List<WafRuleConfigManagedRulesets> managedRulesets) {
        this.managedRulesets = managedRulesets;
        return this;
    }
    public java.util.List<WafRuleConfigManagedRulesets> getManagedRulesets() {
        return this.managedRulesets;
    }

    public WafRuleConfig setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public WafRuleConfig setNotes(String notes) {
        this.notes = notes;
        return this;
    }
    public String getNotes() {
        return this.notes;
    }

    public WafRuleConfig setRateLimit(WafRuleConfigRateLimit rateLimit) {
        this.rateLimit = rateLimit;
        return this;
    }
    public WafRuleConfigRateLimit getRateLimit() {
        return this.rateLimit;
    }

    public WafRuleConfig setSecurityLevel(WafRuleConfigSecurityLevel securityLevel) {
        this.securityLevel = securityLevel;
        return this;
    }
    public WafRuleConfigSecurityLevel getSecurityLevel() {
        return this.securityLevel;
    }

    public WafRuleConfig setSigchl(java.util.List<String> sigchl) {
        this.sigchl = sigchl;
        return this;
    }
    public java.util.List<String> getSigchl() {
        return this.sigchl;
    }

    public WafRuleConfig setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public WafRuleConfig setTimer(WafTimer timer) {
        this.timer = timer;
        return this;
    }
    public WafTimer getTimer() {
        return this.timer;
    }

    public WafRuleConfig setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public WafRuleConfig setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public static class WafRuleConfigActionsBypass extends TeaModel {
        /**
         * <p>The IDs of custom rules.</p>
         */
        @NameInMap("CustomRules")
        public java.util.List<Long> customRules;

        /**
         * <p>The IDs of managed rules.</p>
         */
        @NameInMap("RegularRules")
        public java.util.List<Long> regularRules;

        /**
         * <p>The types of managed rules.</p>
         */
        @NameInMap("RegularTypes")
        public java.util.List<String> regularTypes;

        /**
         * <p>The skip scope applied when requests match conditions defined in the whitelist rule.</p>
         * 
         * <strong>example:</strong>
         * <p>part</p>
         */
        @NameInMap("Skip")
        public String skip;

        /**
         * <p>The skipped rule categories when requests match conditions defined in the whitelist rule.</p>
         */
        @NameInMap("Tags")
        public java.util.List<String> tags;

        public static WafRuleConfigActionsBypass build(java.util.Map<String, ?> map) throws Exception {
            WafRuleConfigActionsBypass self = new WafRuleConfigActionsBypass();
            return TeaModel.build(map, self);
        }

        public WafRuleConfigActionsBypass setCustomRules(java.util.List<Long> customRules) {
            this.customRules = customRules;
            return this;
        }
        public java.util.List<Long> getCustomRules() {
            return this.customRules;
        }

        public WafRuleConfigActionsBypass setRegularRules(java.util.List<Long> regularRules) {
            this.regularRules = regularRules;
            return this;
        }
        public java.util.List<Long> getRegularRules() {
            return this.regularRules;
        }

        public WafRuleConfigActionsBypass setRegularTypes(java.util.List<String> regularTypes) {
            this.regularTypes = regularTypes;
            return this;
        }
        public java.util.List<String> getRegularTypes() {
            return this.regularTypes;
        }

        public WafRuleConfigActionsBypass setSkip(String skip) {
            this.skip = skip;
            return this;
        }
        public String getSkip() {
            return this.skip;
        }

        public WafRuleConfigActionsBypass setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

    }

    public static class WafRuleConfigActionsResponse extends TeaModel {
        /**
         * <p>The custom response code.</p>
         * 
         * <strong>example:</strong>
         * <p>403</p>
         */
        @NameInMap("Code")
        public Integer code;

        /**
         * <p>The ID of the custom error page, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850223.html">ListPages</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>50000001</p>
         */
        @NameInMap("Id")
        public Long id;

        public static WafRuleConfigActionsResponse build(java.util.Map<String, ?> map) throws Exception {
            WafRuleConfigActionsResponse self = new WafRuleConfigActionsResponse();
            return TeaModel.build(map, self);
        }

        public WafRuleConfigActionsResponse setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public WafRuleConfigActionsResponse setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class WafRuleConfigActions extends TeaModel {
        /**
         * <p>The skip configuration specified by the whitelist rule.</p>
         */
        @NameInMap("Bypass")
        public WafRuleConfigActionsBypass bypass;

        /**
         * <p>The custom error page.</p>
         */
        @NameInMap("Response")
        public WafRuleConfigActionsResponse response;

        public static WafRuleConfigActions build(java.util.Map<String, ?> map) throws Exception {
            WafRuleConfigActions self = new WafRuleConfigActions();
            return TeaModel.build(map, self);
        }

        public WafRuleConfigActions setBypass(WafRuleConfigActionsBypass bypass) {
            this.bypass = bypass;
            return this;
        }
        public WafRuleConfigActionsBypass getBypass() {
            return this.bypass;
        }

        public WafRuleConfigActions setResponse(WafRuleConfigActionsResponse response) {
            this.response = response;
            return this;
        }
        public WafRuleConfigActionsResponse getResponse() {
            return this.response;
        }

    }

    public static class WafRuleConfigAppPackagePackageSigns extends TeaModel {
        /**
         * <p>The valid package name.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The valid package signature.</p>
         * 
         * <strong>example:</strong>
         * <p>sign</p>
         */
        @NameInMap("Sign")
        public String sign;

        public static WafRuleConfigAppPackagePackageSigns build(java.util.Map<String, ?> map) throws Exception {
            WafRuleConfigAppPackagePackageSigns self = new WafRuleConfigAppPackagePackageSigns();
            return TeaModel.build(map, self);
        }

        public WafRuleConfigAppPackagePackageSigns setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public WafRuleConfigAppPackagePackageSigns setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

    }

    public static class WafRuleConfigAppPackage extends TeaModel {
        /**
         * <p>The package signatures.</p>
         */
        @NameInMap("PackageSigns")
        public java.util.List<WafRuleConfigAppPackagePackageSigns> packageSigns;

        public static WafRuleConfigAppPackage build(java.util.Map<String, ?> map) throws Exception {
            WafRuleConfigAppPackage self = new WafRuleConfigAppPackage();
            return TeaModel.build(map, self);
        }

        public WafRuleConfigAppPackage setPackageSigns(java.util.List<WafRuleConfigAppPackagePackageSigns> packageSigns) {
            this.packageSigns = packageSigns;
            return this;
        }
        public java.util.List<WafRuleConfigAppPackagePackageSigns> getPackageSigns() {
            return this.packageSigns;
        }

    }

    public static class WafRuleConfigAppSdkCustomSign extends TeaModel {
        /**
         * <p>The field name.</p>
         * 
         * <strong>example:</strong>
         * <p>sign</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The field value.</p>
         * 
         * <strong>example:</strong>
         * <p>examplesignvalue</p>
         */
        @NameInMap("Value")
        public String value;

        public static WafRuleConfigAppSdkCustomSign build(java.util.Map<String, ?> map) throws Exception {
            WafRuleConfigAppSdkCustomSign self = new WafRuleConfigAppSdkCustomSign();
            return TeaModel.build(map, self);
        }

        public WafRuleConfigAppSdkCustomSign setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public WafRuleConfigAppSdkCustomSign setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class WafRuleConfigAppSdk extends TeaModel {
        /**
         * <p>The custom signature field.</p>
         */
        @NameInMap("CustomSign")
        public WafRuleConfigAppSdkCustomSign customSign;

        /**
         * <p>Indicates whether to configure the custom signature field.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("CustomSignStatus")
        public String customSignStatus;

        /**
         * <p>The app anomalies.</p>
         */
        @NameInMap("FeatureAbnormal")
        public java.util.List<String> featureAbnormal;

        public static WafRuleConfigAppSdk build(java.util.Map<String, ?> map) throws Exception {
            WafRuleConfigAppSdk self = new WafRuleConfigAppSdk();
            return TeaModel.build(map, self);
        }

        public WafRuleConfigAppSdk setCustomSign(WafRuleConfigAppSdkCustomSign customSign) {
            this.customSign = customSign;
            return this;
        }
        public WafRuleConfigAppSdkCustomSign getCustomSign() {
            return this.customSign;
        }

        public WafRuleConfigAppSdk setCustomSignStatus(String customSignStatus) {
            this.customSignStatus = customSignStatus;
            return this;
        }
        public String getCustomSignStatus() {
            return this.customSignStatus;
        }

        public WafRuleConfigAppSdk setFeatureAbnormal(java.util.List<String> featureAbnormal) {
            this.featureAbnormal = featureAbnormal;
            return this;
        }
        public java.util.List<String> getFeatureAbnormal() {
            return this.featureAbnormal;
        }

    }

    public static class WafRuleConfigManagedRulesetsManagedRules extends TeaModel {
        /**
         * <p>The action performed on requests that match the managed rule.</p>
         * 
         * <strong>example:</strong>
         * <p>deny</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The ID of the managed rule.</p>
         * 
         * <strong>example:</strong>
         * <p>100001</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The status of the managed rule.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Status")
        public String status;

        public static WafRuleConfigManagedRulesetsManagedRules build(java.util.Map<String, ?> map) throws Exception {
            WafRuleConfigManagedRulesetsManagedRules self = new WafRuleConfigManagedRulesetsManagedRules();
            return TeaModel.build(map, self);
        }

        public WafRuleConfigManagedRulesetsManagedRules setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public WafRuleConfigManagedRulesetsManagedRules setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public WafRuleConfigManagedRulesetsManagedRules setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class WafRuleConfigManagedRulesets extends TeaModel {
        /**
         * <p>The action.</p>
         * 
         * <strong>example:</strong>
         * <p>deny</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The attack type.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("AttackType")
        public Integer attackType;

        /**
         * <p>The managed rules.</p>
         */
        @NameInMap("ManagedRules")
        public java.util.List<WafRuleConfigManagedRulesetsManagedRules> managedRules;

        /**
         * <p>The number of enabled rules.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("NumberEnabled")
        public Integer numberEnabled;

        /**
         * <p>The total number of rules.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("NumberTotal")
        public Integer numberTotal;

        /**
         * <p>The protection level.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("ProtectionLevel")
        public Integer protectionLevel;

        public static WafRuleConfigManagedRulesets build(java.util.Map<String, ?> map) throws Exception {
            WafRuleConfigManagedRulesets self = new WafRuleConfigManagedRulesets();
            return TeaModel.build(map, self);
        }

        public WafRuleConfigManagedRulesets setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public WafRuleConfigManagedRulesets setAttackType(Integer attackType) {
            this.attackType = attackType;
            return this;
        }
        public Integer getAttackType() {
            return this.attackType;
        }

        public WafRuleConfigManagedRulesets setManagedRules(java.util.List<WafRuleConfigManagedRulesetsManagedRules> managedRules) {
            this.managedRules = managedRules;
            return this;
        }
        public java.util.List<WafRuleConfigManagedRulesetsManagedRules> getManagedRules() {
            return this.managedRules;
        }

        public WafRuleConfigManagedRulesets setNumberEnabled(Integer numberEnabled) {
            this.numberEnabled = numberEnabled;
            return this;
        }
        public Integer getNumberEnabled() {
            return this.numberEnabled;
        }

        public WafRuleConfigManagedRulesets setNumberTotal(Integer numberTotal) {
            this.numberTotal = numberTotal;
            return this;
        }
        public Integer getNumberTotal() {
            return this.numberTotal;
        }

        public WafRuleConfigManagedRulesets setProtectionLevel(Integer protectionLevel) {
            this.protectionLevel = protectionLevel;
            return this;
        }
        public Integer getProtectionLevel() {
            return this.protectionLevel;
        }

    }

    public static class WafRuleConfigRateLimitThresholdResponseStatus extends TeaModel {
        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>404</p>
         */
        @NameInMap("Code")
        public Integer code;

        /**
         * <p>The maximum number of times that the status code is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The percentage of the occurrences of the status code to total status codes.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Ratio")
        public Integer ratio;

        public static WafRuleConfigRateLimitThresholdResponseStatus build(java.util.Map<String, ?> map) throws Exception {
            WafRuleConfigRateLimitThresholdResponseStatus self = new WafRuleConfigRateLimitThresholdResponseStatus();
            return TeaModel.build(map, self);
        }

        public WafRuleConfigRateLimitThresholdResponseStatus setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public WafRuleConfigRateLimitThresholdResponseStatus setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public WafRuleConfigRateLimitThresholdResponseStatus setRatio(Integer ratio) {
            this.ratio = ratio;
            return this;
        }
        public Integer getRatio() {
            return this.ratio;
        }

    }

    public static class WafRuleConfigRateLimitThreshold extends TeaModel {
        /**
         * <p>The maximum number of managed rules that are triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("DistinctManagedRules")
        public Integer distinctManagedRules;

        /**
         * <p>The maximum number of times that the managed rule is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ManagedRulesBlocked")
        public Integer managedRulesBlocked;

        /**
         * <p>The request threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Request")
        public Integer request;

        /**
         * <p>The configuration of the status code threshold.</p>
         */
        @NameInMap("ResponseStatus")
        public WafRuleConfigRateLimitThresholdResponseStatus responseStatus;

        /**
         * <p>The traffic threshold, which is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>10Gb</p>
         */
        @NameInMap("Traffic")
        public String traffic;

        public static WafRuleConfigRateLimitThreshold build(java.util.Map<String, ?> map) throws Exception {
            WafRuleConfigRateLimitThreshold self = new WafRuleConfigRateLimitThreshold();
            return TeaModel.build(map, self);
        }

        public WafRuleConfigRateLimitThreshold setDistinctManagedRules(Integer distinctManagedRules) {
            this.distinctManagedRules = distinctManagedRules;
            return this;
        }
        public Integer getDistinctManagedRules() {
            return this.distinctManagedRules;
        }

        public WafRuleConfigRateLimitThreshold setManagedRulesBlocked(Integer managedRulesBlocked) {
            this.managedRulesBlocked = managedRulesBlocked;
            return this;
        }
        public Integer getManagedRulesBlocked() {
            return this.managedRulesBlocked;
        }

        public WafRuleConfigRateLimitThreshold setRequest(Integer request) {
            this.request = request;
            return this;
        }
        public Integer getRequest() {
            return this.request;
        }

        public WafRuleConfigRateLimitThreshold setResponseStatus(WafRuleConfigRateLimitThresholdResponseStatus responseStatus) {
            this.responseStatus = responseStatus;
            return this;
        }
        public WafRuleConfigRateLimitThresholdResponseStatus getResponseStatus() {
            return this.responseStatus;
        }

        public WafRuleConfigRateLimitThreshold setTraffic(String traffic) {
            this.traffic = traffic;
            return this;
        }
        public String getTraffic() {
            return this.traffic;
        }

    }

    public static class WafRuleConfigRateLimit extends TeaModel {
        /**
         * <p>The statistical objects to which the rule applies.</p>
         */
        @NameInMap("Characteristics")
        public WafRatelimitCharacteristics characteristics;

        /**
         * <p>The statistical interval.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>Indicates whether to apply the rule to requests that hit the cache.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("OnHit")
        public Boolean onHit;

        /**
         * <p>The timeout period for creating the stack.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TTL")
        public Integer TTL;

        /**
         * <p>The thresholds.</p>
         */
        @NameInMap("Threshold")
        public WafRuleConfigRateLimitThreshold threshold;

        public static WafRuleConfigRateLimit build(java.util.Map<String, ?> map) throws Exception {
            WafRuleConfigRateLimit self = new WafRuleConfigRateLimit();
            return TeaModel.build(map, self);
        }

        public WafRuleConfigRateLimit setCharacteristics(WafRatelimitCharacteristics characteristics) {
            this.characteristics = characteristics;
            return this;
        }
        public WafRatelimitCharacteristics getCharacteristics() {
            return this.characteristics;
        }

        public WafRuleConfigRateLimit setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public WafRuleConfigRateLimit setOnHit(Boolean onHit) {
            this.onHit = onHit;
            return this;
        }
        public Boolean getOnHit() {
            return this.onHit;
        }

        public WafRuleConfigRateLimit setTTL(Integer TTL) {
            this.TTL = TTL;
            return this;
        }
        public Integer getTTL() {
            return this.TTL;
        }

        public WafRuleConfigRateLimit setThreshold(WafRuleConfigRateLimitThreshold threshold) {
            this.threshold = threshold;
            return this;
        }
        public WafRuleConfigRateLimitThreshold getThreshold() {
            return this.threshold;
        }

    }

    public static class WafRuleConfigSecurityLevel extends TeaModel {
        /**
         * <p>Valid value:</p>
         * <ul>
         * <li>off</li>
         * <li>essentially_off</li>
         * <li>low</li>
         * <li>medium</li>
         * <li>high</li>
         * <li>under_attack</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>low</p>
         */
        @NameInMap("Value")
        public String value;

        public static WafRuleConfigSecurityLevel build(java.util.Map<String, ?> map) throws Exception {
            WafRuleConfigSecurityLevel self = new WafRuleConfigSecurityLevel();
            return TeaModel.build(map, self);
        }

        public WafRuleConfigSecurityLevel setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
