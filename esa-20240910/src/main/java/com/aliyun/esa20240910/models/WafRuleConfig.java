// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class WafRuleConfig extends TeaModel {
    @NameInMap("Action")
    public String action;

    @NameInMap("Actions")
    public WafRuleConfigActions actions;

    @NameInMap("AppPackage")
    public WafRuleConfigAppPackage appPackage;

    @NameInMap("AppSdk")
    public WafRuleConfigAppSdk appSdk;

    @NameInMap("Expression")
    public String expression;

    @NameInMap("Id")
    public Long id;

    @NameInMap("ManagedGroupId")
    public Long managedGroupId;

    @NameInMap("ManagedList")
    public String managedList;

    @NameInMap("ManagedRulesets")
    public java.util.List<WafRuleConfigManagedRulesets> managedRulesets;

    @NameInMap("Match")
    public WafRuleMatch match;

    @NameInMap("Name")
    public String name;

    @NameInMap("Notes")
    public String notes;

    @NameInMap("RateLimit")
    public WafRuleConfigRateLimit rateLimit;

    @NameInMap("Sigchl")
    public java.util.List<String> sigchl;

    @NameInMap("Status")
    public String status;

    @NameInMap("Timer")
    public WafTimer timer;

    @NameInMap("Type")
    public String type;

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

    public WafRuleConfig setMatch(WafRuleMatch match) {
        this.match = match;
        return this;
    }
    public WafRuleMatch getMatch() {
        return this.match;
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
        @NameInMap("CustomRules")
        public java.util.List<Long> customRules;

        @NameInMap("RegularRules")
        public java.util.List<Long> regularRules;

        @NameInMap("RegularTypes")
        public java.util.List<String> regularTypes;

        @NameInMap("Skip")
        public String skip;

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
        @NameInMap("Code")
        public Integer code;

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
        @NameInMap("Bypass")
        public WafRuleConfigActionsBypass bypass;

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
        @NameInMap("Name")
        public String name;

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
        @NameInMap("Key")
        public String key;

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
        @NameInMap("CustomSign")
        public WafRuleConfigAppSdkCustomSign customSign;

        @NameInMap("CustomSignStatus")
        public String customSignStatus;

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
        @NameInMap("Action")
        public String action;

        @NameInMap("Id")
        public Long id;

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
        @NameInMap("Action")
        public String action;

        @NameInMap("AttackType")
        public Integer attackType;

        @NameInMap("ManagedRules")
        public java.util.List<WafRuleConfigManagedRulesetsManagedRules> managedRules;

        @NameInMap("NumberEnabled")
        public Integer numberEnabled;

        @NameInMap("NumberTotal")
        public Integer numberTotal;

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
        @NameInMap("Code")
        public Integer code;

        @NameInMap("Count")
        public Integer count;

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
        @NameInMap("DistinctManagedRules")
        public Integer distinctManagedRules;

        @NameInMap("ManagedRulesBlocked")
        public Integer managedRulesBlocked;

        @NameInMap("Request")
        public Integer request;

        @NameInMap("ResponseStatus")
        public WafRuleConfigRateLimitThresholdResponseStatus responseStatus;

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
        @NameInMap("Characteristics")
        public WafRuleMatch2 characteristics;

        @NameInMap("Interval")
        public Integer interval;

        @NameInMap("OnHit")
        public Boolean onHit;

        @NameInMap("TTL")
        public Integer TTL;

        @NameInMap("Threshold")
        public WafRuleConfigRateLimitThreshold threshold;

        public static WafRuleConfigRateLimit build(java.util.Map<String, ?> map) throws Exception {
            WafRuleConfigRateLimit self = new WafRuleConfigRateLimit();
            return TeaModel.build(map, self);
        }

        public WafRuleConfigRateLimit setCharacteristics(WafRuleMatch2 characteristics) {
            this.characteristics = characteristics;
            return this;
        }
        public WafRuleMatch2 getCharacteristics() {
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

}
